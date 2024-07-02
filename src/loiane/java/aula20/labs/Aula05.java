package loiane.java.aula20.labs;

import java.util.Scanner;

/*
Modifique o programa anterior de maneira a guardar os
compromissos do ano, organizados por mês, dia e hora
(só 8 horas por dia).
 */
public class Aula05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[][][] calendario = new String[12][31][8];
        int opcao;

        boolean sair = false;
        while(!sair){
            System.out.println("Digite 1 para adicionar compromisso ");
            System.out.println("Digite 2 para verificar compromisso ");
            System.out.println("Digite 0 para sair ");

            opcao = leitor.nextInt();

            if(opcao == 1) {
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mês");
                    mes = leitor.nextInt();
                    if (mes > 0 && mes < 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite o dia correto!");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = leitor.nextInt();
                    if (dia > 0 && dia < 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite o dia correto!");
                    }
                }

                boolean horaValido = false;
                int hora = 0;
                while (!horaValido) {
                    System.out.println("Entre com a hora do dia");
                    hora = leitor.nextInt();
                    if (hora > 0 && hora < 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite a hora correta!");
                    }
                }

                System.out.println("Digite o compromisso a ser adicionado:");
                calendario[mes][dia][hora] = leitor.next();

            } else if (opcao == 2){
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Entre com o mês");
                    mes = leitor.nextInt();
                    if (mes > 0 && mes < 12) {
                        mesValido = true;
                    } else {
                        System.out.println("Mês inválido, digite o dia correto!");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Digite o dia do compromisso a ser verificado:");
                    dia = leitor.nextInt();
                    if (dia > 0 && dia < 31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido!");
                    }

                }

                boolean horaValido = false;
                int hora = 0;
                while (!horaValido) {
                    System.out.println("Entre com a hora do dia");
                    hora = leitor.nextInt();
                    if (hora > 0 && hora < 8) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite a hora correta!");
                    }
                }

                System.out.println("No dia: " + mes + "/" + dia + " às " + hora + " horas você tem o seguinte compromisso:");
                System.out.println(calendario[mes][dia][hora]);

            }else if (opcao == 0) {
                System.out.println("Você escolheu sair!");
                sair = true;
            }


        }
    }
}

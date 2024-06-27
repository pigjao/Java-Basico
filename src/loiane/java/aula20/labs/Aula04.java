package loiane.java.aula20.labs;

/*
Faça um programa para armazenar em uma matriz os
compromissos de uma agenda pessoal. Cada dia do mês deve
conter 24 horas, onde para cada uma destas 24 horas podemos
associar um tarefa específica (compromisso agendado). O
programa deve ter um menu onde o usuário indica o dia do mês
que deseja alterar e a hora, entrando em seguida com o
compromisso, ou então, o usuário pode também consultar a
agenda, fornecendo o dia e a hora para obter o
compromisso armazenado.
 */

import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[][] calendario = new String[31][24];
        int opcao;

        boolean sair = false;
        while(!sair){
            System.out.println("Digite 1 para adicionar compromisso ");
            System.out.println("Digite 2 para verificar compromisso ");
            System.out.println("Digite 0 para sair ");

            opcao = leitor.nextInt();

            if(opcao == 1) {
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
                    if (hora > 0 && hora < 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválida, digite a hora correta!");
                    }
                }

                System.out.println("Digite o compromisso a ser adicionado:");
                calendario[dia][hora] = leitor.next();

            } else if (opcao == 2){
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

                boolean horaValida = false;
                int hora = 0;
                while(!horaValida){
                    System.out.println("Digite a hora do compromisso a ser verificado:");
                    hora = leitor.nextByte();
                    if (hora > 0 && hora < 24){
                        horaValida = true;
                    } else {
                        System.out.println("Dia inválido!");
                    }

                }

                System.out.println("No dia: " + dia + " às " + hora + " você tem o seguinte compromisso:");
                System.out.println(calendario[dia][hora]);

            }else if (opcao == 0) {
                System.out.println("Você escolheu sair!");
                sair = true;
            }


        }
    }
}






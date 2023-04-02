package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer012 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double ganhoPorHora = leitor.nextDouble();

        System.out.println("Quantas horas você trabalhou este mês?");
        int horasTrabalhadas = leitor.nextInt();

        double salarioBruto = ganhoPorHora * horasTrabalhadas;
        double salarioLiquido=0;
        double fgts = salarioBruto * 0.11;
        double inss = salarioBruto * 0.10;
        String porcentagemIR = null;
        double descontoIR =0;
        double descontosTotais=0;

        if (salarioBruto <= 900) {
            descontosTotais = inss;
            descontoIR = 0;
            salarioLiquido = salarioBruto - (salarioBruto * inss);
            porcentagemIR = " ( ISENTO ) ";
        }else if (salarioBruto > 900 && salarioBruto <= 1500){
            descontoIR = salarioBruto * 0.05;
            descontosTotais =  inss + descontoIR;
            salarioLiquido = salarioBruto - descontosTotais;
             porcentagemIR = " ( 5% ) ";
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.1;
            descontosTotais =  inss + descontoIR;
            salarioLiquido = salarioBruto - descontosTotais;
             porcentagemIR = " ( 10% ) ";
        } else if (salarioBruto > 2500) {
            descontoIR = salarioBruto * 0.2;
            descontosTotais =  inss + descontoIR;
            salarioLiquido = salarioBruto - descontosTotais;
             porcentagemIR = "( 20% )";
        }

        System.out.println("Salario bruto: R$" + salarioBruto );
        System.out.println(" ( - ) IR " + porcentagemIR + " : R$" + descontoIR);
        System.out.println(" ( - ) INSS  ( 10% ) :" + inss);
        System.out.println(" FGTS (11%) " + fgts);
        System.out.println("Total: de descontos: R$" + descontosTotais);
        System.out.println("Salário liquido: R$" + salarioLiquido);




    }
}

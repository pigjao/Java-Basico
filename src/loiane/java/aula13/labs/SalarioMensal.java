package loiane.java.aula13.labs;

import java.util.Scanner;

public class SalarioMensal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double ganhoPorHora = leitor.nextDouble();

        System.out.println("Quantas horas você trabalhou este mês?");
        int horasTrabalhadas = leitor.nextInt();

        double salarioDoMes = ganhoPorHora * horasTrabalhadas;
        System.out.println("Você ganhou: R$" + salarioDoMes + " Reais este mês!");

        double inss = salarioDoMes * 1.11 - salarioDoMes;
        double impostoRenda = salarioDoMes * 1.08 - salarioDoMes;
        double impostoSindicato = salarioDoMes * 1.05 - salarioDoMes;

        double salarioLiquido = salarioDoMes - inss - impostoRenda - impostoSindicato;

        System.out.println("Você pagou R$" + inss + " de inss, R$:" +impostoRenda+
                " De imposto de renda e R$" + impostoSindicato + " Para o sindicato!" +
                "Seu salário líquido é:" + salarioLiquido);










        /*
        if(salarioDoMes > 3500){
            System.out.println("Você ganha mais que 90% da população brasileira!");
        }
        else {
            System.out.println("Infelizmente você faz parte dos 90% da população que vive com menos do que o necessário para uma pessoa no Brasil!");
        }*/
    }
}

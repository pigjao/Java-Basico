package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer031 {
    public static void main(String[] args) {
        /*
        O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas
         */

        Scanner leitor = new Scanner(System.in);

        double temperatura;
        double maiorTemperatura = 0;
        double menorTemperatura = 100;
        double somaTemperatura = 0;
        int temperaturasInformadas = 0;
        int fim;

        do {
            System.out.println("Digite uma temperaratura");
            temperatura = leitor.nextDouble();
            somaTemperatura += temperatura;
            temperaturasInformadas++;

            if (maiorTemperatura < temperatura) maiorTemperatura = temperatura;
            if (temperatura < menorTemperatura) menorTemperatura = temperatura;

            System.out.println("Você irá digitar mais uma temperatura?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");
            fim = leitor.nextInt();

        } while (fim != 2);

        double media = somaTemperatura / temperaturasInformadas;

        System.out.println("Maior temperatura: " + maiorTemperatura + "°C");
        System.out.println("Menor temperatura: " + menorTemperatura + "°C");
        System.out.println("Temperatura média: " + media + "°C");
    }
}

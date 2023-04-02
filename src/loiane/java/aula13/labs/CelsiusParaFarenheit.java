package loiane.java.aula13.labs;

import java.util.Scanner;

public class CelsiusParaFarenheit {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um exemplo de graus Farenheit: ");
        double grausFarenheit = leitor.nextDouble();

        double grausCelsius = (5 * (grausFarenheit-32) / 9);

        System.out.println(grausFarenheit + " Graus Farenheit " +
                "São: " + grausCelsius + " Graus Celsius!");



            System.out.println("Agora digite um exemplo de graus Celsius: ");
            double grausCelsius1 = leitor.nextDouble();

            double grausFarenheit1 = (grausCelsius1 * 9/5) + 32;

            System.out.println(grausCelsius1 + " Graus Celsius " +
                    "São: " + grausFarenheit1 + " Graus Farenheit!");

    }

}

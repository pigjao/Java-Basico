package loiane.java.aula13.labs;

import java.util.Scanner;

public class MetrosParaCentimetros {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite em Metros e converteremos para Centímetros: ");
        double metros = leitor.nextDouble();

        double resultado = metros * 100;

        System.out.println("Você digitou: " + metros + "m" + " que equivale a: " + resultado + "cm");

        System.out.println("Digite em Metros e converteremos para Centímetros: ");
        double kilometros = leitor.nextDouble();

        double resultado1 = kilometros * 1000;

        System.out.println("Você digitou: " + kilometros + "km" + " que equivale a: " + resultado1 + "m");

    }



}

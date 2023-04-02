package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer013 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7, correspondente aos dias da semana! ");
        int diaDaSemana = leitor.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");

            case 2:
                System.out.println("Segunda");

            case 3:
                System.out.println("Terça");

            case 4:
                System.out.println("Quarta");

            case 5:
                System.out.println("Quinta");

            case 6:
                System.out.println("Sexta");

            case 7:
                System.out.println("Sábado");
        }
    }
}
package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite uma nota entre 0 e 10");
        int nota = leitor.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Digite um número dentor dos parâmetros estabalecidos: 0 a 10");
            nota = leitor.nextInt();
        }

        System.out.println("Nota: " + nota);

    }
}


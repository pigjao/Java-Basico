package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;
        int soma = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite um número!");
            numero = leitor.nextInt();

            soma += numero;

        }

        int media;
        media = soma / 5;

        System.out.println("A soma foi: " + soma);
        System.out.println("A média foi: " + media);
    }
}

package loiane.java.aula19.labs;

import java.util.Scanner;

public class Exer012 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0 ; i < vetorA.length; i++){
            vetorA[i] = leitor.nextInt();
            soma += vetorA[i];
        }
        System.out.println("A soma dos valores do vetor é: " + soma);


    }
}

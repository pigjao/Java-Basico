package loiane.java.aula19.labs;

import java.util.Scanner;

public class Exer010 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0 ; i < vetorA.length; i++){
            vetorA[i] = leitor.nextInt();
            vetorB[i] = vetorA[i] %2;
        }

        System.out.print("Vetor A:");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B:");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }
}

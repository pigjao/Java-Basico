package loiane.java.aula19.labs;

import java.util.Scanner;

/*
Criar um vetor A com 10 elementos inteiros.
Construir um vetor B demesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) B deverá receber 1 quando A for par;
b) B deverá receber 0 quando A for ímpar.
 */
public class Exer023 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Insira um valor inteiro");
            vetorA[i] = leitor.nextInt();
            if(vetorA[i] % 2 == 0){
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }

        System.out.print("Vetor  ");
        for (int j = 0; j < vetorA.length; j++){
            System.out.print(vetorA[j] + " ");
        }


        System.out.println(" ");
        System.out.print("Vetor B ");
        for (int k = 0; k < vetorA.length; k++){
            System.out.print(vetorB[k] + " ");
        }
    }
}

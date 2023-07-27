package loiane.java.aula19.labs;

import java.util.Scanner;

public class Exer014 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[10];
        int impar = 0;
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o número: " + (i+1) + " do vetor: ");
            vetorA[i] = leitor.nextInt();
            if(vetorA[i] % 2 != 0){
                impar++;
                soma += vetorA[i];
                System.out.println(vetorA[i] + " é impar!");
            }

        }
        int media = soma / impar;
        System.out.println("A média da soma dos números ímpares é: " + media);
    }
}

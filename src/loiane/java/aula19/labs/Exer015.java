package loiane.java.aula19.labs;

import java.util.Scanner;

public class Exer015 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[5];
        int numerosPares = 0;
        int numerosImpares = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o número: " + (i+1) + " do vetor: ");
            vetorA[i] = leitor.nextInt();
            if (vetorA[i] % 2 == 0){
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }
        System.out.println("Pares: " + numerosPares + " // Impares: " + numerosImpares);
        double percentualPar = (numerosPares * 100) / vetorA.length;
        double percentualImpar = (numerosImpares * 100) / vetorA.length;

        System.out.println("O percentual de números pares é: " + percentualPar + "%");
        System.out.println("O percentual de números ímpares é: " + percentualImpar + "%");

    }
}

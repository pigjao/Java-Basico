package loiane.java.aula19.labs;

// Implemente um programa que obtenha a cotação do dólar (U$) em relação ao real (R$)
// e a seguir armazene em vetor A com 20
//elementos as seguintes conversões:
//21.A[i] = cotação do dolar * i, para todo i variando de 1 até 20.


import java.util.Scanner;

public class Exer020 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Digite a cotação do dolar:");
        cotacao = scan.nextDouble();

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = cotacao * (i+1);
            System.out.println("A cotação do dólar * " + i + " é igual a: " + vetorA[i]);
        }
    }
}

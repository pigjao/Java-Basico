package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer012 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroTabuada;
        int resultadoTabuada;

        System.out.println("Qual o número que você quer saber a tabuada?");
        numeroTabuada = leitor.nextInt();
        System.out.println("TABUADA DE: " + numeroTabuada);

        for (int i = 1; i <= 10; i++){
        resultadoTabuada = numeroTabuada * i;
            System.out.println(numeroTabuada + " X " + i + " = " + resultadoTabuada);
        }
    }
}

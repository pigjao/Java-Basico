package loiane.java.aula20;

import java.util.Scanner;
import java.util.Stack;

public class MatrizesIrregulares {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a quantidade de pessoas que serão entrevistadas!");
        int numeroEntrevistados = leitor.nextInt();

        String[][] nomesFilhos = new String[numeroEntrevistados][];

        for(int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Digite a quantidade de filhos;");
            int qtdFilhos = leitor.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];
        }
    }
}

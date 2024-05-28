package loiane.java.aula19.labs;

import java.util.Scanner;

// Escreva um
//programa que verifique se um dado vetor A de 10 elementos inteiros é
//um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
//último, se o segundo elemento do vetor é igual ao penúltimo e assim
//por diante até verificar todos os elementos ou chegar a conclusão que
//o vetor não é um palíndromo.
public class Exer022 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean palindromo = false;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Insira um valor");
            vetorA[i] =leitor.nextInt();
        }

        for (int j=0,k = 9; j < vetorA.length; j++, k--){
            if(vetorA[j] == vetorA[k]){
                palindromo = true;
            } else{
                palindromo = false;
                break;
            }
        }

        if (palindromo) System.out.println("É um palíndromo");
        if (!palindromo) System.out.println("Não é um palíndromo");
    }
}

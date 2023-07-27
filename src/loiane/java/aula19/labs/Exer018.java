package loiane.java.aula19.labs;

import java.util.Scanner;

public class Exer018 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] idades = new int[10];
        int maiorIdade = 0;
        int menorIdade = 0;
        int posicaoMenorIdade = 0;
        int posicaoMaiorIdade = 0;


        for (int i = 0; i < idades.length; i++){
            System.out.print("Digite a idade da pessoa " + (i+1) + ":");
            idades[i] = leitor.nextInt();


            if(i == 0){
                maiorIdade = idades[i];
                menorIdade = idades[i];
            } else if (idades[i] > maiorIdade){
                maiorIdade = idades[i];
                posicaoMaiorIdade = i;

            } else if(idades[i] < menorIdade){
                menorIdade = idades[i];
                posicaoMenorIdade = i;
            }

        }
        System.out.println("--------------------------------------------------------------");

        System.out.print("Idades:");
        for (int i = 0; i < idades.length; i++){
            System.out.print(idades[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Menor idade: " + menorIdade + " posição: " + posicaoMenorIdade);
        System.out.println("Maior idade: " + maiorIdade + " posição: " + posicaoMaiorIdade);

        /*
        System.out.println(Arrays.stream(idades).max());
        System.out.println(Arrays.stream(idades).min());

         */

    }
}




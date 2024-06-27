package loiane.java.aula20.labs;

/*
* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após issoldetermine o maior número da matriz e a sua posição
* */

import java.util.Random;

public class Aula01Matriz4x4 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length ; j++){
                matriz[i][j] = (int)Math.round(Math.random() * 9);
            }
        }

        int coluna = 0, linha = 0, maior = 0;

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }

            }
        }

        System.out.println("O maior número da matriz é: " + maior);
        System.out.println("Da posição: " + linha + ", " + coluna);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length ; j++){
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println();
        }
    }
}

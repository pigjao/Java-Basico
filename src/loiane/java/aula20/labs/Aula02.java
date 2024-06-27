package loiane.java.aula20.labs;

/*
Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.
 */


public class Aula02 {
    public static void main(String[] args) {
        int[][] matrizAleatoria = new int[10][10];

        for (int i = 0; i < matrizAleatoria.length; i++){
            for (int j = 0; j < matrizAleatoria[i].length; j++){
                matrizAleatoria[i][j] = (int)Math.round(Math.random() * 100);
            }
        }

        int maiorLineFive = 0;
        int menorLineFive = 100;
        int maiorLineSeven = 0;
        int menorLineSeven = 100;

        //Loop que define o maior e menor da linha 5
        for (int i = 5; i < 6; i++){
            for (int j = 0; j < matrizAleatoria[i].length; j++){
                if(matrizAleatoria[5][j] > maiorLineFive){
                    maiorLineFive = matrizAleatoria[5][j];
                }
                if (matrizAleatoria[5][j] < menorLineFive){
                    menorLineFive = matrizAleatoria[5][j];
                }
            }
        }

        //Loop que define o maior e menor da linha 7
        for (int i = 7; i < 8; i++){
            for (int j = 0; j < matrizAleatoria[i].length; j++){
                if(matrizAleatoria[7][j] > maiorLineSeven){
                    maiorLineSeven = matrizAleatoria[7][j];
                }
                if (matrizAleatoria[7][j] < menorLineSeven){
                    menorLineSeven = matrizAleatoria[7][j];
                }
            }
        }


        System.out.println("Maior da linha 5: " + maiorLineFive + " / Menor da linha 5: " + menorLineFive);
        System.out.println("Maior da linha 7: " + maiorLineSeven + " / Menor da linha 7: " + menorLineSeven);

        for (int i = 0; i < matrizAleatoria.length; i++){
            for (int j = 0; j < matrizAleatoria[i].length; j++){
                System.out.print(matrizAleatoria[i][j] + " - ");
            }
            System.out.println();
        }



    }
}

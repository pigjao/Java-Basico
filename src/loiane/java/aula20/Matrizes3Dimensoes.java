package loiane.java.aula20;

public class Matrizes3Dimensoes {
    public static void main(String[] args) {
        int[][][] matrizTridimensional = new int[3][3][3];

        for (int i = 0; i < matrizTridimensional.length; i++){
            for (int j = 0; j < matrizTridimensional[i].length; j++){
                for (int k = 0; k < matrizTridimensional[j].length; k++){
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        }


        int soma = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matrizTridimensional.length; i++){
            for (int j = 0; j < matrizTridimensional[i].length; j++){
                for (int k = 0; k < matrizTridimensional[j].length; k++){
                    soma += matrizTridimensional[i][j][k];

                    if (matrizTridimensional[i][j][k] % 2 == 0){
                        pares += matrizTridimensional[i][j][k];
                    } else {
                        impares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }

        System.out.println(impares);
        System.out.println(pares);
        System.out.println(soma);


    }
}

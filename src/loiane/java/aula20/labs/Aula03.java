package loiane.java.aula20.labs;

/*
Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.
 */

public class Aula03 {
    public static void main(String[] args) {

        int[][] matrizParesImpares = new int[3][3];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matrizParesImpares.length;i++){
            for (int j = 0; j < matrizParesImpares[i].length; j++) {
                matrizParesImpares[i][j] = (int)Math.round(Math.random() * 100);
                if (matrizParesImpares[i][j] % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        for (int i = 0; i < matrizParesImpares.length;i++){
            for (int j = 0; j < matrizParesImpares[i].length; j++) {
                System.out.print(matrizParesImpares[i][j] + " ");
            }
            System.out.println();
        }
    }
}

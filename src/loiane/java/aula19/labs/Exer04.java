package loiane.java.aula19.labs;

import java.text.DecimalFormat;

public class Exer04 {

    /*

     */
    public static void main(String[] args) {
        int[] v1 = new int[15];
        double[] v2 = new double[15];

        DecimalFormat df = new DecimalFormat("###,###.###");

        for (int i = 0, j = 1; i < v1.length ; i++, j++){
            v1[i] = j * 2;
            System.out.println("Posição: " + i + " Array 1: " + v1[i]);

            v2[i] = Math.sqrt(v1[i]);
            System.out.println("Raiz de: " + i + " Array 2: " + df.format(v2[i]));
        }
    }
}

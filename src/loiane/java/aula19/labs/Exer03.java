package loiane.java.aula19.labs;

public class Exer03 {

    public static void main(String[] args) {
        int[] v1 = new int[15];
        int[] v2 = new int[15];

        for (int i = 0, j = 1; i < v1.length ; i++, j++){
            //construindo o array
            v1[i] = j * 2;
            System.out.println(" Array 1: " + v1[i]);

            //construindo o array com os respectivos valores ao quadrado
            v2[i] = v1[i] * v1[i];
            System.out.println("Raiz quadrada de : " + v1[i] + " Array 2: " + v2[i]);
        }
    }

}

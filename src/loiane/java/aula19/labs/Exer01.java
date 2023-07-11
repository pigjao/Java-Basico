package loiane.java.aula19.labs;

public class Exer01 {

    /*Criar um vetor A com 5 elementos inteiros
    Construir um vetor B de mesmo tipo e tamanho com
    os mesmos elementos do vetor A, ou seja B[i] = A[i]
     */


    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        int[] b = new int[5];

        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
            System.out.println(b[i]);
        }


        System.arraycopy(a, 0, b, 0, a.length);







    }
}

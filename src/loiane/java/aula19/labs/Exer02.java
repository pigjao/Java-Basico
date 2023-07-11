package loiane.java.aula19.labs;

public class Exer02 {
    public static void main(String[] args){

        int[] a = new int[8];
        int[] b = new int[8];

        for (int i = 0; i < a.length ; i++){
            a[i] = i;
            b[i] = a[i]*2;

            System.out.println("Valor de A: " + a[i] + " / Valor de B:" + b[i] );
        }


    }


}

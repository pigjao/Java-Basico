package loiane.java.aula19.labs;

public class Exer05 {
    public static void main(String[] args) {

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[vetor1.length];

        for (int i = 0 ; i < vetor1.length; i++){
            vetor1[i] = i;

            vetor2[i] = vetor1[i] * i;

            System.out.println("Vetor 1: " + vetor1[i] + " // Vetor 2: " + vetor2[i]);

        }
    }
}

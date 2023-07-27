package loiane.java.aula19.labs;


public class Exer08 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = i * 5;
            vetorB[i] = i * 2;

            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();

    }
}

package loiane.java.aula19.labs;

public class Exer07 {
    public static void main(String[] args){

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = i * 3;
            vetorB[i] = i;

            vetorC[i] = vetorA[i] - vetorB[i];
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
    }
}

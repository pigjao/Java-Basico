package loiane.java.aula19.labs;

/*
29.Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
sendo este a junção dos dois outros vetores. Os primeiros 10
elementos de C deverão receber os elementos de A e os últimos
elementos C deverão receber os elementos de B. Desta forma, C
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
 */
public class Exer027 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[vetorA.length + vetorB.length];

        for (int i = 0, j = 10; i < vetorA.length; i++, j++){
            vetorA[i] = (int)Math.round(Math.random() * 30);
            vetorB[i] = (int)Math.round(Math.random() * 30);
            vetorC[i] = vetorA[i];
            vetorC[j] = vetorB[i];
        }

        System.out.print("Vetor A: ");
        for (int j = 0; j < vetorA.length; j++){
            System.out.print(vetorA[j] + " ");
        }


        System.out.println(" ");
        System.out.print("Vetor B: ");
        for (int k = 0; k < vetorA.length; k++){
            System.out.print(vetorB[k] + " ");
        }

        System.out.println(" ");
        System.out.print("Vetor B: ");
        for (int k = 0; k < vetorC.length; k++){
            System.out.print(vetorC[k] + " ");
        }

    }
}

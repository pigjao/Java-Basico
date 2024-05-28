package loiane.java.aula19.labs;

/*
31.Ler um vetor A com 20 elementos. Separar os elementos pares e
ímpares de A utilizando apenas um vetor extra B.
Sugestão:
no início do vetor B armazene os elementos pares de A e nas posições
restantes do vetor B armazene os elementos de A que são ímpares.
 */
public class Exer029 {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        int quantidadePares = 0;


        for (int i = 0, j = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random() * 20);
            if (vetorA[i] % 2 == 0){
                vetorB[j] = vetorA[i];
                j++;
                quantidadePares++;
            }
        }

        for (int i = 0, j = quantidadePares; i < vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                vetorB[j] = vetorA[i];
                j++;
            }
        }

        System.out.print("Vetor A: ");
        for (int j = 0; j < vetorA.length; j++){
            System.out.print(vetorA[j] + " ");
        }

        System.out.println(" ");
        System.out.print("Vetor B: ");
        for (int k = 0; k < vetorB.length; k++){
            System.out.print(vetorB[k] + " ");
        }

    }
}

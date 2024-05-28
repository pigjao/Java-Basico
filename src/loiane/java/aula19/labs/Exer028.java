package loiane.java.aula19.labs;

/*
30.Ler um vetor A com 20 elementos.
Construir dois vetores B e C,
sendo que nos vetor B e C serão armazenados o valores pares e ímpares de
A, respectivamente.
 */
public class Exer028 {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        int quantidadePares = 0;
        int quantidadeImpares = 0;


        for (int i = 0 ; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random() * 20);
            if (vetorA[i] % 2 == 0){
            quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        int[] vetorPares = new int[quantidadePares];
        int[] vetorImpares = new int[quantidadeImpares];

        for (int i = 0, j = 0, k = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                vetorPares[j] = vetorA[i];
                j++;
            } else {
                vetorImpares[k] = vetorA[i];
                k++;
            }
        }

        System.out.print("Vetor A: ");
        for (int j = 0; j < vetorA.length; j++){
            System.out.print(vetorA[j] + " ");
        }


        System.out.println(" ");
        System.out.print("Vetor B: ");
        for (int k = 0; k < vetorPares.length; k++){
            System.out.print(vetorPares[k] + " ");
        }

        System.out.println(" ");
        System.out.print("Vetor C: ");
        for (int k = 0; k < vetorImpares.length; k++){
            System.out.print(vetorImpares[k] + " ");
        }

    }
}

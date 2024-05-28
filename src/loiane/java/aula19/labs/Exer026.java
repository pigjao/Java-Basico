package loiane.java.aula19.labs;

/*
Ler um vetor A com 10 elementos e construir um vetor B de mesmotipo e tamanho e com os mesmos elementos de A,
sendo que estes deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.
 */
public class Exer026 {
    public static void main(String[] args){
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0, j = 9; i < vetorA.length; i++, j--){
            vetorA[i] = (int)Math.round(Math.random() * 30);
            vetorB[j] = vetorA[i];
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
    }
}

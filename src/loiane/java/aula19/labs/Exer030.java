package loiane.java.aula19.labs;

/*
32. Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A.
 */
public class Exer030 {
    public static void main(String[] args) {
        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random() *5);
            System.out.println("Tabuada do " + vetorA[i]);
            for (int j = 0; j < 10; j++){
                System.out.println(vetorA[i] + " X " + j + " = "+ vetorA[i] * j);
            }

        }
    }
}

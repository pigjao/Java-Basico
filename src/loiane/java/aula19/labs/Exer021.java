package loiane.java.aula19.labs;

//Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
//0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
//para implementar um programa que determine o percentual de
//números 0's e 1's existentes no vetor A.

public class Exer021 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int quantidade1 = 0;
        int quantidade0 = 0;

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random() * 1);
        }

        for (int i : vetorA) {
            if (i == 1) {
                quantidade1 += 1;
            } else {
                quantidade0 += 1;
            }
        }
        System.out.println("A porcentagem de números 1 é: " + ((quantidade1 * 100) / 10) + "%");
        System.out.println("A porcentagem de números 0 é: " + ((quantidade0 * 100) / 10) + "%");
    }
}

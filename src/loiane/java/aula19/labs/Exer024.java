package loiane.java.aula19.labs;

/*
Criar dois vetores A e B cada um com 10 elementos inteiros.
Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi;
c) Ci deverá receber -1 quando A¡ for menor que Bi.
 */
public class Exer024 {
    public static void main(String[] args){
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random() * 10);
            vetorB[i] = (int)Math.round(Math.random() * 10);

            if(vetorA[i] > vetorB[i]) vetorC[i] = 1;
            if(vetorA[i] == vetorB[i]) vetorC[i] = 0;
            if(vetorA[i] < vetorB[i]) vetorC[i] = -1;
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
        System.out.print("Vetor C: ");
        for (int k = 0; k < vetorA.length; k++){
            System.out.print(vetorC[k] + " ");
        }




    }
}

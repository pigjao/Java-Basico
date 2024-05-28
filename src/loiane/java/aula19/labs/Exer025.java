package loiane.java.aula19.labs;

/*
Criar um vetor A com 10 elementos inteiros.
Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) B; deverá receber 'a' quando A¡ for menor que 7;
b) B; deverá receber 'b' quando A¡ for igual a 7;
c) Bi deverá receber 'c' quando Ai for maior que 7 e menor que 10;
d) B; deverá receber 'd' quando A for igual a 10;
e) Bi deverá receber 'e' quando Ai for maior que 10.
Sugestão: char B[10];
* */
public class Exer025 {
    public static void main(String[] args){
        int[] vetorA = new int[10];
        char[] vetorB = new char[10];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random() * 20);
            if (vetorA[i] < 7) vetorB[i] = 'a';
            if (vetorA[i] == 7) vetorB[i] = 'b';
            if (vetorA[i] > 7 && vetorA[i] < 10) vetorB[i] = 'c';
            if (vetorA[i] == 10) vetorB[i] = 'd';
            if (vetorA[i] > 10) vetorB[i] = 'e';
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




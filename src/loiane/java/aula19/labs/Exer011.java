package loiane.java.aula19.labs;

public class Exer011 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int pares = 0;

        for (int i = 0 ; i < vetorA.length; i++){
            vetorA[i] = i + 1;
            if (vetorA[i] % 2 == 0){
                System.out.println("Valor: " + vetorA[i] + " da posição: " + i + " é par!");
                pares++;
            }
        }
        System.out.println("O vetor tem: " + pares + " números pares");


    }
}

package loiane.java.aula19.labs;

import java.util.Scanner;

public class Exer016 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[10];
        int somaMenoresQuinze = 0;
        int maioresQuinze = 0;
        int qntMaioresQuinze = 0;
        int iguaisQuinze = 0;

        for(int i = 0; i < vetorA.length ; i++){
            vetorA[i] = leitor.nextInt();

            if(vetorA[i] < 15){
                somaMenoresQuinze += vetorA[i];

            } else if (vetorA[i] == 15) {
                iguaisQuinze++;

            } else if(vetorA[i] > 15){
                maioresQuinze += vetorA[i];
                qntMaioresQuinze++;
            }
        }

        System.out.println("Soma dos menores de 15: " + somaMenoresQuinze);
        System.out.println("Quantidade de iguai a 15: " + iguaisQuinze);
        System.out.println("Média dos > 15: " + (maioresQuinze / qntMaioresQuinze));

    }
}

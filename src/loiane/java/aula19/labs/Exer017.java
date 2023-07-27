package loiane.java.aula19.labs;

import java.util.Scanner;

public class Exer017 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] idades = new int[10];
        int maioresde35 = 0;

        for (int i = 0; i < idades.length; i++){
            System.out.print("Digite a idade da pessoa " + (i+1) + ":");
            idades[i] = leitor.nextInt();
            if (idades[i] > 35){
                maioresde35++;
            }
        }

        System.out.println("Há " + maioresde35 + " pessoas mariores de 35 anos na lista.");
    }
}

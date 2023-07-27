package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer034 {
    /*
    Faça um programa que mostre os n termos da série a seguir:

    S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 ... + n/m
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite um número inteiro");
        int n = leitor.nextInt();

        int s1 = 1;
        int s2 = 1;
        double soma = 0;

        for (int i = 1; i <= n; i++){
            System.out.print(s1 + "/" + s2 + " + ");
            s1 += 1;
            s2 += 2;
            soma += (double) s1 /s2;
        }

        System.out.println("Soma: " + soma);
    }

}

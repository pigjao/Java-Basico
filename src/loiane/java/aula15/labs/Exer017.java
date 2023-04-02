package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer017 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um ano");
        int ano = leitor.nextInt();

        if((ano % 400 == 0) || ((ano % 4 == 0 && ano % 100 != 0))){
            System.out.println("é bissexto!");
        } else {
            System.out.println("é bissexto!");
        }

    }
}

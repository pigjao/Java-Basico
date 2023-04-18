package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer024 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de pessoas: ");
        int numeroPessoas = leitor.nextInt();

        int idadePessoas;
        int totalIdade = 0;

        for (int i = 1; i <= numeroPessoas; i++){
            System.out.println("Digite a idade da pessoa " + i);
            idadePessoas = leitor.nextInt();
            totalIdade += idadePessoas;
        }
        int mediaIdade = totalIdade / numeroPessoas;

        if (mediaIdade > 0 && mediaIdade <= 25){
            System.out.println("Vocês são jovens!");
        } else if (mediaIdade > 25 && mediaIdade <= 60) {
            System.out.println("Vocês são adultos!");
        } else {
            System.out.println("Vocês são idosos!");
        }
    }
}

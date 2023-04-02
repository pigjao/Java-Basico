package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer020 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        System.out.println(" 0 - NÃO " +
                "1 - SIM");
        int pergunta1 = leitor.nextInt();

        System.out.println("Esteve no local do crime?");
        System.out.println(" 0 - NÃO " +
                "1 - SIM");
        int pergunta2 = leitor.nextInt();

        System.out.println("Mora perto da vítima?");
        System.out.println(" 0 - NÃO " +
                "1 - SIM");
        int pergunta3 = leitor.nextInt();

        System.out.println("Devia a vítima??");
        System.out.println(" 0 - NÃO " +
                "1 - SIM");
        int pergunta4 = leitor.nextInt();

        System.out.println("Trabalhou com ela?");
        System.out.println(" 0 - NÃO " +
                "1 - SIM");
        int pergunta5 = leitor.nextInt();

        int result = pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5;

        if (result == 2){
            System.out.println("Você é suspeito!");
        } else if (result > 2 && result <= 4) {
            System.out.println("Cúmplice!");
        } else if (result == 5) {
            System.out.println("Assassino!");
        } else if (result < 2){
            System.out.println("Inocente!");
        }
    }
}

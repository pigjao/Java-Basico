package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite F ou M: ");

        String mascFem = leitor.next();

        switch (mascFem){
            case "F":
                System.out.println("F - Feminino"); break;

                case "M":
                System.out.println("M - Masculino"); break;

            default:
                System.out.println("Valor inválido!");
    }}
}

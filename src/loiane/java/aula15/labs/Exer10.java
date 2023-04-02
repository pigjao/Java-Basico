package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Em que turno você estuda?");
        System.out.println("Digite: \"M\" para Matutino ");
        System.out.println("\"V\" para Vespertino ");
        System.out.println("\"N\" para Nortuno: ");

        String turno = leitor.next();

        switch (turno){
            case "M":
                System.out.println("Bom dia!"); break;

            case "V":
                System.out.println("Boa tarde!"); break;

            case "N":
                System.out.println("Boa noite!"); break;

            default:
                System.out.println("Valor inválido");
        }
    }

}

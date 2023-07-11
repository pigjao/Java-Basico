package loiane.java.aula18;

import java.util.Scanner;

public class BreakContinue {

    /*
    AULA 18 BREAK E CONTINUE
     */


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite um número:");
        int num = leitor.nextInt();

        System.out.println("Digite um limite:");
        int max = leitor.nextInt();


        for (int i = num; num <= max; num++){

            System.out.println(num);

            if (num % 7 == 0){
                System.out.println("O primeiro número divisível por 7 é: " + num);
                break;
            }
        }




    }
}

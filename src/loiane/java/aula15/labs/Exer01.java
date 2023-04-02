package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite dois números!");

        int numero1 = leitor.nextInt();

        int numero2 = leitor.nextInt();

        if (numero1 > numero2){
            System.out.println(numero1);
        }
        else {
            System.out.println(numero2);

        }
    }
}

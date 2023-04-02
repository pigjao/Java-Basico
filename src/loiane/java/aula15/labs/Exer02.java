package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número!");

        int numero1 = leitor.nextInt();


        if (numero1 < 0){
            System.out.println("Valor negativo!");
        }
        else {
            System.out.println("Valor positivo!");

        }
    }

}

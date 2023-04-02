package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer018 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitor.nextInt();

        if(numero % 2 == 0){
            System.out.println("é par!");
        } else {
            System.out.println("é impar!");
        }
    }
}

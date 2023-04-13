package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;
        int maior = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite um número! ");
            numero = leitor.nextInt();

            if (numero > maior){
                maior = numero;
            }
        }
        System.out.println(maior);


    }
}

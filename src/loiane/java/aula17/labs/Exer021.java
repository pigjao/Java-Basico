package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer021 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro!");
        int numero = leitor.nextInt();
        boolean primo = true;

        for (int i = 2; i < numero ; i++){
            if (numero % i == 0){
                System.out.println("O número não é primo - Divisivel por: " + i);
                primo = false;
            }
            if(primo){
                System.out.println("É um número primo!");
            }
        }



    }
}

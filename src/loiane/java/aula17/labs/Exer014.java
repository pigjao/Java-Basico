package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer014 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int soma = 0;
        int impares = 0;
        int pares = 0;


        for (int i = 1; i <= 10; i++){
            System.out.println("Digite um número!");
            int numero = leitor.nextInt();
            soma += numero;

            if (numero %2 == 0){
                pares++;
            } else {
                impares ++;
            }
        }

        System.out.println("Valor da soma dos números: " + soma);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.println("Quantidade de pares: " + pares);
    }
}

package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer013 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a base");
        int base = leitor.nextInt();
        System.out.println("Digite o expoente");
        int expoente = leitor.nextInt();

        int resultado = 1;

        for (int i = 1; i <= expoente; i++){
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);


    }
}

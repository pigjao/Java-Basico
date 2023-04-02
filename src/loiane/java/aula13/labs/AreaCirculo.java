package loiane.java.aula13.labs;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = leitor.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);


    }

}

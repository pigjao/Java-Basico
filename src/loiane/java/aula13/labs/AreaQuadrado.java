package loiane.java.aula13.labs;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Para calcular a área de um quadrado " +
                "devemos multiplicar sua base pela altura!" +
                "Dessa forma digite a base do quadrado: ");

        int base = leitor.nextInt();
        int area = base * base;
        int dobroArea = base * 2;

        System.out.println("A área do quadrado é de: " + area);
        System.out.println("O dobro dela é: " + dobroArea);
    }
}

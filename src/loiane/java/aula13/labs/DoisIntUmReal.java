package loiane.java.aula13.labs;

import java.util.Scanner;

public class DoisIntUmReal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite dois inteiros: ");
        int inteiro1 = leitor.nextInt();
        int inteiro2 = leitor.nextInt();

        System.out.println("Agora digite um real: ");
        double real = leitor.nextDouble();

        double letraA = (inteiro1 * 2) + (inteiro2 / 2);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + letraA);

        double letraB = (inteiro1 * 3) + real;
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + letraB);

        double letraC = real * real * real;
        System.out.println("O terceiro ao cubo é: " + letraC);


    }

}

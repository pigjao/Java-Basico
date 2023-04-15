package loiane.java.aula17.labs;


import java.util.Scanner;

public class Exer017 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um inteiro!");
        int fatorial = leitor.nextInt();
        int fatorando = fatorial - 1;



        System.out.print(fatorial + "!=" + fatorial + ".");
        while (fatorando > 0){

            fatorial *= fatorando;
            if (fatorando != 1) {
                System.out.print(fatorando + ".");
            } else {
                System.out.print(fatorando);
            }

            fatorando--;
        }

        System.out.println("=" + fatorial);

    }
}

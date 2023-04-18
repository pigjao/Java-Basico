package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer020 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);



        for (int i = 1; i <= 10; i++) {

            System.out.println("Digite um inteiro entre 0 e 15");
            int fatorial = leitor.nextInt();

            while (fatorial > 16 || fatorial < 0){
                if(fatorial > 16) {
                    System.out.println("O número deve ser menor que 16!");
                } else {
                    System.out.println("O número deve ser maior que 0!");
                }
                fatorial = leitor.nextInt();
            }

            int fatorando = fatorial - 1;

            System.out.print(fatorial + "!=" + fatorial + ".");
            while (fatorando > 0) {

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
}

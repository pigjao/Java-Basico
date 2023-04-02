package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer06and07 {
    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

        System.out.println("Digite três números!");
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();
        int numero3 = leitor.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println(numero1 + " Foi o maior número digitado");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2 + " Foi o maior número digitado");
        }
        else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println(numero3 + " Foi o maior número digitado");
        }

        if (numero1 < numero2 && numero1 < numero3){
            System.out.println(numero1 + " Foi o menor número digitado");
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println(numero2 + " Foi o menor número digitado");
        }
        else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println(numero3 + " Foi o menor número digitado");
        }
    }

}

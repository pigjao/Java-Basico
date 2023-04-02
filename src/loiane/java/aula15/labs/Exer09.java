package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite três números! ");

        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();
        int numero3 = leitor.nextInt();

        int maior = 0;
        int meio = 0;
        int menor = 0;

        if(numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
        } else if (numero3 > numero1 && numero3 > numero2) {
            maior = numero3;
        }

            if(numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
        } else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
        } else if (numero3 < numero1 && numero3 < numero2) {
            menor = numero3;
        }



        if((numero1 != maior && numero1 != menor)) {
            meio = numero1;
        } else if (numero2 != maior && numero2 != menor) {
            meio = numero2;
        } else if (numero3 != maior && numero3 != menor) {
            meio = numero3;
    }

        System.out.println(maior + ", " + meio + ", " + menor);
}}

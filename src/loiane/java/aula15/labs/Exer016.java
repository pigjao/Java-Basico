package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer016 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o ");

        int a = leitor.nextInt();
        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau!");
        }
        else {
            int b = leitor.nextInt();
            int c = leitor.nextInt();

            double delta = (b * b) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Delta negativo");
            } else {
             double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
             double x2 = ((-b) + Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }

        }


        }



    }


package loiane.java.aula15;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int diaDaSemana = leitor.nextInt();

        if(diaDaSemana == 1) {
            System.out.println("Domingo");
        }
        else if(diaDaSemana == 2){
                System.out.println("Segunda");
        }
        else if(diaDaSemana == 3){
            System.out.println("Terça");
        }
        else if(diaDaSemana == 4){
            System.out.println("Quarta");
        }
        else if(diaDaSemana == 5){
            System.out.println("Quinta");
        }
        else if(diaDaSemana == 6){
            System.out.println("Sexta");
        }
        else if(diaDaSemana == 7){
            System.out.println("Sabado");
        }

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");

            case 2:
                System.out.println("Segunda");

            case 3:
                System.out.println("Terça");

            case 4:
                System.out.println("Quarta");

            case 5:
                System.out.println("Quinta");

            case 6:
                System.out.println("Sexta");

            case 7:
                System.out.println("Sábado");

        }
    }



}

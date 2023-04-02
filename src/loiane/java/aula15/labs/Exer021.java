package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer021 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        double alcool = 1.9;
        double gasolina = 2.5;


        System.out.println("Quantos litros xapa?");
        int litros = leitor.nextInt();

        System.out.println("G - Gasol ou A -Alcool, xapa?");
        String combustivel = leitor.next();

        switch (combustivel) {
            case "A":
                if (litros <= 20) {
                    double descontoAlcool = alcool - (alcool * 0.03);
                    double total = descontoAlcool * litros;
                    System.out.println("O valor pago foi: " + total);

                } else {
                    double descontoAlcool = alcool - (alcool * 0.05);
                    double total = descontoAlcool * litros;
                    System.out.println("O valor pago foi: " + total);

                } break;
            case "G":
                if (litros <= 20) {
                    double descontoGasol = gasolina - (gasolina * 0.04);
                    double total = descontoGasol * litros;
                    System.out.println("O valor pago foi: " + total);

                } else {
                    double descontoGasol = gasolina - (gasolina * 0.05);
                    double total = descontoGasol * litros;
                    System.out.println("O valor pago foi: " + total);

                }  break;
        }
    }}

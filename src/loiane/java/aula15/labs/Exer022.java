package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer022 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double precoMorango = 2.50;
        double precoMorango5kg = 2.20;
        double precoMaca = 1.80;
        double precoMaca5kg = 1.50;
        double totalMorango;
        double totalMaca;


        System.out.println("Digite quantos kg de morango");
        double pesoMorango = leitor.nextDouble();

        System.out.println("Digite quantos kg de maçã");
        double pesoMaca = leitor.nextDouble();

        if(pesoMorango < 5){
            totalMorango = pesoMorango * precoMorango;
        }
        else {
            totalMorango = pesoMorango * precoMorango5kg;
        }

        if(pesoMaca < 5){
            totalMaca = pesoMaca * precoMaca;
        }
        else {
            totalMaca = pesoMaca * precoMaca5kg;
        }

        double valorTotalProdutos = totalMaca + totalMorango;
        double totalKG = pesoMaca + pesoMorango;

        if(valorTotalProdutos > 25 || totalKG > 8){
            valorTotalProdutos = valorTotalProdutos - (valorTotalProdutos * 0.1);
        }

        System.out.println("O valor a ser pago é: " + valorTotalProdutos);



    }
}

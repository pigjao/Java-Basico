package loiane.java.aula15.labs;


import java.util.Scanner;

public class Exer023 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double fileduplo = 4.9;
        double fileduplo5kg = 5.8;
        double alcatra = 5.9;
        double alcatra5kg = 6.8;
        double picanha = 6.9;
        double picanha5kg = 7.8;


        System.out.println("Qual tipo de carne? Escolha apenas um!");
        System.out.println("1 - File Duplo?");
        System.out.println("2 - Alcatra?");
        System.out.println("3 - Picanha?");
        String tipoCarne = leitor.next();

        System.out.println("Quantos kilos de carne você comprou? ");
        double kilosDeCarne = leitor.nextDouble();


        double valorParcial = 0;

        switch (tipoCarne){
            case "File Duplo":
                if (kilosDeCarne <= 5) {
                    valorParcial = fileduplo * kilosDeCarne;
                } else {
                    valorParcial = fileduplo5kg * kilosDeCarne;
                } break;

            case "Alcatra":
               if (kilosDeCarne <= 5) {
                    valorParcial = alcatra * kilosDeCarne;
               } else {
                    valorParcial = alcatra5kg * kilosDeCarne;
                } break;

            case "Picanha":
                if (kilosDeCarne <= 5) {
                    valorParcial = picanha * kilosDeCarne;
                } else {
                    valorParcial = picanha5kg * kilosDeCarne;
                } break;



        }

        System.out.println("Pagamento com: \"cartão tabajara\" / \"outros\" ");
            String formaPagamento = leitor.next();

            double valorTotal = 0;
            boolean haDesconto = true ;

        switch (formaPagamento) {
            case "cartão": valorTotal = valorParcial - (valorParcial * 0.05); break;

            case "outros": valorTotal = valorParcial; haDesconto = false; break;
        }

        System.out.println("                   NF");
        System.out.println(tipoCarne + ": "+ kilosDeCarne + "kg" + ": R$" + valorParcial);
        System.out.println("Pagamento: " + formaPagamento);
        if (haDesconto) {
            System.out.println("Desconto: R$" + String.format("%.2f" ,valorParcial * 0.05));
        } else {
            System.out.println("Desconto: R$0,00");
        }

        System.out.println("Valor a pagar: R$" + valorTotal);
        }


    }


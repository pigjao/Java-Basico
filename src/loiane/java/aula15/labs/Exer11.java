package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Este programa calcula o reajuste que seu salário sofrerá! ");
        System.out.println("Digite o valor do seu salário: ");

        double salarioEntrada = leitor.nextDouble();
        double salarioReajuste;
        double valorAumento;


        if (salarioEntrada <= 280){
            salarioReajuste = salarioEntrada * 1.2;
            valorAumento = salarioReajuste - salarioEntrada;
            System.out.println("O seu salário era de: R$" + salarioEntrada +
                    " o percentual de aumento foi de 20% " +
                    " o valor do aumento foi de R$" + valorAumento +
                    " e o novo salário é de R$" + salarioReajuste);

        } else if (salarioEntrada > 280 &&  salarioEntrada <= 700) {
            salarioReajuste = salarioEntrada * 1.15;
            valorAumento = salarioReajuste - salarioEntrada;
            System.out.println("O seu salário era de: R$" + salarioEntrada +
                    " o percentual de aumento foi de 15% " +
                    " o valor do aumento foi de R$" + valorAumento +
                    " e o novo salário é de R$" + salarioReajuste);

        }  else if (salarioEntrada > 700 &&  salarioEntrada <= 1500) {
            salarioReajuste = salarioEntrada * 1.10;
            valorAumento = salarioReajuste - salarioEntrada;
            System.out.println("O seu salário era de: R$" + salarioEntrada +
                    " o percentual de aumento foi de 10% " +
                    " o valor do aumento foi de R$" + valorAumento +
                    " e o novo salário é de R$" + salarioReajuste);

        } else if (salarioEntrada > 1500) {
            salarioReajuste = salarioEntrada * 1.05;
            valorAumento = salarioReajuste - salarioEntrada;
            System.out.println("O seu salário era de: R$" + salarioEntrada +
                    " o percentual de aumento foi de 5% " +
                    " o valor do aumento foi de R$" + valorAumento +
                    " e o novo salário é de R$" + salarioReajuste);

        }



    }
}

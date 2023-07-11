package loiane.java.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer032 {
    /*
    Um funcionário de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
. Esse funcionário foi contratado em 1995, com salário inicial de
R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre
correspondem ao dobro do percentual do ano anterior. Faça um
programa que determine o salário atual desse funcionário.

 Após
concluir isto, altere o programa permitindo que o usuário digite o
salário inicial do funcionário.
     */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salarioInicial = 1000;
        double aumento = 1.5;

        DecimalFormat format = new DecimalFormat("###,###.###");


        for (int ano = 1996; ano <= 2023 ; ano++){

            aumento *= 2;
            salarioInicial += (salarioInicial / 100) * aumento;




            System.out.println(ano + ": Salário: " + format.format(salarioInicial));

        }
    }
}

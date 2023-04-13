package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int populacaoA;
        int populacaoB;
        int crescimentoB;
        int crescimentoA;

        System.out.println("OS países não podem ter menos que 0 habitantes e mais que um milhão!");
        System.out.println("Digite a quantidade de habitante do país \"A\"");
        populacaoA = leitor.nextInt();

        //validando entrada população A
        while (populacaoA < 0 || populacaoA > 1000000000){
            if(populacaoA < 0){
                System.out.println("A população deve ser maior que 0! Corrija a seguir!");
            } else {
                System.out.println("A população deve ser menor que 1.000.000! Corrija a seguir!");
            }
            populacaoA = leitor.nextInt();
        }

        //validando entrada população b
        System.out.println("Digite do país B:");
        populacaoB = leitor.nextInt();
        while (populacaoB < 0 || populacaoB > 1000000000){
            if(populacaoB < 0){
                System.out.println("A população deve ser maior que 0! Corrija a seguir!");
            } else {
                System.out.println("A população deve ser menor que 1.000.000! Corrija a seguir!");
            }
            populacaoB = leitor.nextInt();
        }


        System.out.println("Agora digite a porcentagem do crescimento anual de ambos! Não pode ser maior que 20%");
        System.out.println("De forma que: O crescimento do país \"A\" deve ser maior que o do país \"B\"");

        System.out.println("País A:");
        crescimentoA = leitor.nextInt();
        while (crescimentoA > 20){
            System.out.println("O crescimento deve ser menor que 20% corrija!");
            crescimentoA = leitor.nextInt();
        }


        System.out.println("País B: ");
        crescimentoB = leitor.nextInt();

        while (crescimentoB > 20){
            System.out.println("O crescimento deve ser menor que 20% corrija!");
            crescimentoB = leitor.nextInt();

        }

        while (crescimentoA <= crescimentoB){
            System.out.println("O crescimento do país A deve ser maior que o B");
            System.out.println("País A:");
            crescimentoA = leitor.nextInt();
        }

        int ano = 0;

        while (populacaoA < populacaoB){

            populacaoA += (populacaoA / 100) * crescimentoA;
            populacaoB += (populacaoB / 100) * crescimentoB;
            ano++;
        }
        System.out.println("População do Brasil: " + populacaoA);
        System.out.println("População do EUA: " + populacaoB);
        System.out.println("Será necessário " + ano + " anos para que a população do Brasil seja maior que a população dos EUA");



}}

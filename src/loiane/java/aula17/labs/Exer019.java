package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer019 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maiorNumero = 0;
        int menorNumero = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite um número entre 0 e 1000");
            numero = leitor.nextInt();

            while(numero < 0 || numero > 1000){
                if (numero < 0) {
                    System.out.println("O número não pode ser menor que 0, corrija!");
                } else{
                System.out.println("O número não pode ser maior que 1000, corrija!");
                }

                numero = leitor.nextInt();
            }

            if(i == 1){
                menorNumero = numero;
                maiorNumero = numero;
            }


            if (numero > maiorNumero){
                maiorNumero = numero;
            } else if(numero < menorNumero){
                menorNumero = numero;
            }
            soma += numero;
        }

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);
        System.out.println("Soma: " + soma);
    }
}

package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer022 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número \"n\" ");
        int n = leitor.nextInt();
        int totalDivisoes = 0;
        int numerosDivisiveis = 0;

        //loop para fazer do 1 ao n
        for (int i = 1; i <= n; i++){


            int count = i;
            //loop do primo com base no n
            while(count > 0){
               if (i %count == 0){
                   numerosDivisiveis++;
                   totalDivisoes++;
               }

               count--;

           }

            if(numerosDivisiveis == 2){
                System.out.println(i + " É primo!");

            }

            numerosDivisiveis = 0;
        }
        System.out.println("Divisões: " + totalDivisoes);
    }
}


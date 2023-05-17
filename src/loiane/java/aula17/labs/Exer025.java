package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer025 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int lula = 0;
        int bolso = 0;
        int ciro = 0;
        int voto;
        System.out.println("Digite a quantidade de eleitores");

        int eleitores = leitor.nextInt();

        for (int i = 1; i <= eleitores; i++){
            System.out.println("Digite o número do seu candidato, eleitor: " + i);
            System.out.println("12 - Ciro");
            System.out.println("13 - Lula");
            System.out.println("22 - Bolso");
            voto = leitor.nextInt();

            switch (voto){
                case 13:
                    lula++; break;
                case 12:
                    ciro++; break;
                case 22: bolso++; break;
            }
        }

        System.out.println("LULA: " + lula + " votos");
        System.out.println("CIRO: " + ciro + " votos");
        System.out.println("BOLSO: " + bolso + " votos");

    }
}

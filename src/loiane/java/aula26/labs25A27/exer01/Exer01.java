package loiane.java.aula26.labs25A27.exer01;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Lampada lampada = new Lampada();

        System.out.println("Você deseja ligar a luz? Se sim, digite 1");
        int resposta = leitor.nextInt();

        if (resposta == 1){
        lampada.ligar();
        }
    }
}

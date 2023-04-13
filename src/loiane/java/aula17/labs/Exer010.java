package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer010 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n1, n2;
        System.out.println("Digite um número");
        n1 = leitor.nextInt();
        System.out.println("Digite mais um número");
        n2 = leitor.nextInt();

        for (int i = n1; i <= n2; i++){
            System.out.println(n1);
            ++n1;
        }
    }
}

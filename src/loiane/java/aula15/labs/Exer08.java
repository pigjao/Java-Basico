package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preço de três produtos!");
        double produto1 = leitor.nextDouble();
        double produto2 = leitor.nextDouble();
        double produto3 = leitor.nextDouble();

        if (produto1 < produto2 && produto1 < produto3){
            System.out.println(produto1 + " Foi o preço mais barato!");
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println(produto2 + " Foi o preço mais barato!");
        }
        else if (produto3 < produto1 && produto3 < produto2) {
            System.out.println(produto3 + " Foi o preço mais barato!");
        }
    }

}

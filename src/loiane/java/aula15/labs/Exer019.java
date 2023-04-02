package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer019 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite dois números");
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        System.out.println("Você deseja somar ou subtrair os números?");
        String oper = leitor.next();

        int result;

        switch (oper){
            case "somar": result = num1 + num2;
                System.out.println(result);
                if (result % 2 == 0){
                System.out.println("É par");
            }else{
                System.out.println("É impar");
            }
                break;

            case "subtrair": result = num1 - num2;
                System.out.println(result);
                if (result % 2 == 0){
                    System.out.println("É par");
                }else{
                    System.out.println("É impar");
                }break;
    }}
}

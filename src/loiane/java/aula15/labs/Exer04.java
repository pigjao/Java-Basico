package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma letra do alfabato!");

        String letra = leitor.next();

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal"); break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                System.out.println("Consoante"); break;

            default:
                System.out.println("Entrada inválida! ");
        }
    }
}

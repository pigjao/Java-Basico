package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário: ");
        String usuario = leitor.next();
        System.out.println("Digite sua senha: ");
        String senha = leitor.next();

        while (usuario.equals(senha)){
            System.out.println("Seu usuário não pode ser o mesmo que a senha! Tente novamente");
            System.out.println("Digite seu nome de usuário: ");
            usuario = leitor.next();
            System.out.println("Digite sua senha: ");
            senha = leitor.next();
        }
    }
}

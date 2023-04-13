package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //recebendo o nome e registrando a quantidade de caracteres
        System.out.println("Digite seu nome");
        String nome = leitor.next();
        int caracterNome = nome.length();

        //validando o nome
        while (caracterNome < 3){
            System.out.println("O nome deve ter mais de 3 caracteres! Digite seu nome novamente :)");
            nome = leitor.next();
            caracterNome = nome.length();
        }

        //Recebendo a idade
        System.out.println("Digite sua idade!");
        int idade = leitor.nextInt();

        while (idade < 0 || idade > 150){
            System.out.println("Querido, a idade aceita é entre 0 a 150 anos, corrija sua idade!");
            idade = leitor.nextInt();
        }

        //recebendo o salário
        System.out.println("Digite o valor do seu salário!");
        double salario = leitor.nextDouble();

        while (salario <= 0){
            System.out.println("O salário deve ser maior que zero, corrija!");
            salario = leitor.nextDouble();
        }

        //recebendo o sexo
        System.out.println("Digite o seu sexo - \"m\" ou \"f\" ");
        String sexo = leitor.next();

        //validando o sexo
        while(!(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m"))){
            System.out.println("Digite \"m\" ou \"f\" para validar o sexo!");
            sexo = leitor.next();
        }

        //recebendo o estado civil
        System.out.println("Digite seu estado civil:");
        System.out.println("s - Solteiro");
        System.out.println("c - Casado");
        System.out.println("v - Viuvo");
        System.out.println("d - Divorciado");
        String estadoCivil = leitor.next();

        while (!(estadoCivil.equals("s") || estadoCivil.equals("c") ||
                estadoCivil.equals("v") || estadoCivil.equals("d"))) {
            System.out.println("Digite de acordo com os parâmteros!");
            System.out.println("s - Solteiro");
            System.out.println("c - Casado");
            System.out.println("v - Viuvo");
            System.out.println("d - Divorciado");
            estadoCivil = leitor.next();
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);

    }
}

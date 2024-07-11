package loiane.java.aula26.labs25A27.exer02;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        ContaCorrente cc = new ContaCorrente();
        cc.saldo = 4099.99;
        cc.numero = 104311233;

        boolean sair = false;
        int operacao;

        System.out.println("Bem vindo ao Banco do Pig");

        while(!sair){
            System.out.println("Escolha qual operação deseja realizar");
            System.out.println("1 - Verificar Saldo");
            System.out.println("2 - Saques");
            System.out.println("3 - Depósitos");
            System.out.println("4 - Encerrar");

            operacao = leitor.nextInt();


            switch(operacao){
                case 1:
                    cc.consultarSaldo();
                    break;

                case 2:
                    System.out.println("Insira o valor que desja sacar");
                    cc.realizarSaque(leitor.nextDouble());
                    break;

                case 3:
                    System.out.println("Insira o valor que deseja depositar");
                    cc.depositarDinheiro(leitor.nextDouble());
                    break;

                case 4:
                    sair = true;
                    break;
            }

        }

        System.out.println("Volte sempre!");
    }
}

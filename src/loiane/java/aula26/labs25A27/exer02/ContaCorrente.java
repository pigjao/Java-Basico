package loiane.java.aula26.labs25A27.exer02;


public class ContaCorrente {
    int numero;
    double saldo;

    void realizarSaque(double quantia){
        if (saldo >= quantia){
            saldo -= quantia;
            System.out.println("Saque realizado, saldo atual em conta R$" + saldo);
        }
            else {
                    System.out.println("Não é possível realizar seu saque. Sem saldo suficiente!");
        }
    }

    void depositarDinheiro(double quantia){
        saldo += quantia;
        System.out.println("Saldo atual em conta: " + saldo);
    }

    void consultarSaldo(){
        System.out.println("Saldo atual em conta: R$" + saldo);
    }

}

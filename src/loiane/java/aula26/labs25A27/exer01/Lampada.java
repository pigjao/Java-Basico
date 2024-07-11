package loiane.java.aula26.labs25A27.exer01;

public class Lampada {
    boolean acesa;

    boolean ligar(){
        System.out.println("ligarLuz");
        return acesa = true;
    }

    boolean desligar(){
        System.out.println("desligarLuz");
        return acesa = false;

    }
}

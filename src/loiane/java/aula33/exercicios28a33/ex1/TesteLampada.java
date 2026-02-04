package loiane.java.aula33.exercicios28a33.ex1;


public class TesteLampada {
    public static void main(String[] args) {

        Lampada lampadaNova = new Lampada();
        lampadaNova.ligarLuz();

        System.out.println("Lampada acesa: " + lampadaNova.isAcesa());

        lampadaNova.desligar();

        System.out.println("Lampada acesa: " + lampadaNova.isAcesa());


    }

}


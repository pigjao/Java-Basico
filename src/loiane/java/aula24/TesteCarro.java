package loiane.java.aula24;

public class TesteCarro {
    public static void main(String[] args) {

        Clarro van = new Clarro();
        van.marca = "Fiat";
        van.modelo = "Uno";
        van.numeroPassageiros = 5;
        van.capacidadeTanque = 120;
        van.consumedoMedio = 13.5;

        System.out.println(van); // local na memória
        System.out.println(van.marca);
        System.out.println(van.modelo);
    }


}

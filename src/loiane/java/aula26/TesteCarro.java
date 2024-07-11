package loiane.java.aula26;



public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Argo";
        carro.numeroPassageiros = 5;
        carro.ano = 2017;
        carro.consumedoMedio = 17.5;
        carro.capacidadeTanque = 50;

        System.out.println("Modelo:" + carro.modelo);
        System.out.println("Marca:" + carro.marca);
        double autonomia = carro.obterAutonomia();
        System.out.println("Autonomia: " + carro.obterAutonomia() + " km/l");

        // Continuação Aula 27

        System.out.println("Quantidade de combustível:" + carro.calcularCombustivel(280));

    }
}

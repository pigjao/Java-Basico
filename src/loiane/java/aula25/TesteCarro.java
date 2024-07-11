package loiane.java.aula25;

public class TesteCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Argo";
        carro.numeroPassageiros = 5;
        carro.ano = 2017;
        carro.consumedoMedio = 17.5;

        carro.exibirDetalhes();
        carro.exibirAutonomia();
    }

}

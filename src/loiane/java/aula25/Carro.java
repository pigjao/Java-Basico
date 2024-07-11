package loiane.java.aula25;

public class Carro {
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeTanque;
    double consumedoMedio;
    int ano;

    void exibirAutonomia (){
        System.out.println("Autonomia: " + consumedoMedio + " km/l");
    }


    // Metodo sem retorno utilzimos void
    void exibirDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("ano: " + ano);
    }
}


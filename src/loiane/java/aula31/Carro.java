package loiane.java.aula31;

class Carro {

        String marca;
        String modelo;
        int numeroPassageiros;
        double capacidadeTanque;
        double consumedoMedio;
        int ano;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é:" + this.capacidadeTanque * this.consumedoMedio);
    }

    // Metodo com retorno utilizamos o tipo de dado antes de declara-lo
    double obterAutonomia(){
        System.out.println("obtendoAutonomia");
        return consumedoMedio * capacidadeTanque;
    }

    }

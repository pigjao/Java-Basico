package loiane.java.aula33.exercicios28a33.ex1;

public class Lampada {
   private String marca;
   private String cor;
   private double valor;
   private int quantidade;
   private boolean acesa;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public boolean ligarLuz(){
        System.out.println("Ligando a luz");
        return acesa = true;
    }

    public boolean desligar(){
        System.out.println("Desligando a luz");
        return acesa = false;
    }


}



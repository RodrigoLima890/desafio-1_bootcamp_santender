package Desafio_1;

public class Cliente extends Financiamento{
    private String nome;
    private double recebimentos_mensais;

    public Cliente(String nome, double recebimentos_mensais) {
        this.nome = nome;
        this.recebimentos_mensais = recebimentos_mensais;
    }
    public Cliente(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRecebimentos_mensais() {
        return recebimentos_mensais;
    }

    public void setRecebimentos_mensais(double recebimentos_mensais) {
        this.recebimentos_mensais = recebimentos_mensais;
    }
}

package Desafio_1;

public class Financiamento{
    private int numeroParcelas;
    private double taxaJuros;
    private double valorVeiculo;
    private double valorTotal;
    final private double IOF = 0.038;

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double calcularValorParcela(int numeroParcelas, double taxaJuros, double valorVeiculo){
        double parcelaValor = (valorVeiculo/numeroParcelas)+ (valorVeiculo * IOF) + (taxaJuros * valorVeiculo);
        return parcelaValor;
    }
    public double calculaTotal(double parcelaValor){
        for(int i = 0; i<= numeroParcelas; i++){
            valorTotal += parcelaValor;
        }
        return valorTotal;
    }

}

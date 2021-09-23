package com.company;

public class Fornecedor extends Pessoa{

    //Atributos

    private double valorCredito;
    private double valorDivida;

    //Método construtor

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    //Método Obter Saldo

    public double obterSaldo(){
        return valorCredito - valorDivida;
    }

}

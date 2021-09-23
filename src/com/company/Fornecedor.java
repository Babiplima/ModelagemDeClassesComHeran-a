package com.company;

public class Fornecedor extends Pessoa {

    //Atributos

    private double valorCredito;
    private double valorDivida;

    //Métodos construtores

    public Fornecedor() {

    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    //Métodos Getters e Setters

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

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

}

package com.company;

public class Administrador extends Colaborador {

    //Atributos

    private double ajudaDeCusto;

    //Métodos construtores

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    //Métodos Getters e Setters

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() - getImposto() + ajudaDeCusto;
    }
}

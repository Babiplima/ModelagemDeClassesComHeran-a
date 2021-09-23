package com.company;

public abstract class Pessoa {

    //Atributos

    private String nome;
    private String endereco;
    private String telefone;

    //Métodos construtores

    public Pessoa() {

    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //Métodos getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Método para nome

    public String nome() {
        return nome;
    }

    //Método para endereço

    public String endereço() {
        return endereco;
    }

    //Método para telefone

    public String telefone() {
        return telefone;
    }

}



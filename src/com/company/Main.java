package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("ORGANIZAÇÕES ANN");

        //Instanciando objeto Fornecedor

        Fornecedor fornecedor = new Fornecedor("Bárbara", "Canitar", "21991502997", 1000, 500);

        fornecedor.setValorDivida(500);
        System.out.println("Total da dívida do fornecedor R$ " + fornecedor.obterSaldo());
        fornecedor.setValorCredito(1000);
        System.out.println("O valor do saldo do fornecedor com os descontos da dívida e com o valor do crédito é de R$ " + fornecedor.obterSaldo());
        System.out.println("___________________________________________________________________________________________________________");

        //Instanciando objeto Colaborador

        Colaborador colaborador = new Colaborador("Matheus", "Canitar", "219999990", 036, 2000, 150);
        colaborador.setSalarioBase(2000);
        System.out.println("Este é o valor da salário do colaborador R$ " + colaborador.calcularSalario());
        System.out.println("___________________________________________________________________________________________________________");

        //Instanciando objeto Administrador

        Administrador administrador = new Administrador("Rafael", "Canitar", "2188877666", 456, 10000, 300, 200);
        administrador.setSalarioBase(10000);
        System.out.println("Este é o valor da salário do administrador R$ " + administrador.calcularSalario());
        System.out.println("____________________________________________________________________________________________________________");
    }
}

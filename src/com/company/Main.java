package com.company;

public class Main {

    public static void main(String[] args) {

        //Instanciando objeto Fornecedor

        Fornecedor fornecedor = new Fornecedor("Bárbara","Canitar","21991502997", 1000, 500);
        System.out.println(fornecedor.obterSaldo());
        fornecedor.setValorDivida(500);
        System.out.println(fornecedor.obterSaldo());
        fornecedor.setValorCredito(1000);
        System.out.println("O valor do saldo do fornecedor é R$ "+ fornecedor.obterSaldo());

        //Instanciando objeto Colaborador

        Colaborador colaborador = new Colaborador("Matheus", "Canitar","219999990",036,2000, 150);

        //Instanciando objeto Administrador

        Administrador administrador = new Administrador("Rafael", "Canitar","2188877666", 456,10000,300,200);


    }
}

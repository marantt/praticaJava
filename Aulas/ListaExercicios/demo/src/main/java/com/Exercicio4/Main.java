package com.Exercicio4;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Jesus", 2000.00, 1500.00);

        System.out.println(cliente1.obterNome());
        cliente1.depositarQuantia(6000.00);
        System.out.println(cliente1.checarSaldo());
        cliente1.sacarQuantia(5000.00);
        System.out.println(cliente1.checarSaldo());

        

    }

}

package com.simuladoprova.Exercicio1;

import java.util.ArrayList;

/*
Exercıcio 1. Um passageiro possui nome e pode ser estudante ou nao. Em
um onibus, passageiros podem ser alocados no sistema de compra de passagem
ao onibus. O preco da passagem e definido para cada onibus e sabe-se que um
passageiro estudante paga meia. O sistema pode listar os passageiros, listar os
estudantes apenas e calcular o total de venda de passagens.
(a) Esboce um diagrama de classes;
(b) Implemente as classes e escreva um pequeno teste.

 */


public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<Passageiro> passageiros = new ArrayList<>();

        Onibus onibus = new Onibus(passageiros, 10);

        Passageiro pass1 = new Passageiro("Marco", true);
        Passageiro pass2 = new Passageiro("Yuri", true);
        Passageiro pass3 = new Passageiro("Manoel", false);
        Passageiro pass4 = new Passageiro("Eduardo", false);

        onibus.adicionarPassageiro(pass1);
        onibus.adicionarPassageiro(pass2);
        onibus.listarStudent();
        System.out.println(onibus.totalPrice());
        System.out.println("***************");
        onibus.adicionarPassageiro(pass3);
        onibus.adicionarPassageiro(pass4);
        onibus.listarStudent();
        System.out.println("**************");
        onibus.listarTodos();
        System.out.println("**************");
        System.out.println(onibus.totalPrice());

        
    }
}
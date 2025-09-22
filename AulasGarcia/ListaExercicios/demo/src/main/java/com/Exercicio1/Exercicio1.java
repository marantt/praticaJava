package com.Exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {

        Churrasco churrasco1 = new Churrasco();

        Pessoa pessoa1 = new Pessoa("Marco", "Masculino", 21, false);
        Pessoa pessoa2 = new Pessoa("Scarlet", "Feminino", 27, false);
        Pessoa pessoa3 = new Pessoa("Yuri", "Masculino", 12, false);
        Pessoa pessoa4 = new Pessoa("Eduardo", "Masculino", 42, true);

        churrasco1.verificarConsumo(pessoa1);
        churrasco1.verificarConsumo(pessoa2);
        churrasco1.verificarConsumo(pessoa3);
        churrasco1.verificarConsumo(pessoa4);

        System.out.println("Consumo: " + pessoa1.getNome() + " " + churrasco1.verificarConsumo(pessoa1));
        System.out.println("Consumo: " + pessoa2.getNome() + " " + churrasco1.verificarConsumo(pessoa2));
        System.out.println("Consumo: " + pessoa3.getNome() + " " + churrasco1.verificarConsumo(pessoa3));
        System.out.println("Consumo: " + pessoa4.getNome() + " " + churrasco1.verificarConsumo(pessoa4));
        

    }
}

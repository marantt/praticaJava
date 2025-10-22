package com.Exercicio4;

public class Cliente {

    private String nome;
    private double saldo;
    private double limite;

    public Cliente (String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String obterNome () {
        return nome;
    }

    public double sacarQuantia (double saque) {
        if (saque <= 0) {
        System.out.println ("O saque deve ser maior do que zero.");
        return this.saldo + this.limite;
        }
        else if (saque > (this.limite + this.saldo)) {
            System.out.println ("Não é possível sacar a quantia solicitada. Por favor, verifique.");
            return this.saldo + this.limite;
        }
        this.saldo -= saque;
        return this.saldo + this.limite;
    }

    public double depositarQuantia (double deposito) {
        this.saldo += deposito;
        return this.saldo + this.limite;
    }

    public double checarSaldo () {
        return saldo + limite;
    }
}


package com.aula02;

public class Cliente {

    Nivel nivel;
    String nome;
    double valorFatura;

    //Alt + insert e depois Generate Constructor.
    public Cliente(Nivel nivel, 
                   String nome, 
                   double valorFatura) {
        this.nivel = nivel;
        this.nome = nome;
        this.valorFatura = valorFatura;
    }

    public double calcularDesconto(){
        return switch (nivel) {
            case GOLD -> 0.99;
            case PLATINUM -> 0.98;
            default -> 0.95;
        };
    }

    public void mostrarDados(){
        System.out.println(nome);
        System.out.println(valorFatura);
        System.out.println(valorFatura*calcularDesconto());
        System.err.println(nivel);
    }

}

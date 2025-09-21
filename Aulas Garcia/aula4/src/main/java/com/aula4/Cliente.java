
package com.aula4;


//Cliente HAS-A Endereco
public class Cliente {

    private String nome;
    private Endereco endereco;

    public Cliente(Endereco endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        //Se nao houvesse o metodo mostrarEndereco(), deveriamos usar
        //getters para os 4 campos do Endereco.
        endereco.mostrarEndereco();
    }

}


package com.aula4;

public class Celular {
    
    private Bateria bateria;
    private String imei, nome;
    private EstadoCelular estado;

    public Celular(int carga, EstadoCelular estado, String imei, String nome) {
        bateria = new Bateria(carga);
        this.estado = estado;
        this.imei = imei;
        this.nome = nome;
    }

    public boolean estaLigado(){
        return estado == EstadoCelular.LIGADO;
    }

    public void mostrarNome(){
        if(estaLigado() && !bateria.estaVazio()){
            System.out.println("Nome: " + nome);
            bateria.descarregar();
        }
    }

    public void ligar(){
        if(!estaLigado() && !bateria.estaVazio()){
            estado = EstadoCelular.LIGADO;
            bateria.descarregar();
        }
    }

    public void desligar(){
        if(estaLigado())
            estado = EstadoCelular.DESLIGADO;
    }
    
}

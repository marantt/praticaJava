package com.aula4;

public class Bateria {

    private int carga;

    public Bateria(int carga) {
        this.carga = Math.max(0,Math.min(carga,100));
    }

    public void carregar(){
        if(carga < 100)
            carga++;
    }

    public void descarregar(){
        if(carga > 0)
            carga--;
    }

    public boolean estaVazio(){
        return (carga == 0);
    }
}

package com.simuladoprova.Exercicio2;

public class Semaforos {

    private Estado estado;

    public Semaforos(Estado estado) {
        this.estado = estado;
    }

    public void mudarProximo(){
        switch (this.estado) {
            case Vermelho:
                this.estado = Estado.Verde;
                break;
            case Verde:
                this.estado = Estado.Amarelo;
                break;
            case Amarelo:
                this.estado = Estado.Vermelho;
                break;
        }
    }

    public void mostrarEstado(){
        System.out.println(this.estado);
    }

    public void indicar(){
        switch (this.estado){
            case Verde -> System.out.println("Passe!");
            case Vermelho -> System.out.println("Espere!");
            case Amarelo -> System.out.println("Atencao!"); 
        }
    }


}

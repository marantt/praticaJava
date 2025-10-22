package com.Exercicio2;
/*
Exercıcio 2. Implemente uma classe Lampada com os seguintes componentes
e faca um teste ao final:
Atributos: estado(Enum) 
Metodos:
click(): ao chamar este metodo a lampada e colocada no estado ”apagada” caso esteja ”acesa” e e colocado no estado ”acesa” caso esteja ”apagada”.
qtdAcendimentos(): retorna quantas vezes a lampada foi acesa (DICA:
este metodo deve ser chamada no metodo acima).
checaEstado(): retorna o estado atual da Lampada.

 */
public class Lampada {

    private Estado estado;
    private int qtdClicks = 0;



    public Lampada(Estado estado) {
        this.estado = estado;
    }

    public int Click() {

        switch (this.estado) {
            case Acesa:
                this.estado = Estado.Apagada;
                qtdClicks++;
                break;
            case Apagada:
                this.estado = Estado.Acesa;
                qtdClicks++;
                break;
        }
        return qtdClicks;
    }

    public void qtdAcendimentos() {
        System.out.println(qtdClicks);
    }

    public void checaEstado() {
        System.out.println(this.estado);
    }

}

package com.Exercicio6;

import java.util.Random;

public class Sorteador {
    private int sort;

    public int sortearNumero(){
        Random sorteado = new Random(100);
        return this.sort = sorteado.nextInt();
    }

    public boolean advinharNumero(int chute) {
        return this.sort ==  chute;
    }
}

package com.Exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        
        Lampada lampada1 = new Lampada(Estado.Apagada);

        lampada1.Click();
        lampada1.checaEstado();
        lampada1.Click();
        lampada1.Click();
        lampada1.Click();
        lampada1.Click();
        lampada1.Click();
        lampada1.checaEstado();
        lampada1.qtdAcendimentos();
        
    }
}

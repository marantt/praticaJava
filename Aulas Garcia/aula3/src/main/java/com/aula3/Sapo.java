package com.aula3;

public class Sapo {

    private int qtPulo;
    private static int qtSapo;

    public Sapo(){
        qtSapo++;
    }

    public void pular(){
        qtPulo++;
    }

    public int getQtPulo(){
        return qtPulo;
    }

    public static int getQtSapo(){
        return qtSapo;
    }

}

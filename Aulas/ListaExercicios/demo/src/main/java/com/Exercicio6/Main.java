package com.Exercicio6;

public class Main {
    public static void main(String[] args) {
        Sorteador std = new Sorteador();

        std.sortearNumero();
        System.out.println(std.advinharNumero(3));
        System.out.println(std.advinharNumero(4));
        System.out.println(std.advinharNumero(10));
        System.out.println(std.advinharNumero(33));
        System.out.println(std.advinharNumero(53));
        System.out.println(std.advinharNumero(63));

    }
}

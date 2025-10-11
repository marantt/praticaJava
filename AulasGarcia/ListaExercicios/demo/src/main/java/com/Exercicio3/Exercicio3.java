package com.Exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Complexo complexo1 = new Complexo(0, 3.11);
        Complexo complexo2 = new Complexo(0.18, 0);

        System.out.println(complexo1.soma(complexo2));
        System.out.println(complexo1.multiplica(complexo2));
        System.out.println(complexo1.modulo());
        System.out.println(complexo2.modulo());
        System.out.println(complexo1.argumentoPrincipal());
        System.out.println(complexo2.argumentoPrincipal());

    }
    
}

package com.simuladoprova.Exercicio3;

/*
Exerc´ıcio 3. E necess´ario escrever um programa para gerar sa´ıdas na seguinte ´
forma (apenas um exemplo poss´ıvel): {produtoNome: ”CANETA”, preco: 2.30,
tipo: ”Escrit´orio”}. Escreva uma classe de forma a obter a sa´ıda desejada.
 */

public class Product {
    
    private String name;
    private double price;
    private String type;

    public Product (String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void showProduct() {
        System.out.println("{produtoNome: \"" + name + "\", preco: " + price + ", tipo: \"" + type + "\"}");
    }


}   

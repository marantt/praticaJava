package com.Exercicio5;

public class Triangulo {
    private double lado;
    private double perimetro;
    private double area;

    public Triangulo (double lado) {
        this.lado = lado;
    }

    public double getLado () {
        return this.lado;
    }

    public double calcArea () {
        return this.area = (this.lado*Math.cbrt(3))/2;
    }

    public double calcPerimetro () {
        return this.perimetro = 3*this.lado;
    }

}

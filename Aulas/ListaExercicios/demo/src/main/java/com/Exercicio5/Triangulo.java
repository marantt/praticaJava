package com.Exercicio5;

public class Triangulo {
    private double lado;
    private double perimetro;
    private double area;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public double calcArea() {
        return this.area = (Math.pow(this.lado, 2)*Math.sqrt(3))/4;
    }

    public double calcPerimetro() {
        return this.perimetro = 3*this.lado;
    }

    @Override
    public String toString() {
        double ld = getLado();
        double pmt = calcPerimetro();
        double ar = calcArea();
        String result = String.format("Tamanho do lado: %.2f.\nPerimetro: %.2f.\nArea: %.2f.", ld, pmt, ar);
        return result;
    }

}

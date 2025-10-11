package com.Exercicio3;

/*
Exercıcio 3. Implemente uma classe chamada Complexo para representar
numeros imaginarios e esta deve possuir:
• Atributos: dois doubles a (Parte real) e b (Parte imaginaria).
• Metodos:
1. Construtor;
2. soma(): recebe via parametro outro numero complexo (objeto desta
classe) e efetua sua soma, ou seja, parte real sera somada com parte
real e parte imaginaria com parte imaginaria.
3. multiplica(): recebe via parˆametro outro complexo (objeto desta
classe) e efetue a f´ormula (a + bi) · (c + di) = (ac − bd) + (ad + bc)i
4. toString(): Mostra uma string na tela com os atributos a e b na
notacao Complexa a + bi;
1
5. modulo(): retorna o m´odulo do n´umero complexo que ´e dado por
√
a
2 + b
2
6. argumentoPrincipal(): retorna o ˆangulo formado pelo n´umero complexo no plano de Argand-Gauss, que ´e dado pela f´ormula θ =
tan−1

b
a


 
 */

public class Complexo {

    private double a;
    private double b;

    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() { 
        return a;
    }

    public double getB() {
        return b;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(this.a + c.a, this.b + c.b);
    }

    public Complexo multiplica(Complexo c) {
        return new Complexo((this.a * c.a - this.b * c.b), (this.a * c.b + this.b * c.a));
    }

    @Override
    public String toString() {
        String result = String.format("%f + %fi", this.a, this.b);
        return result;
    }

    public double modulo() {
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
    }

    public double argumentoPrincipal() {
        return Math.atan(this.b/this.a);
    }

}

    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() { 
        return a;
    }

    public double getB() {
        return b;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(this.a + c.a, this.b + c.b);
    }

    public Complexo multiplica(Complexo c) {
        return new Complexo((this.a * c.a - this.b * c.b), (this.a * c.b + this.b * c.a));
    }

    

}


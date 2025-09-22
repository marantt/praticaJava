package com.Exercicio3;

/*
Exerc´ıcio 3. Implemente uma classe chamada Complexo para representar
n´umeros imagin´arios e esta deve possuir:
• Atributos: dois doubles a (Parte real) e b (Parte imaginaria).
• M´etodos:
1. Construtor;
2. soma(): recebe via parametro outro numero complexo (objeto desta
classe) e efetua sua soma, ou seja, parte real sera somada com parte
real e parte imaginaria com parte imaginaria.
3. multiplica(): recebe via parˆametro outro complexo (objeto desta
classe) e efetue a f´ormula (a + bi) · (c + di) = (ac − bd) + (ad + bc)i
4. toString(): Mostra uma string na tela com os atributos a e b na
nota¸c˜ao Complexa a + bi;
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

    private double a,b;

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

    public double soma() {
        this.a =+ this.a.
    }

}

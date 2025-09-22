package com.Exercicio1;

/*
Fa¸ca agora uma classe Churrasco que possua: Atributos: qtdCarne(double); M´etodo: verificarConsumo():
Recebe via parˆametro uma Pessoa e com isto define a consuma¸c˜ao m´edia de
carne (quantidade de carne consumida) pessoas de 0 a 3 anos n˜ao consomem,
vegetarianos tamb´em n˜ao. Pessoas de 4 a 12 anos consomem 1 kilo de carne e
de 13 anos em diante 2 kilos de carne.
 

 */
public class Churrasco {

    private double qtdCarne;

    public double verificarConsumo(Pessoa pessoa) {
        if(pessoa.ehVegetariana() || pessoa.getIdade() >= 0 && pessoa.getIdade() <= 3) {
            qtdCarne = 0;
        }else if(pessoa.getIdade() <= 12){
            qtdCarne = 1;
        }else {
            qtdCarne = 2;
        }
        return qtdCarne;
    }
}

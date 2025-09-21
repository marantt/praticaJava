
package com.aula02;

//Queremos modelar um contador. Um contador pode contar
//para frente (incremento) ou para trás (decremento).
//Se a acao tiver setada para incremento, deve-se somar 1
//ao estado interno da maquina (contagem), se a acao estiver
//com decremento, deve-se subtrair 1. É possível, também,
//zerar o contador.
public class Contador {

    Acao acao;
    int contagem;

    Contador(Acao acao, int contagem){
        this.acao = acao;
        this.contagem = contagem;
    }

    public void realizarAcao(){
        switch (acao) {
            case INC -> contagem++;
            case DEC -> {
                if(contagem > 0)
                    contagem--;
            }
        }
    }

    public void mostrarContagem(){
        System.out.println(contagem);
    }

    public void zerar(){
        contagem = 0;
    }

}

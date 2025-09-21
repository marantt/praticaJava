package com.simuladoprova.Exercicio2;


/*
 Exerc´ıcio 2. Desenvolva uma classe chamada Semaforo, representando um
sem´aforo de tr´afego, com as seguintes especifica¸c˜oes:
• Um campo privado chamado estado que armazena o estado atual do
sem´aforo. O estado do sem´aforo pode ser ”Verde”, ”Amarelo” ou ”Vermelho”.
• Um m´etodo mudarProximo() que altera o estado do sem´aforo para o pr´oximo
estado na sequˆencia padr˜ao (Verde ⇒ Amarelo ⇒ Vermelho ⇒ Verde).
• Um m´etodo mostrarEstado() que imprime o estado atual do sem´aforo.
• Um m´etodo indicar() que indica o que um carro deve fazer de acordo
com o estado
 */

public class Exercicio2 {
public static void main(String[] args) {
    
    Semaforos semaforo = new Semaforos(Estado.Verde);

    semaforo.mostrarEstado();
    semaforo.indicar();
    semaforo.mudarProximo();
    semaforo.mostrarEstado();
    semaforo.indicar();
    semaforo.mudarProximo();
    semaforo.mostrarEstado();
    semaforo.indicar();

    }
}

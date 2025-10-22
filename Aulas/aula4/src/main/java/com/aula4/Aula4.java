
package com.aula4;

public class Aula4 {

    public static void main(String[] args) {
        //Bateria bat = new Bateria(10);
        Celular cel = new Celular(10, EstadoCelular.LIGADO, "281581818", "Eu");
        cel.mostrarNome();
        cel.desligar();
        cel.mostrarNome();
    }
}

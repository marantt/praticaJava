package com.teste;

import com.aula3.Sapo;

public class Aula3 {

    public static void main(String[] args) {
        Sapo s1 = new Sapo();
        Sapo s2 = new Sapo();
        Sapo s3 = new Sapo();
        s1.pular();
        s2.pular();
        s3.pular();
        System.out.println(s1.getQtPulo());
        System.out.println(s2.getQtPulo());
        System.out.println(s3.getQtPulo());
        System.out.println(Sapo.getQtSapo());
        //try {
        //    Aluno a1 = new Aluno(21,"Lorena", 176.25);
        //    a1.setNome("");
        //    a1.encerrarMateria(7.25);
        //    a1.setNota(-2);
        //    a1.mostrarNota();
        //} catch (Exception ex) {
        //    System.out.println("Nome invalido");
        //}
        //Foo f = new Foo();
            //f.x = 5; //ACESSO DE ESCRITA BLOQUEADO, POIS x EH PRIVATE
            //f.setX(5); //Escrita liberada
            //System.out.println(f.getX()); //Leitura liberada
            //System.out.println(f.x); //ACESSO DE LEITURA BLOQUEADO
            //f.y = 7; //EVITAR
            //System.out.println(f.y); //EVITAR
            
            //f.z = 8;
            //System.out.println(f.z);
    }
}

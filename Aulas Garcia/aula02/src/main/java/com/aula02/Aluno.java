package com.aula02;

public class Aluno {

    String ra, nome;
    Curso curso;

    Aluno(String ra, String nome, Curso curso){
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    public void mostrarNome(){
        System.out.println("O nome eh: " + nome);
    }

    public void mostrarRA(){
        System.out.println(ra);
    }

    //metodo que possui retorno valorado.
    //Lembrete: O metodo void nao possui retorno valorado
    public Curso mostrarCurso(){
        return curso;
    }

    //Metodo que n faz sentido aqui. Sera apenas um exemplo.
    public void detalhesCurso(){
        //No caso do switch, podemos retirar o Curso.
        switch(curso){
            case ADS -> System.out.println("CURSO DE COBOL C/ RH");
            case SI -> {
                System.out.println("CURSO DE DESIGN");
                System.err.println("OUTRA MSG");
            }
            case CD -> System.out.println("CURSO DE PYTHON");
            case RH -> System.out.println("CURSO DE HUMANAS");
            default -> System.out.println("OUTRO CURSO");
        }
    }

}

package com.aula3;

public class Aluno {

    private String nome;
    private int materiasCompletas;
    private double somaNotas; //PR N normalizado
    private final int TOTAL = 42; //constante

    public Aluno(int materiasCompletas, 
                 String nome, 
                 double somaNotas) throws Exception {
        this.materiasCompletas = 
            Math.min(TOTAL,Math.max(0,materiasCompletas));
        
        //Para ficar melhor, usar regex
        if(nome.equals(""))
           throw new Exception("Nome nao pode ser nulo");
        this.nome = nome; 
        
        this.somaNotas = Math.max(0, somaNotas);
    }

    public void encerrarMateria(double nota){
        somaNotas = somaNotas + Math.max(0,Math.min(nota,10));
        materiasCompletas++;
    }

    public void mostrarNota(){
        System.out.println("Nome: " + nome);
        System.out.println("PR: " + somaNotas / materiasCompletas);
        System.out.println("Completas: " + materiasCompletas);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota){
        this.somaNotas = nota;
    }

}

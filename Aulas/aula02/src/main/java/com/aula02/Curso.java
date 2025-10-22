
package com.aula02;

public enum Curso {

    ADS("ANAL E DESENV DE SIST"), 
    SI("SIST P INTERNET"), 
    CD("CIENCIA DE DADOS"), 
    RH("GESTAO P RH"), 
    GE("GESTAO EMP"), 
    GP("GESTAO PORT"), 
    LOG("LOGISTICA");

    String nome;

    Curso(String nome){
        this.nome = nome;
    }

}

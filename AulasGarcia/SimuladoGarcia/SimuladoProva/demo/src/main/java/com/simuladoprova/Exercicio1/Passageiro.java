package com.simuladoprova.Exercicio1;

public class Passageiro {
    
        private String nome;
        private boolean isStudent = false;

        public Passageiro (String nome, boolean isStudent) {
            this.nome = nome;
            this.isStudent = isStudent;
        }

        public String getNome() {
            return nome;
        }

        public boolean isStudent (){
            return isStudent;
        }

}

package com.simuladoprova.Exercicio1;
import java.util.ArrayList;

public class Onibus {

        private double price;
        private ArrayList<Passageiro> passageiros;
        
        public Onibus(ArrayList<Passageiro> passageiros, double price){
                this.passageiros = passageiros;
                this.price = price;
        }
        
        public ArrayList<Passageiro> getPassageiros(){
                return passageiros;
        }

        public double getPrice(){
                return price;
        }

        public void adicionarPassageiro(Passageiro passageiro){
                this.passageiros.add(passageiro);
        }

        public void listarTodos(){
                for (Passageiro passageiro : passageiros) {
                System.out.println(passageiro.getNome());
                }
        }

        public void listarStudent(){
                for (Passageiro passageiro : passageiros) {
                if(passageiro.isStudent())
                System.out.println(passageiro.getNome());
                }
        }

        public double totalPrice(){

                double total = 0;
                
                for (Passageiro passageiro : passageiros) {
                        total += passageiro.isStudent() ? this.price/2 : this.price;
                }
                return total;
        }
}
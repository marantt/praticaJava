package Basicos;

/*
 * Enunciado: Crie um programa que solicite ao usuário seu nome e idade. Em seguida, exiba uma mensagem personalizada no formato: "Olá [nome], você tem [idade] anos!".
 * Requisitos:

 * Use a classe Scanner para receber entrada do usuário

 * Trate possíveis exceções de entrada

 * Exiba a mensagem formatada
 */

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int idade = 0;
        boolean idadevalida = false;   

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        while (!idadevalida){
            try {
                System.out.print("Digite sua idade: ");
                idade = sc.nextInt();
                idadevalida = true;
            } catch (Exception e) {
                System.out.println("Voce digitou um numero invalido, por favor verifique");
                sc.nextLine();
            }
        }
        

        System.out.println("Ola " + nome + ", voce tem " + idade + " anos!");
        sc.close();
    }

}
package Basicos;

import java.util.Scanner;

/*
 * Enunciado: Crie um programa que solicite ao usuário um número inteiro e verifique:

 * Se o número é positivo, negativo ou zero

 * Se o número é par ou ímpar
 * Requisitos:

 * Use estruturas condicionais (if/else)

 * Considere todos os casos possíveis
 */

public class exercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean numerovalido = false;

        while(!numerovalido){
            try {
                System.out.print("Digite um numero inteiro: ");
                numero = sc.nextInt();
                numerovalido = true;
            } catch (Exception e) {
                System.out.println("Voce digitou um numero invalido, por favor verifique!");
                sc.nextLine();
            }
        }
            
            
            if(numero > 0 && numero%2 == 0)
                System.out.println(numero + " eh positivo e par.");
                else if (numero > 0 && numero%2 != 0) 
                    System.out.println(numero + " eh positivo e impar.");
                    else if (numero == 0)
                        System.out.println(numero + " eh neutro e par.");
                        else if(numero < 0 && numero%2 == 0)
                            System.out.println(numero + " eh negativo e par.");
                            else  
                                System.out.println(numero + " eh negativo e impar.");
 
            
            
            sc.close();
        }
    
}


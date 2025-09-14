package Basicos;

import java.util.Scanner;


/*
 * Enunciado: Crie um programa que solicite ao usuário 5 números inteiros e, ao final, exiba:

 * A soma de todos os números

 * A média dos números

 * O maior número digitado

 * O menor número digitado

 * Requisitos:

 * Use um loop (for ou while)

 * Valide as entradas (trate exceções)
 * 
 */


public class exercico3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number[];
        boolean validnumber = false;

        while(!validnumber){
            try {
                for(int i; number[i] < 6; i++){
                    System.out.println("Digite 5 numeros inteiros:");
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }


    }
}

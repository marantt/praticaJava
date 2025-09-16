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
        
        int soma = 0;
        int maior = Integer.MIN_VALUE; // menor valor possivel
        int menor = Integer.MAX_VALUE; // maior valor possivel

        for (int i = 0; i < 5; i++){
            try {
                System.out.print("Digite o " + (i+1) + "º numero: ");
                int numero = sc.nextInt();
                
                soma += numero;
                if(numero > maior)
                    maior = numero;
                    else if(numero < menor)
                        menor = numero;
                        
            } catch (Exception e) {
                System.out.println("Numero invalido! Por favor verifique.");
                sc.nextLine();
                i--;
            }
        }

        double media = (double) soma/5;

        System.out.println("Soma: " + soma);
        System.out.println("media: " + media);
        System.out.println("Maior: " + maior);    
        System.out.println("Menor: " + menor);

        sc.close();
    }
}

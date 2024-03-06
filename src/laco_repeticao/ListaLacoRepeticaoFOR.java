package laco_repeticao;

import java.util.Scanner;

public class ListaLacoRepeticaoFOR {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número 
		 * deve ser menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na 
		 * tela informando que o intervalo é inválido e sair do programa. 
		 No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.*/
		
		Scanner read = new Scanner(System.in);
		
		// Declaração de Variáveis
		int a=0, b, contador=0;
		
		// Entrada de Dados
		System.out.println("Digite o valor do primeiro número: ");
		a= read.nextInt();
		System.out.println("Digite o valor do segundo número: ");
		b= read.nextInt();
		
		//Saída e processamento de dados
		
		if(a>b) {
			System.out.println("Intervalo inválido!");
		}
		else {
		
			for(contador=a; contador<=b; contador++) {
			
				if (contador%3==0 && contador%5==0) {
					
					System.out.println(contador +" é divisível por 3 e por 5!");
				}
			
			}
		}

	}

}

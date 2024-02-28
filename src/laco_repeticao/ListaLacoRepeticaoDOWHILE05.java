package laco_repeticao;

import java.util.Scanner;

public class ListaLacoRepeticaoDOWHILE05 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o 
		 * número zero seja digitado. Ao final, mostre na tela a soma de todos os números
		 *  digitados, que sejam positivos.*/
		
		Scanner read= new Scanner(System.in);
		
		//Declaração de variáveis
		int numero, soma_positivos=0;
		
		//Entrada de dados
		
		do {
			System.out.println("Digite um número: ");
			numero = read.nextInt();
			if (numero>0) {
				soma_positivos  = soma_positivos + numero;
			}
		}
		while (numero!=0);
		
		System.out.println("A soma dos números positivos é: "+ soma_positivos);

	}

}

package laco_repeticao;

import java.util.Scanner;

public class ListaLacoRepeticaoFOR02 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
		mostre na tela quantos números são pares e quantos número são ímpares*/
		
		Scanner read = new Scanner(System.in);
		
		//Declaração de Variáveis
		
		int numl, pares=0, impares=0, contador;
		
		//Entrada de Dados
		
		for(contador=0;contador<10; contador++ ) {
			System.out.println("Digite o " + (contador +1) + "º número");
			numl= read.nextInt();
			if ( numl %2 ==0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		System.out.println("\n Total de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);
		
		
	}

}

package laco_repeticao;

import java.util.Scanner;

public class ListaLacoRepeticaoWhile03 {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
		 * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos 
		 * e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve 
		 * ser finalizada ao digitar uma idade negativa.*/
		
		Scanner read = new Scanner(System.in);
		//Declaração de variáveis
		
		int menores=0, maiores=0, idade=1, teste;
		
		//Entrada de Dados
		
		while(idade>0) {
			System.out.println("Digite uma idade: ");
			idade= read.nextInt();
			
				if(idade>50) {
				maiores++;
				}
				else if(idade<21) {
				menores++;
				}
		}
		
		System.out.println("\n Total de maiores de 50: " + maiores);
		System.out.println("\n Total de menores de 21: " + (menores-1));
	}

}

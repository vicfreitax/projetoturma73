package laco_repeticao;

import java.util.Scanner;

public class ListaLacoRepeticaoFOR {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		// Declaração de Variáveis
		int a, b, contador=0, intervalo=0, numero=0;
		
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
			System.out.println("No intervalo entre "+ a + " e "+ b + ":");
			intervalo= b-a;
			for(contador=0; intervalo<=contador; contador++) {
			numero = intervalo-- ;
			}
		}

	}

}

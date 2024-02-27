package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Declaração de variáveis
		
		int x;
		int y;
		
		//Entrada de dados
		System.out.println("Digite um valor inteiro para X: ");
		x = leia.nextInt();
		
		System.out.println("Digite um valor inteiro para Y: ");
		y = leia.nextInt();
		
		//Processamento
		
		if (x > y) {
			System.out.println("X é maior que Y.");
		}
		else if (x==y) {
			System.out.println ("X é igual a Y.");
		}
		else {
			System.out.println("Y é maior que X.");
		}
		
	}

}

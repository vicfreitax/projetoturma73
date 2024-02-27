package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		//Declaração de Variáveis
		int idade;
		boolean carteiraM;
		
		//Entrada de Dados
		
		System.out.println("Qual a sua idade? ");
		idade = leia.nextInt();
		
		System.out.println("Possui carteira? (true/false) ");
		carteiraM = leia.nextBoolean();
		
		//Processamento
		
		if (idade>= 18 && carteiraM) {
			System.out.println("Pode dirigir!");
		}
		else {
			System.out.println("Não pode dirigir!");
		}
		
	}

}

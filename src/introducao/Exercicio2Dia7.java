package introducao;

import java.util.Scanner;

public class Exercicio2Dia7 {

	public static void main(String[] args) {
		
		// Variáveis
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		// Entrada de Dados
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual foi sua primeira nota? ");
		nota1 = leia.nextFloat();
		
		System.out.println("Qual foi sua segunda nota? ");
		nota2 = leia.nextFloat();
		
		System.out.println("Qual foi sua terceira nota? ");
		nota3 = leia.nextFloat();
		
		System.out.println("Qual foi sua quarta nota? ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Sua média de notas é de: %.1f ", media);

	}

}

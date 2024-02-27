package lacos_condicionais;

import java.util.Scanner;

public class Lista01LacoCondicionalIf02 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		// Declaração de Variáveis
		
		int number;
		
		//Entrada de dados
		
		System.out.println("Digite um número inteiro: ");
		number = leia.nextInt();
		
		//lógica
		
		if (number>0 && ((number%2)==0)) {
			
			System.out.printf("O número %d é par e positivo!", number);
			
		}
		
		else if(number==0) {
			System.out.printf("O número %d é par e neutro!", number);

		}
		
		else if(number<0 && ((number%2)==0) ) {
			System.out.printf("O número %d é par e negativo!", number);

		}
		else if(number<0 && ((number%2)!=0) ) {
			System.out.printf("O número %d é ímpar e negativo!", number);
		}
		
		else {
			System.out.printf("O número %d é ímpar e positivo!", number);

		}
		

	}

}

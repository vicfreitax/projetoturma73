package lacos_condicionais;

import java.util.Scanner;

public class Lista02LacosCondicionaisSwitch01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		// Declaração de Variáveis
		int codigo, quantidade, total;
		
		// Entrada de dados
		
		System.out.println("Por favor digite o código de seu produto entre 1 e 6.");
		codigo =  read.nextInt();
		
		System.out.println("Certo. Agora me diga a quantidade que você gostaria: ");
		quantidade = read.nextInt();
		
		// Processamento de dados
		
		switch(codigo) {
		case 1:
			codigo = 10;
			break;
		case 2:
			codigo = 15;
			break;
		case 3:
			codigo = 18;
			break;
		case 4:
			codigo = 12;
			break;
		case 5:
			codigo = 8;
			break;
		case 6:
			codigo = 13;
			break;
			
		}
		
		total = codigo*quantidade;
		
		//Saída de dados
		
		System.out.printf("O valor total do seu pedido é de %d.", total);

	}

}

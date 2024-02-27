package lacos_condicionais;

import java.util.Scanner;

public class Lista01LacoCondicionalIf {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		//Declaração de Variáveis
		
		int a, b, c, soma;
		
		//Entrada de Dados
		
		System.out.println("Digite o valor para A: ");
		a = read.nextInt();
		
		System.out.println("Digite o valor para B: ");
		b = read.nextInt();
		
		System.out.println("Digite o valor para C: ");
		c = read.nextInt();
		
		//Lógica e saída de dados
		
		soma = a+b;
		
		if (c>soma) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		else if (c==soma) {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		else {
			System.out.println("A Soma de A + B é Maior do que C");
		}

	}

}

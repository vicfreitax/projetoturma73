package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Variáveis
		float salario_bruto, adicional_noturno, horas_extras, descontos, salario_liquido;
		
		//Criação do leia
		Scanner leia= new Scanner(System.in);
		
		//Entrada de Valores
		
		System.out.println("Qual o valor bruto do seu salário? ");
		salario_bruto = leia.nextFloat();
		
		System.out.println("Qual o valor do seu adicional noturno? ");
		adicional_noturno = leia.nextFloat();
		
		System.out.println("Qual o valor das suas horas extras? ");
		horas_extras = leia.nextFloat();
		
		System.out.println("Qual o valor dos seus descontos? ");
		descontos = leia.nextFloat();
		
		//Expressão aritimética
		
		salario_liquido = salario_bruto + (horas_extras * 5) + adicional_noturno - descontos;

		// Saída de dados
		
		System.out.printf("O valor do seu salario líquido é de %.2f ", salario_liquido," reais.");
	}

}

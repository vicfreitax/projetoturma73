package introducao;

import java.util.Scanner;

public class ExercicioComplementar1 {

	public static void main(String[] args) {
		// Declaração de variáveis
		
		float a, b, soma, divisao, diferenca, multiplicacao;
	
		//Entrada de dados
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextFloat();
			
		System.out.println("Digite o valor de B: ");
		b = leia.nextFloat();
		
		//Operação aritimética
		
		soma = a + b;
		diferenca = a - b;
		multiplicacao = a*b;
		divisao= a/b;
		
		//Saída de dados
		System.out.println("O valor da soma de A mais B é: " + soma);
		System.out.println("O valor da diferença entre A e B é: " + diferenca);
		System.out.println("O valor da multiplicação de A por B é: " + multiplicacao);
		System.out.println("O valor da divisão de A por B é: " + divisao);



	}

}

package introducao;

import java.util.Scanner;

public class ExercicioComplementar4 {

	public static void main(String[] args) {
		// Declaração de variáveis
		
		int nota100, nota50, nota20, nota10, nota5, nota2, nota1, valor;
		Scanner leia= new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite o valor: ");
		valor = leia.nextInt();
		
		// Operação lógica
		
		nota100 = valor/100;
		valor %= 100;
		
		nota50 = valor/50;
		valor %= 50;
		
		nota20 = valor/20;
		valor %= 20;
		
		nota10 = valor/10;
		valor %= 10;
		
		nota5 = valor/5;
		valor %= 5;
		
		nota2 = valor/2;
		valor %= 2;
		
		nota1 = valor/1;
		valor %= 1;
		
		//Saída de dados
		
		System.out.printf("%d notas de 100", nota100);
		System.out.println();
		System.out.printf("%d notas de 50", nota50);
		System.out.println();
		System.out.printf("%d notas de 20", nota20);
		System.out.println();
		System.out.printf("%d notas de 10", nota10);
		System.out.println();
		System.out.printf("%d notas de 5", nota5);
		System.out.println();
		System.out.printf("%d notas de 2", nota2);
		System.out.println();
		System.out.printf("%d notas de 1", nota1);
		
	}

}

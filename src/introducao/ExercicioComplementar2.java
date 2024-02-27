package introducao;

import java.util.Scanner;

public class ExercicioComplementar2 {

	public static void main(String[] args) {
		// Declaração de variáveis
		
		double pi=3.14159, raio, area;
		
		//Entrada de dados
		
		Scanner leia= new Scanner(System.in);
		System.out.println("Raio: ");
		raio = leia.nextDouble();
		
		//Operação aritimética
		area= pi*(raio*raio);
		
		//Saída de dados
		System.out.printf("Area: %.4f", area);

	}

}

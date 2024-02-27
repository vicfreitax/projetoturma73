package introducao;

import java.util.Scanner;

public class ExercicioComplementar3 {

	public static void main(String[] args) {
		// Declaração de Variáveis
		int segundos, minutos, horas;
		
		Scanner leia= new Scanner(System.in);
		
		//Leitura de dados
		System.out.println("Digite o valor em segundos: ");
		segundos= leia.nextInt();
		
		//Operação aritimética
		horas= segundos/3600;
		segundos %= 3600;
		
		minutos= segundos/60;
		segundos %=60;
		
		//Saída de dados
		System.out.printf("Valor formatado: %d:%d:%d", horas, minutos, segundos);
	}

}

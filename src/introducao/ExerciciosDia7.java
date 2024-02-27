	package introducao;

import java.util.Scanner;

public class ExerciciosDia7 {

	public static void main(String[] args) {
		// Variáveis
		int salario;
		int abono;
		int novosalario;
		
		//Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira aqui o seu salário: ");
		salario = leia.nextInt();
		
		System.out.println("Insira aqui o seu abono: ");
		abono = leia.nextInt();
		
		novosalario = salario + abono;
		
		System.out.println("Seu novo salário é de " + novosalario +" reais.");

	}

}
package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		//Variáveis
		String nome;
		int idade;
		
		//Entrada de Dados
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira aqui o seu nome: ");
		nome= leia.next();
		
		System.out.println("Insira aqui a sua idade: ");
		idade= leia.nextInt();
		
		//concatenação: juntar um texto com uma outra variável
		// Saída de Dados
		System.out.println("Bom dia, " + nome);
		System.out.println("A sua idade é " + idade + " anos. ");

	}

}

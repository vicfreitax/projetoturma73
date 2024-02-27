package lacos_condicionais;

import java.util.Scanner;

public class Lista02LacosCondicionaisSwitch02 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// Declaração das variáveis
		String	NOME;
		int codigocargo;
		float r=0.0f, salario, novosalario;
		
		// Entrada de dados
		
				System.out.println("Por favor digite o nome do colaborador: ");
				NOME= read.next();
				
				System.out.println("Certo. Agora me diga o código do cargo: ");
				codigocargo = read.nextInt();
				
				System.out.println("Por fim, qual o valor do seu salário? ");
				salario = read.nextFloat();

		// Processamento de dados
				
				switch(codigocargo) {
				case 1:
					r = 0.10f;
					break;
				case 2:
					r = 0.07f;
					break;
				case 3:
					r = 0.09f;
					break;
				case 4:
					r = 0.06f;
					break;
				case 5:
					r = 0.05f;
					break;
				case 6:
					r = 0.08f;
					break;
				default:
					r = 0.00f;
					break;
				}
				
				novosalario = salario + ( r * salario);
				
				// Processamento de dados para saída
				switch(codigocargo) {
				case 1:
					System.out.println("Nome do colaborador: "+ NOME);
					System.out.println("Cargo: Gerente");
					System.out.printf("Salário: %.2f", novosalario);
					System.out.println();
					break;
				case 2:
					System.out.println("Nome do colaborador: "+ NOME);
					System.out.println("Cargo: Vendedor");
					System.out.printf("Salário: %.2f", novosalario);
					System.out.println();
					break;
				case 3:
					System.out.println("Nome do colaborador: "+ NOME);
					System.out.println("Cargo: Supervisor");
					System.out.printf("Salário: %.2f", novosalario);
					System.out.println();
					break;
				case 4:
					System.out.println("Nome do colaborador: "+ NOME);
					System.out.println("Cargo: Motorista");
					System.out.printf("Salário: %.2f", novosalario);
					System.out.println();
					break;
				case 5:
					System.out.println("Nome do colaborador: "+ NOME);
					System.out.println("Cargo: Estoquista");
					System.out.printf("Salário: %.2f", novosalario);
					System.out.println();
					break;
				case 6:
					System.out.println("Nome do colaborador: "+ NOME);
					System.out.println("Cargo: Técnico de TI");
					System.out.printf("Salário: %.2f", novosalario);
					System.out.println();
					break;
					
				}

	}
	
	
}

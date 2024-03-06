package vetor_matriz;

import java.util.Scanner;

public class TarefaMatriz {

	public static void main(String[] args) {
		float notas[][] = new float [10][4];
		float medias[] = new float[10];
		Scanner read = new Scanner(System.in);
		
		for (int linha=0; linha <10; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Digite um valor para a nota do " + (coluna+1) + "º bimestre do "+ (linha +1)+ "º alune:");
				notas[linha][coluna] = read.nextFloat();
			}
		}
		
		//Processamento de dados:
		
		for (int linha=0; linha <10; linha++) {
			int somaNotas=0;
			for (int coluna = 0; coluna < 4; coluna++) {
				somaNotas += notas [linha] [coluna];
			}
			medias[linha] =somaNotas/4.0f;
		}
		
		//Saída de dados:
		for (int linha=0; linha <10; linha++) {
			System.out.printf("A média do "+ (linha+1) + "º aluno é: %.1f%n", medias[linha]);
		}
		read.close();
		
	}

}

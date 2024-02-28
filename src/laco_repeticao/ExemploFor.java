package laco_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		String nome1, nome2, nome3;
		int contador;
        Scanner leia = new Scanner(System.in);
        
        for(contador = 0;contador <= 2 ; contador++) {
        	  
            System.out.println("Digite o 1º nome: ");
            nome1 = leia.nextLine();
            System.out.println("O 1º nome é: " + nome1);
        }
      
        
     
	}

}

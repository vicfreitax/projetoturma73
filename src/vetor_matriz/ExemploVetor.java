package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
	
        Scanner leia = new Scanner(System.in);
        String cachorros [] = new String [3];
        int indice;
        
        for(indice=0; indice<3; indice++) {
        	System.out.println("Digite o " + (indice + 1)+ "º nome: ");
        	cachorros[indice] = leia.nextLine();
        	}
        		

	}

}

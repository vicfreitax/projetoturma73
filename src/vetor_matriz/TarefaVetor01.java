package vetor_matriz;

import java.util.Scanner;

public class TarefaVetor01 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		//Declaração
        int numeros [] = {
        		2, 6, 7, 8, 9, 10, 23, 16, 1, 4
        };
        int numero, indice=0, posicao=0;
        boolean achou=false;
        System.out.println("Digite um número que deseja procurar: ");
       
        numero=read.nextInt();
       
        while(achou==false && posicao<numeros.length) {
        	
        	if(numeros[posicao]==numero) {
        		achou=true;
        		indice=posicao;
        	}
        	posicao++;
        	}
        
        if(achou) {
        	System.out.println("O numero que voce digitou está na " +(indice+1)+"ª posição");
        }
        else {
    	System.out.println("O numero nao ta aqui.");
        }
        		
	}

}

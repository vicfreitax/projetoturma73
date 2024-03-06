package vetor_matriz;

import java.util.Scanner;

public class TarefaVetor02 {

	public static void main(String[] args) {
		/*Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
Todos os elementos dos índices ímpares do vetor 
Todos os elementos do vetor que são números pares
A Soma de todos os elementos do vetor
A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
*/
		
		Scanner read = new Scanner(System.in);
		
		//Declaração
        int numeros [] = new int[10];
        int soma=0, impar=0, par=0, posicao=0, media=0;
        int pares [] = new int[par];
        int impares [] = new int[impar];
      //Leitura de dados
        
        for(posicao=0; posicao<10; posicao++) {
        	System.out.println("Digite um valor para o vetor: ");
        	numeros[posicao] = read.nextInt();
        }
        
    
        //Processamento dos dados para a soma e média
       
        for(posicao=0; posicao<10; posicao++) {
            soma = soma + numeros[posicao];
            }
       
        media = soma/10;
        
        System.out.println("\n\nNúmeros ímpares: ");
       
        for(posicao=0; posicao<10; posicao++) {
        	if (numeros [posicao]%2!=0) {
        		System.out.print(" "+ numeros[posicao] + " ");
        	}
        }
        
        System.out.println("\n\nNúmeros pares: ");
        for(posicao=0; posicao<10; posicao++) {
        	if (numeros [posicao]%2==0) {
        		System.out.print(" "+ numeros[posicao] + " ");
        	}
        }
     
        for(posicao=0; posicao<10; posicao++) {
         if(numeros[posicao]%2==0) {
        	 par++;
         }
         else {
        	 impar++;
         }
        	
        }
        
        //saída de dados
        System.out.println("\n\nA soma é de: "+ soma);
        System.out.println("\nA média é de: "+ media);
  
	}

}

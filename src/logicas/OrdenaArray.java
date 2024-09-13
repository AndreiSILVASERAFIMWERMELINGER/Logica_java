package logicas;

import java.util.Scanner;

public class OrdenaArray {
	
	public static void main(String[] args) {
		final int tamanho = 5;
		Scanner teclado = new Scanner (System.in);
		int i,j, menor = 0;
		
		int lista[] = new int[tamanho];
		
		for (i =0; i < tamanho ; i++) {
			System.out.println("Insira valores: ");
			int numero = teclado.nextInt();
			lista[i] = numero;
			
		}
		
		for(i=0; i< lista.length - 1; i++) {
			for (j=0; j < lista.length - 1 - i; j++) {
				if (lista[j] > lista[j + 1]) {
					
					menor = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = menor;
				}
			}
			
			
			
			
		}
		for (i=0 ; i< lista.length; i++) {
			System.out.println(lista[i]);
		}
	
		
		
		
	}

}

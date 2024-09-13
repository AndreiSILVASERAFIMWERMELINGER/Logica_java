package logicas;

import java.util.Scanner;

public class NumerosPrimos {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int i, soma = 0;
		
		System.out.println("Insira um valor para conferir se é primo: ");
		int numerorPrimo = teclado.nextInt();
		
		for (i= 1; i <= numerorPrimo; i++ ) {
			if(numerorPrimo % i == 0) {
				soma ++;
			}
			
		}
		if (soma == 2)
		{
			System.out.println("É primo ");
		}
		else {
			System.out.println("Não é primo");
		}
	}

}

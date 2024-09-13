package logicas;

public class Fibonacci {
	public static void main(String[] args) {
		
		int PrimeiroValor = 1;
		int SegundoValor = 0;
		int soma = 0;
		int i;
		
		for (i = 0; i < 10; i++) {
			soma = PrimeiroValor + SegundoValor;
			PrimeiroValor = SegundoValor;
			SegundoValor = soma;
			
			
			
		}
		System.out.println(soma);
	}

}

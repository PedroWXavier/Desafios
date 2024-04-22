package logica;

public class Soma_Valores {

	public static void main(String[] args) {
		int soma = 0;
		for(int i = 1; i<=100; i++) {
			soma+=i;
		}
		System.out.println("Resultado da soma de 1 a 100: " + soma);
	}

}

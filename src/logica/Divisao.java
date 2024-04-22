package logica;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int entrada1;
		System.out.println("Digite um numero: ");
		entrada1 = s.nextInt();
		
		int entrada2;
		while(true) {
			System.out.println("Digite um numero diferente de 0: ");
			entrada2 = s.nextInt();
			if(entrada2!=0 && entrada2>0) {
				break;
			}
		}
		System.out.println("Resultado: " + entrada1/entrada2);
		s.close();
	}

}

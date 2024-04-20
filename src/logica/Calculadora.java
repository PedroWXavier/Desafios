package logica;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		Double primeiro = s.nextDouble();
		
		System.out.println("Digite a operacao: ");
		String op = s.next();
		
		System.out.println("Digite o segundo numero: ");
		Double segundo = s.nextDouble();
		
		switch(op) {
			case "+":
				System.out.println("Resultado: " + (primeiro + segundo));
				break;
			case "-":
				System.out.println("Resultado: " + (primeiro - segundo));
				break;
			case "*":
				System.out.println("Resultado: " + (primeiro * segundo));
				break;
			case "/":
				System.out.println("Resultado: " + (primeiro / segundo));
				break;
		}
		s.close();
	}

}

package logica;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int entrada;
		while(true) {
			System.out.println("Digite um numero de 1 a 10: ");
			entrada = s.nextInt();
			if(entrada>=1 && entrada<=10) {
				break;
			}
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println(i + " * " + entrada + " = " + i*entrada);
		}
		s.close();
	}

}

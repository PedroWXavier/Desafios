package logica;

import java.util.Scanner;

public class Encerra_Programa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador = 0;
		while(true) {
			System.out.println("Digite um numero:");
			s.nextDouble();
			contador++;
			if(contador==10) {
				break;
			}
		}
		System.out.println("Programa Encerrado");
		s.close();
	}

}

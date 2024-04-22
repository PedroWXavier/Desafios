package logica;

import java.util.Scanner;

public class Vetores_Impares {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int vetor[] = new int[10];

		for(int i=0;i<10;i++) {
			System.out.println("Digite um numero inteiro: ");
			vetor[i] = s.nextInt();
		}
		
		int c = 0;
		for(int i=0;i<10;i++) {
			if(vetor[i]%2!=0) {
				c++;
			}
		}
		System.out.println("Numero de impares: "+c);
		s.close();
	}
}

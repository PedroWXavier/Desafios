package logica;

import java.util.Scanner;

public class Nota_Aluno {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com a primeira nota:");
		Double primeira_nota= s.nextDouble();
		System.out.println("Entre com a segunda nota:");
		Double segunda_nota= s.nextDouble();
		System.out.println("Entre com a terceira nota:");
		Double terceira_nota= s.nextDouble();
		
		Double media = (primeira_nota + segunda_nota + terceira_nota)/3;
		if(media >= 7) {
			System.out.println("Aprovado");
		}
		else if(media >= 5) {
			System.out.println("Recuperação");
		}
		else{
			System.out.println("Reprovado");
		}
		s.close();
	}

}

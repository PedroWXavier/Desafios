package logica;

import java.util.Scanner;

public class Media_Aluno {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			double entrada1;
			System.out.println("Digite o primeiro numero: ");
			entrada1 = s.nextDouble();
			
			double entrada2;
			System.out.println("Digite o segundo numero: ");
			entrada2 = s.nextDouble();
			
			double media = (entrada1+entrada2)/2;
			System.out.println("Media: "+media);
			
			System.out.println("Deseja continuar (S/N): ");
			String entrada3 = s.next();
			if(entrada3.equals("N")) {
				break;
			}
		}
		s.close();

	}

}

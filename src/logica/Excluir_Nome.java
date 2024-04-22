package logica;

import java.util.Scanner;

public class Excluir_Nome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String vetor[] = new String[20];

		for(int i=0;i<20;i++) {
			System.out.println("Digite um nome para o vetor: ");
			vetor[i] = s.next();
		}
		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {
				if(i!=j && vetor[i].equals(vetor[j])) {
					vetor[i] = "";
				}
			}
		}
		System.out.println("Novo vetor: ");
		for(int i=0;i<20;i++) {
			System.out.println(vetor[i]);
		}
		s.close();
	}

}

package logica;

import java.util.Scanner;

public class Busca_Nome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String vetor[] = new String[10];

		for(int i=0;i<10;i++) {
			System.out.println("Digite um nome para o vetor: ");
			vetor[i] = s.next();
		}
		System.out.println("Digite um nome para buscar: ");
		String nome = s.next();
		boolean achou = false;
		for(int i=0;i<10;i++) {
			if(vetor[i].equals(nome)) {
				achou=true;
				break;
			}
		}
		if(achou) {
			System.out.println("Achei");
		}else {
			System.out.println("Nao Achei");
		}
		s.close();
	}

}

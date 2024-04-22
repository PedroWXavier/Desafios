package logica;

import java.util.Scanner;

public class Bloqueio_Usuario {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador = 0;
		while(true) {
			if(contador>=3) {
				System.out.println("Usuario Bloqueado!");
				break;
			}
			
			String entrada1;
			System.out.println("Digite o nome de usuario: ");
			entrada1 = s.next();
			
			String entrada2;
			System.out.println("Digite a senha: ");
			entrada2 = s.next();
			
			if(entrada1.equals("aluno") && entrada2.equals("segredo")) {
				System.out.println("Bem Vindo!");
				break;
			}else {
				contador++;
			}
		}
		s.close();
	}

}

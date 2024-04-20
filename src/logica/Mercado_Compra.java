package logica;

import java.util.Scanner;

public class Mercado_Compra {

	public static void main(String[] args) {
		System.out.println("Qual tipo de bebida voce deseja comprar? (cerveja, agua ou refrigerante)");
		Scanner s = new Scanner(System.in);
		if(s.next().equals("cerveja")) {
			System.out.println("Qual a sua idade?");
			if(s.nextInt() < 18) {
				System.out.println("Compra negada");
			}else {
				System.out.println("Compra efetuada com sucesso");
			}
		}else {
			System.out.println("Compra efetuada com sucesso");
		}
		s.close();
	}

}

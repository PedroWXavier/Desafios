package logica;

import java.util.Scanner;

public class Mercado_Desconto {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int quantidade = 0;
		double valor_total = 0;
		while(true) {
			System.out.println("Informe o nome do produto:");
			s.next();
			System.out.println("Informe o preco do produto:");
			Double preco = s.nextDouble();
			System.out.println("Informe a quantidade do produto:");
			Integer quantidade_produto = s.nextInt();
			
			quantidade += quantidade_produto;
			valor_total += quantidade_produto * preco;
			
			System.out.println("Quer adicionar mais produtos? (S/N)");
			String parar = s.next();
			if(!parar.equals("S")) {
				break;
			}
		}
		
		if(quantidade<=10) {
			System.out.println("Valor total sem desconto: " + valor_total);
		}else if(quantidade<=20) {
			System.out.println("Valor total com 10% de desconto: " + valor_total*0.9);
		}else if(quantidade<=50) {
			System.out.println("Valor total com 20% de desconto: " + valor_total*0.8);
		}else {
			System.out.println("Valor total com 25% de desconto: " + valor_total*0.75);
		}
		s.close();
	}

}

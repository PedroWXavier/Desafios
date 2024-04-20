package logica;

import java.util.Scanner;

public class Venda_Imovel {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do imovel a ser vendido: ");
		String nome = s.next();
		System.out.println("Digite o valor do imovel a ser vendido: ");
		Double valor = s.nextDouble();
		
		if(valor>=50000) {
			System.out.println("Nome: " + nome + " Valor imovel: " + valor + " Comissao: " + (valor*0.2));
		}else if(valor>=30000) {
			System.out.println("Nome: " + nome + " Valor imovel: " + valor + " Comissao: " + (valor*0.15));
		}else {
			System.out.println("Nome: " + nome + " Valor imovel: " + valor + " Comissao: " + (valor*0.1));
		}
		s.close();
	}
}

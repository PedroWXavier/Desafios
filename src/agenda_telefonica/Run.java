package agenda_telefonica;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		AgendaTelefonica a = new AgendaTelefonica();
		
		while(true) {
			System.out.println("Digite a operacao que gostaria de realizar('adicionar','remover','buscar','atualizar','listar','sair'): ");
			String op = s.next();
			if(op.equals("adicionar")) {
				System.out.println("Digite o nome do contato: ");
				String nome = s.next();
				System.out.println("Digite o numero do contato: ");
				String numero = s.next();
				a.adicionarContato(new Contato(nome,numero));
			} else if(op.equals("remover")) {
				System.out.println("Digite o nome do contato: ");
				String nome = s.next();
				a.removerContato(nome);
			} else if(op.equals("buscar")) {
				System.out.println("Digite o nome do contato: ");
				String nome = s.next();
				Contato c = a.buscarContato(nome);
				if(c!=null) {
					c.printContato();
				}
			} else if(op.equals("atualizar")) {
				System.out.println("Digite o nome do contato: ");
				String nome = s.next();
				System.out.println("Digite o novo nome do contato: ");
				String novoNome = s.next();
				System.out.println("Digite o novo numero do contato: ");
				String novoNumero = s.next();
				
				a.atualizarContato(nome, new Contato(novoNome,novoNumero));
			} else if(op.equals("listar")) {
				a.listarContatos();
			} else if(op.equals("sair")) {
				break;
			} else {
				System.out.println("Operacao invalida!");
			}
		}

		s.close();
	}

}

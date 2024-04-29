package agenda_telefonica;

import java.util.ArrayList;

public class AgendaTelefonica {
	private ArrayList<Contato> lista;
	
	public AgendaTelefonica() {
		this.lista = new ArrayList<Contato>();
	}
	
	public void adicionarContato(Contato contato) {
		if(verificaContatoExistente(contato.getNome())) {
			System.out.println("Um contato ja existe com este nome!");
		}else {
			lista.add(contato);
		}
	}
	
	private boolean verificaContatoExistente(String nome) {
		for(int i = 0; i < this.lista.size(); i++) {
			if(lista.get(i).getNome().equals(nome)) {
				return true;
			}
		}
		return false;
	}
	
	public void removerContato(String nome) {
		for(int i = 0; i < this.lista.size(); i++) {
			if(lista.get(i).getNome().equals(nome)) {
				lista.remove(i);
				return;
			}
		}
		System.out.println("Contato nao encontrado");
	}
	
	public Contato buscarContato(String nome){
		for(int i = 0; i < this.lista.size(); i++) {
			if(lista.get(i).getNome().equals(nome)) {
				return lista.get(i);
			}
		}
		System.out.println("Contato nao encontrado!");
		return null;
	}
	
	public void atualizarContato(String nome, Contato novoContato) {
		for(int i = 0; i < this.lista.size(); i++) {
			if(lista.get(i).getNome().equals(nome)) {
				lista.remove(i);
				lista.add(novoContato);
			}
		}
	}
	
	public void listarContatos() {
		for(int i = 0; i < this.lista.size(); i++) {
			lista.get(i).printContato();
		}
	}
}


package agenda_telefonica;

public class Contato {
	private String nome;
	private String numero;
	
	public Contato(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void printContato() {
		System.out.println("Nome: " + this.nome + "  Nuemro: " + this.numero);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}

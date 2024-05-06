package simulador_orcamento;

public class Trajeto implements ITrajeto {
	private Local origem;
	private Local destino;

	public Trajeto(Local origem, Local destino) {
		this.origem = origem;
		this.destino = destino;
	}
	
	public Integer getDistanciaEmKM() {
		String d = this.origem.toString() + this.destino.toString();
		if(d.equals("CC")) {
			return 5;
		}else if(d.equals("AB") || d.equals("BA")) {
			return 8;
		}else if(d.equals("AC") || d.equals("CA")) {
			return 10;
		}else if(d.equals("BC") || d.equals("CB")) {
			return 15;
		}
		return null;
	}

}

package compras_atacadao;

public class CaixaDoAtacado {
	Produto catalogo[];
	double multFinal;
	double valorFinal;
	
	public CaixaDoAtacado(Produto catalogo[], String formaPagamento) {
		this.catalogo = catalogo;
		this.valorFinal = 0.0;
		if(formaPagamento.equals("debito")) {
			this.multFinal = 1.0;
		}else if(formaPagamento.equals("credito")) {
			this.multFinal = 1.03;
		}else {
			this.multFinal = 0.95;
		}
	}
	
	public double computarCompra() {
		return this.valorFinal * this.multFinal;
	}
	
	public void adicionarProduto(String entrada) throws NumberFormatException, Exception {
		String e[] = entrada.split(",");
		
		this.valorFinal += getValorProduto(Integer.parseInt(e[0])) * Integer.parseInt(e[1]);
	}
	
	private double getValorProduto(int id) throws Exception {
		for(int i = 0; i < this.catalogo.length; i++) {
			if(this.catalogo[i].id == id) {
				return this.catalogo[i].preco;
			}
		}
		throw new Exception("ID de produto nao encontrado no catalogo");
	}

}

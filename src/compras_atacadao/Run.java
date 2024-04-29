package compras_atacadao;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		Produto p1 = new Produto(1,"Café 1kg",53.0);
		Produto p2 = new Produto(2,"Sabão em pó",36.0);
		Produto p3 = new Produto(3,"Caixa de Leite",82.0);
		Produto p4 = new Produto(4,"Refrigerate",8.5);
		
		Produto[] cardapio = new Produto[4];
		cardapio[0]=p1; 
		cardapio[1]=p2; 
		cardapio[2]=p3; 
		cardapio[3]=p4; 
		
		System.out.println("Escolha a forma de pagamento entre debito, credito e dinheiro: ");
		String formaPagamento = s.next();
		
		CaixaDoAtacado c;
		
		if(formaPagamento.equals("debito") || formaPagamento.equals("credito") || formaPagamento.equals("dinheiro")) {
			c = new CaixaDoAtacado(cardapio, formaPagamento);
		}else {
			s.close();
			throw new Exception("Forma de pagamento invalida!");
		}
		
		while(true) {
			System.out.println("Digite o id do produto e a quantidade no formato 'id,quantidade', ou sair para computar o valor da compra:");
			String entrada = s.next();
			if(entrada.equals("sair")) {
				break;
			} else {
				c.adicionarProduto(entrada);
			}
		}
		System.out.println("Valor Final: " + c.computarCompra());

		s.close();
	}

}

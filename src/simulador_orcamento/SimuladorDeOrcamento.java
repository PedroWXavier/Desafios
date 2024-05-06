package simulador_orcamento;

public class SimuladorDeOrcamento implements ISimuladorDeOrcamento {


	public double calcularCustoTotal(IVeiculo veiculo, ITrajeto trajeto) {
		int valor;
		if(veiculo.getEstado() == EstadoConservacao.QUEBRADO) {
			valor = 2;
		}else if(veiculo.getTipo() == TipoVeiculo.CARRO || veiculo.getTipo() == TipoVeiculo.MINIVAN) {
			valor = 5;
		}else {
			valor = 10;
		}
		
		return valor*trajeto.getDistanciaEmKM();
	}

}

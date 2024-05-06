package simulador_orcamento;

public class Veiculo implements IVeiculo{
	private TipoVeiculo tipoVeiculo;
	private EstadoConservacao estadoConservacao;
	
	public Veiculo(TipoVeiculo tipoVeiculo, EstadoConservacao estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
		this.tipoVeiculo = tipoVeiculo;
	}

	public EstadoConservacao getEstado() {
		return estadoConservacao;
	}
	
	public TipoVeiculo getTipo() {
		return tipoVeiculo;
	}
}

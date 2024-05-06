package simulador_orcamento;

public class Run {

	public static void main(String[] args) {
        SimuladorDeOrcamento simulador = new SimuladorDeOrcamento();
        Veiculo carroNovo = new Veiculo(TipoVeiculo.CARRO, EstadoConservacao.NOVO);
        Trajeto centroParaBairroA = new Trajeto(Local.A, Local.C);
        double custoCenario1 = simulador.calcularCustoTotal(carroNovo, centroParaBairroA);
        System.out.println("Cenário 1 - Custo Total do Serviço: R$" + custoCenario1);

	}

}

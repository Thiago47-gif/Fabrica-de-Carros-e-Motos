package br.com.poo.ArrayList;

public class Carro extends Veiculo {

	private String Chassi;
	private String Tracao;


	public String getChassi() {
		return Chassi;
	}
	public void setChassi(String chassi) {
		Chassi = chassi;
	}
	public String getTracao() {
		return Tracao;
	}
	public void setTracao(String tracao) {
		Tracao = tracao;
	}

	//Override
	public String toString() {

		return String.format("Carro\n") +
		String.format("Modelo: %s\n", Modelo) +
		String.format("Cor: %s\n", Cor) +
		String.format("Ano: %s\n", Ano) +
		String.format("Placa: %s\n", Placa +
		String.format("\nModelo: %s\n", Tracao) +
		String.format("Cor: %s\n", Chassi));
	}

}

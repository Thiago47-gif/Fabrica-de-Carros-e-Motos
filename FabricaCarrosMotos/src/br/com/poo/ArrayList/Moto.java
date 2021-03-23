package br.com.poo.ArrayList;

public class Moto extends Veiculo {

	private String Categoria;
	private String Cilindro;


	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public String getCilindro() {
		return Cilindro;
	}
	public void setCilindro(String cilindro) {
		Cilindro = cilindro;
	}
public String toString() {

		return String.format("\nMoto\n") +
		String.format("Modelo: %s\n", Modelo) +
		String.format("Cor: %s\n", Cor) +
		String.format("Ano: %s\n", Ano) +
		String.format("Placa: %s\n", Placa) +
		String.format("Categoria: %s\n", Categoria +
		String.format("\nCilindro: %s\n", Cilindro));
	}

}

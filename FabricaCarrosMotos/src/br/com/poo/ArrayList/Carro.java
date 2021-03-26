package br.com.poo.ArrayList;

import java.util.ArrayList;

public class Carro implements Veiculo {

	private String Ano;
    private String Cor;
    private String Modelo;
    private String Placa;
    private Double valorVeiculo;

    ArrayList<Carro> listCarros = new ArrayList<Carro>();
	
    @Override
	public String getAno() {
		return Ano;
	}
	@Override
	public void setAno(String ano) {
		Ano = ano;
	}
	@Override
	public String getCor() {
		return Cor;
	}
	@Override
	public void setCor(String cor) {
		Cor = cor;
	}
	@Override
	public String getModelo() {
		return Modelo;
	}
	@Override
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	@Override
	public String getPlaca() {
		return Placa;
	}
	@Override
	public void setPlaca(String placa) {
		Placa = placa;
	}
	@Override
	public Double getValor() {
		return valorVeiculo;
	}
	@Override
	public void setValor(Double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
		
	}

}

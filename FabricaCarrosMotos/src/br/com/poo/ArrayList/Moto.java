package br.com.poo.ArrayList;

import java.util.ArrayList;

public class Moto implements Veiculo {

	private String Ano;
    private String Cor;
    private String Modelo;
    private String Placa;
    private Double valorVeiculo;
    
	ArrayList<Moto> listMotos = new ArrayList<Moto>();

	@Override
	public String getAno() {
		return Ano;
	}
	public void setAno(String ano) {
		this.Ano = ano;
	}
	
	@Override
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		this.Cor = cor;
	}

	@Override
	public String getModelo() {
		return Modelo;
	}
	@Override
	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}
	@Override
	public String getPlaca() {
		return Placa;
	}
	@Override
	public void setPlaca(String placa) {
		this.Placa = placa;
	}
	@Override
	public Double getValor() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setValor(Double valorVeiculo) {
		// TODO Auto-generated method stub
		
	}
	public Double getValorVeiculo() {
		return valorVeiculo;
	}
	public void setValorVeiculo(Double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}

}

package br.com.poo.agregacao;

public class Cliente extends Pessoa {

	private String Rg;
	
	
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg= rg;
	}
	@Override
	public void VisitarFabrica() {
		System.out.println("Ver veiculos.");
		
	}
	
	
}

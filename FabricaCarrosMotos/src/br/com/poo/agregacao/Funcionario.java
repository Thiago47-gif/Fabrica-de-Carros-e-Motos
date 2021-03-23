package br.com.poo.agregacao;

public class Funcionario extends Pessoa {

	private String Cargo;
	private String Id;
	
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	@Override
	public void VisitarFabrica() {
		System.out.println("Ver veiculos.");
		
	}
	
}

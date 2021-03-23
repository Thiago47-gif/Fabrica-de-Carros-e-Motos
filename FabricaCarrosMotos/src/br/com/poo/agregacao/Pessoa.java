package br.com.poo.agregacao;

public abstract class Pessoa {

	public abstract void VisitarFabrica();
	
	private String Nome;
	private String Cpf;
	private String Telefone;
	private String Sexo;
	private Funcionario Funcionario;
	private Cliente Cliente;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public Funcionario getFuncionario() {
		return Funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.Funcionario = funcionario;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		this.Cliente = cliente;
	}
	
}

package Hóspedes;

public class cadastrarHospede{
	
	private String nome ;
	private String cpf;
	private String dataNascimento;
	private String endereco;
	private String contato;
	
	public cadastrarHospede(String nome,String CPF, String dataNascimento,String endereco, String contato) {
		
		this.nome = nome;
		this.cpf = CPF;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.contato = contato;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cPF) {
		cpf = cPF;
	}
	public String getNascimento() {
		return dataNascimento;
	}
	public void setNascimento(String nascimento) {
		this.dataNascimento = nascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String toString() {
		return "cadastrarHospede [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", endereco="
				+ endereco + ", contato=" + contato + "]";
	}
}
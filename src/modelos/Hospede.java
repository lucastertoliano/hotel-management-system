package modelos;

import abstracoes.Pessoa;

public class Hospede extends Pessoa { 

	private int dataDeNascimento;
	private String endereco;
	private int numeroDeContato;

	public Hospede(String nome, String cpf, int dataDeNascimento, String endereco, int numeroDeContatos) {
		super(nome, cpf);
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.numeroDeContato = numeroDeContatos;
	}

	public int getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(int dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumeroDeContato() {
		return numeroDeContato;
	}

	public void setNumeroDeContato(int numeroDeContato) {
		this.numeroDeContato = numeroDeContato;
	}

	@Override
	public String toString() {
		return super.toString() + ", Data de Nascimento: " + dataDeNascimento + ", Endereço:" + endereco + ", Nímero de Contato: " + numeroDeContato;
	}
	
}

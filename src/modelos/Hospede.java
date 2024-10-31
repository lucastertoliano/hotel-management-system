package modelos;

import java.util.ArrayList;
import java.util.List;

import abstracoes.Pessoa;

public class Hospede extends Pessoa { 

	private int dataDeNascimento;
	private String endereco;
	private int numeroDeContato;
	private ArrayList<Reserva> reservas;

	public Hospede(String nome, String cpf, int dataDeNascimento, String endereco, int numeroDeContatos) {
		super(nome, cpf);
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.numeroDeContato = numeroDeContatos;
		this.reservas = new ArrayList<>();
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

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}
	public void adicionarReserva(Reserva reserva) {
	        reservas.add(reserva);
	    }

	@Override
	public String toString() {
		return super.toString() + ", Data de Nascimento: " + dataDeNascimento + ", Endereço:" + endereco + ", Nímero de Contato: " + numeroDeContato;
	}
	
}

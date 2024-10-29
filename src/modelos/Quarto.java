package modelos;

import enums.Status;
import enums.Tipo;

public class Quarto { 

	private int numero;
	private Tipo tipo;
	private int capacidade;
	private double diaria;
	private Status status;
	
	public Quarto(int numero, Tipo tipo, int capacidade, double diaria) {
		this.numero = numero;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.diaria = diaria;
		this.status = Status.DISPONIVEL;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public double getDiaria() {
		return diaria;
	}

	public void setDiaria(double diaria) {
		this.diaria = diaria;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Quarto " + numero + ", Tipo: " + tipo + ", Capacidade: " + capacidade + ", Diária: " + diaria + ", Status: " + status;
	}
	
	
	
}

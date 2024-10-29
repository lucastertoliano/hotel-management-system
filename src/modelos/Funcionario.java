package modelos;

import abstracoes.Pessoa;
import enums.Cargo;
import enums.Turno;

public class Funcionario extends Pessoa { // Funcionario - nome, cpf, cargo, salario e turno de trabalho. 
	
	private Cargo cargo;
	private double valorHora;
	private Turno turno;
	private int horasTrabalhadas;
	
	public Funcionario(String nome, String cpf, Cargo cargo, double valorHora, Turno turno) {
		super(nome, cpf);
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.turno = turno;
		this.horasTrabalhadas = 0;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadasTradicional(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas += horasTrabalhadas;
	}

	@Override
	public String toString() {
		return super.toString() + ", Cargo: " + cargo + ", Turno: " + turno + ", Horas Trabalhadas: " + horasTrabalhadas + ", Valor Hora: " + valorHora;
	}
	
	
	
}

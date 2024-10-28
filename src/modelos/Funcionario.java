package modelos;

import abstracoes.Pessoa;
import enums.Cargo;
import enums.Turno;

public class Funcionario extends Pessoa { // Funcionario - nome, cpf, cargo, salario e turno de trabalho. 
	
	private Cargo cargo;
	private double salario;
	private Turno turno;
	
	public Funcionario(String nome, String cpf, Cargo cargo, double salario, Turno turno) {
		super(nome, cpf);
		this.cargo = cargo;
		this.salario = salario;
		this.turno = turno;
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return super.toString() + ", Cargo: " + cargo + ", Salário: " + salario + ", Turno: " + turno;
	}
	
	
	
}

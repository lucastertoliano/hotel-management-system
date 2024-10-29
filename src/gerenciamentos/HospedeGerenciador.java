package gerenciamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.GerenciamentoInterface;
import modelos.Hospede;

public class HospedeGerenciador implements GerenciamentoInterface {

	Scanner sc = new Scanner(System.in);
	private List<Hospede> hospedes;
	
	public HospedeGerenciador() {
		hospedes = new ArrayList<>();
	}

	@Override
	public void cadastrar() {
		
		System.out.println("Informe o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe o CPF: "); 
		String cpf = sc.nextLine();
		
		System.out.println("Informe a data de Nascimento: ");
		int dataDeNascimento = sc.nextInt();
		
		System.out.println("Informe seu Endereço: ");
		String endereco = sc.nextLine();
		
		System.out.println("Informe um número para Contato: ");
		int numeroDeContato = sc.nextInt();
		
		Hospede hospede = new Hospede(nome, cpf, dataDeNascimento, endereco, numeroDeContato);
		hospedes.add(hospede);
		System.out.println("Hóspede cadastrado com sucesso!");
		
	}

	@Override
	public void vizualizar() {
		
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizar não é aplicável para Hóspedes.");
	}

	@Override
	public void editar() {
		
	}

	@Override
	public void registrarHoras() {
		System.out.println("Registrar horas trabalhadas não é aplicável para hóspedes.");
	}
	
	@Override
	public void calcularSalario() {
		System.out.println("Calcular Salário não é aplicável para Hóspedes.");
	}

	@Override
	public void criar() {
		System.out.println("Criar não é aplicável para Hóspedes.");

	}

	@Override
	public void cancelar() {
		System.out.println("Cancelar não é aplicável para Hóspedes.");	

	}

	@Override
	public void disponibilidade() {
		System.out.println("Disponibilidade não é aplicável para Hóspedes.");
	}

	
}

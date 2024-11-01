package gerenciamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import abstracoes.Pessoa;
import interfaces.GerenciamentoInterface;
import modelos.Hospede;
import modelos.Reserva;

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
	public void vizualizar() { // acessar reservas hospede
		if (hospedes.isEmpty()) {
			System.out.println("Não temos nenhuma Reserva cadastrada!");
		}
		else {
			for (Hospede hospede : hospedes) {
				System.out.println("Hóspede: " + hospede.getNome() + " | CPF: " + hospede.getCpf());
			}
		}
		if (((Hospede) hospedes).getReservas().isEmpty()) {
			System.out.println("- Nenhuma reserva encontrada para este hóspede.");
		}else {
			System.out.println(" Reserva: ");
			for (Reserva reserva : ((Hospede) hospedes).getReservas()){
				System.out.println("- Reserva de:" + ( ((Pessoa) hospedes).getNome()));
			    System.out.println("Data de entrada: " + reserva.getDataEntrada());
			    System.out.println("Data de saída: " + reserva.getDataSaida());
				System.out.println( "Quarto: " + reserva.getQuarto().getNumero() + " (" + reserva.getQuarto().getTipo() + ")");
			}
		}
		
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizar não é aplicável para Hóspedes.");
	}

	@Override
	public void editar() {
		System.out.print("Informe o CPF: ");
		String cpf = sc.nextLine();
		
		for (Hospede hospede : hospedes) {
			if (hospede.getCpf().equals(cpf)) { 
				
				System.out.print("Informe o nome: ");
				String nome = sc.nextLine();
				hospede.setNome(nome);
				
				System.out.print("Informe o CPF novamente: ");
				String cpfEdicao = sc.nextLine();
				hospede.setCpf(cpfEdicao);
				
				System.out.print("Informe a data de nascimento: ");
				int dataDeNascimento = sc.nextInt();
				sc.nextLine();
				hospede.setDataDeNascimento(dataDeNascimento);
				
				System.out.print("Informe o endereço: ");
				String esdereco = sc.nextLine();
				hospede.setEndereco(esdereco);;
				
				System.out.print("Informe o número de contato: ");
				int numeroDeContato = sc.nextInt();
				sc.nextLine();
				hospede.setNumeroDeContato(numeroDeContato);
				
				System.out.println("Hóspede editado com sucesso!");
				return;
			}
		}
		System.out.println("CPF não encontrado! Tente Novamente.");
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

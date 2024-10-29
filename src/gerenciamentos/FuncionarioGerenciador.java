package gerenciamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enums.Cargo;
import enums.Turno;
import interfaces.GerenciamentoInterface;
import modelos.Funcionario;

public class FuncionarioGerenciador implements GerenciamentoInterface {

	Scanner sc = new Scanner(System.in);
	private List<Funcionario> funcionarios;

	public FuncionarioGerenciador() {
		funcionarios = new ArrayList<>();
	}

	@Override
	public void cadastrar() {
		System.out.print("Informe o nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe o CPF: ");
		String cpf = sc.nextLine();
		
		System.out.println("Informe o cargo: [1]Gerente [2]Camareira [3]Recepcionista [4]Cozinheiro [5]Garçom [6]Limpeza");
		int opcaoCargo = sc.nextInt();
		Cargo cargo = null;
		switch (opcaoCargo) {
        case 1:
        	cargo = Cargo.GERENTE;
            break;
        case 2:
        	cargo = Cargo.CAMAREIRA;
            break;
        case 3:
        	cargo = Cargo.RECEPCIONISTA;
            break;
        case 4:
        	cargo = Cargo.COZINHEIRO;
            break;
        case 5:
        	cargo = Cargo.GARCOM;
            break;
        case 6:
        	cargo = Cargo.LIMPEZA;
            break;
        default:
            System.out.println("Opção inválida! Tente novamente.");
            return;
		}
		
		System.out.print("Informe o valor hora: ");
		double valorHora = sc.nextDouble();
		
		System.out.println("Informe o turno: [1]Matutino [2]Vespertino [3]Noturno");
		int opcaoTurno = sc.nextInt();
		Turno turno = null;
		switch (opcaoTurno) {
        case 1:
        	turno = Turno.MATUTINO;
            break;
        case 2:
        	turno = Turno.VESPERTINO;
            break;
        case 3:
        	turno = Turno.NOTURNO;
            break;
        default:
            System.out.println("Opção inválida! Tente novamente.");
            return;
		}
		
		Funcionario funcionario = new Funcionario(nome, cpf, cargo, valorHora, turno);
		funcionarios.add(funcionario);
		System.out.println("Funcionário cadastrado com sucesso!");
	}

	@Override
	public void vizualizar() {
		if (funcionarios.isEmpty()) {
			System.out.println("Não temos nenhum funcionário cadastrado!");
		}
		else {
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario);
			}
		}
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizar não é aplicável para funcionários.");
	}

	@Override
	public void editar() {
		System.out.print("Informe o CPF: ");
		String cpf = sc.nextLine();
		
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getCpf().equals(cpf)) { 
				System.out.println("Informe o nome: ");
				String nome = sc.nextLine();
				funcionario.setNome(nome);
				
				System.out.print("Informe o CPF novamente: ");
				String cpfEdicao = sc.nextLine();
				funcionario.setCpf(cpfEdicao);
				
				System.out.println("Informe o cargo: [1]Gerente [2]Camareira [3]Recepcionista [4]Cozinheiro [5]Garçom [6]Limpeza");
				int opcaoCargo = sc.nextInt();
				Cargo cargo = null;
				switch (opcaoCargo) {
		        case 1:
		        	cargo = Cargo.GERENTE;
		            break;
		        case 2:
		        	cargo = Cargo.CAMAREIRA;
		            break;
		        case 3:
		        	cargo = Cargo.RECEPCIONISTA;
		            break;
		        case 4:
		        	cargo = Cargo.COZINHEIRO;
		            break;
		        case 5:
		        	cargo = Cargo.GARCOM;
		            break;
		        case 6:
		        	cargo = Cargo.LIMPEZA;
		            break;
		        default:
		            System.out.println("Opção inválida! Tente novamente.");
		            return;
				}
				
				funcionario.setCargo(cargo);
				
				System.out.print("Informe o valor hora: ");
				double valorHora = sc.nextDouble();
				funcionario.setValorHora(valorHora);
				
				System.out.println("Informe a quantidade de horas trabalhadas: ");
				int horasTrabalhadas = sc.nextInt();
				funcionario.setHorasTrabalhadasTradicional(horasTrabalhadas);
				
				System.out.println("Informe o turno: [1]Matutino [2]Vespertino [3]Noturno");
				int opcaoTurno = sc.nextInt();
				Turno turno = null;
				switch (opcaoTurno) {
		        case 1:
		        	turno = Turno.MATUTINO;
		            break;
		        case 2:
		        	turno = Turno.VESPERTINO;
		            break;
		        case 3:
		        	turno = Turno.NOTURNO;
		            break;
		        default:
		            System.out.println("Opção inválida! Tente novamente.");
		            return;
				}
				
				funcionario.setTurno(turno);
				
				System.out.println("Funcionário editado com sucesso!");
				return;
			}
		}
		System.out.println("CPF não encontrado! Tente Novamente.");
	}

	@Override
	public void registrarHoras() {
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Informe o CPF: ");
		String cpf = sc.nextLine();
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getCpf().equals(cpf)) { 
				funcionario.setHorasTrabalhadas(horasTrabalhadas);
				System.out.println("Horas Registradas com sucesso!");
				return;
			}
		}
		System.out.println("CPF não encontrado! Tente Novamente.");
	}
	
	@Override
	public void calcularSalario() {
		System.out.println("Informe o CPF: ");
		String cpf = sc.nextLine();
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getCpf().equals(cpf)) {
				double salario = funcionario.getHorasTrabalhadas() * funcionario.getValorHora();
				System.out.println(funcionario.getNome() + " receberá um salário no valor de: R$" + salario);
				return;
			}
		}
		System.out.println("CPF não encontrado! Tente Novamente.");
	}

	@Override
	public void criar() {
		System.out.println("Criar não é aplicável para funcionários.");
	}

	@Override
	public void cancelar() {
		System.out.println("Cancelar não é aplicável para funcionários.");
	}

	@Override
	public void disponibilidade() {
		System.out.println("Disponibilidade não é aplicável para funcionários.");
	}

}

package gerenciamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enums.Status;
import enums.Tipo;
import excecoes.QuartoIndisponivelException;
import interfaces.GerenciamentoInterface;
import modelos.Quarto;
import modelos.Reserva;

public class QuartoGerenciador implements GerenciamentoInterface {
	
	Scanner sc = new Scanner(System.in);
	private List<Quarto> quartos;

	public QuartoGerenciador() {
		quartos = new ArrayList<>();
	}

	public void cadastrar() {
		System.out.print("Informe a numeração do quarto: ");
		int numeroQuarto = sc.nextInt();
		
		System.out.println("Informe o a opção correspondente ao tipo do quarto: [1]Solteiro [2]Casal [3]Suíte");
		int opcaoTipo = sc.nextInt();
		
		Tipo tipoQuarto = null;
		switch (opcaoTipo) {
        case 1:
        	tipoQuarto = Tipo.SOLTEIRO;
            break;
        case 2:
        	tipoQuarto = Tipo.CASAL;
            break;
        case 3:
        	tipoQuarto = Tipo.SUITE;
            break;
        default:
            System.out.println("Opção inválida! Tente novamente.");
            return;
		}
		
		System.out.print("Informe o número de hóspedes: ");
		int numeroHospedes = sc.nextInt();
		
		System.out.print("Informe o valor da diária: ");
		double valorDiaria = sc.nextDouble();
		
		Quarto quarto = new Quarto(numeroQuarto, tipoQuarto, numeroHospedes, valorDiaria);
		quartos.add(quarto);
		System.out.println("Quarto cadastrado com sucesso!");
	}

	@Override
	public void vizualizar() {
		if (quartos.isEmpty()) {
			System.out.println("Não temos nenhum quarto cadastrado!");
		}
		else {
			for (Quarto quarto : quartos) {
				System.out.println(quarto);
			}
		}
		
	}

	@Override
	public void atualizar() { 
		System.out.print("Informe o número do quarto que terá o status atualizado: ");
		int numeroQuarto = sc.nextInt();
		Quarto quartoEncontrado = null;
		
		for (Quarto quarto : quartos) {
			if (quarto.getNumero() == numeroQuarto) {
				quartoEncontrado = quarto;				
				break;
			}
		}
		
		if (quartoEncontrado == null) {
			System.out.println("Quarto não encontrado!");
			return;
		}
		
		System.out.println("Status atual: " + quartoEncontrado.getStatus() + "\nOpções de Status: \n[1]DISPONIVEL \n[2]OCUPADO \n[3]MANUTENCAO");
		System.out.print("Informe a opção desejada: ");
		int opcao = sc.nextInt();
		Status novoStatus = null;
		switch (opcao) {
        case 1:
        	novoStatus = Status.DISPONIVEL;
            break;
        case 2:
        	novoStatus = Status.OCUPADO;
            break;
        case 3:
        	novoStatus = Status.MANUTENCAO;
            break;
        default:
            System.out.println("Opção inválida! Tente novamente.");
            return;
		}
		
		quartoEncontrado.setStatus(novoStatus);
		System.out.println("Status do quarto " + numeroQuarto + " atualizado com sucesso para: " + novoStatus);
		
	}

	@Override
	public void editar() {
		System.out.println("Editar não é aplicável para quartos.");
	}

	@Override
	public void registrarHoras() {
		System.out.println("Registrar horas trabalhadas não é aplicável para quartos.");
	}
	
	@Override
	public void calcularSalario() {
		System.out.println("Calcular Salário não é aplicável para quartos.");
	}

	@Override
	public void criar() {
		System.out.println("Criar não é aplicável para quartos.");
	}

	@Override
	public void cancelar() {
		System.out.println("Cancelar não é aplicável para quartos.");	
	}
	
	
	@Override //imprime todos os quartos disponiveis para reserva.
	public void disponibilidade() throws QuartoIndisponivelException {
		if (!quartos.isEmpty()) {
			for (Quarto quarto : quartos) {
				if(quarto.getStatus() == Status.DISPONIVEL) {
					System.out.println("Quarto " + quarto.getNumero() + " Disponível para reserva!");
				} else {
					throw new QuartoIndisponivelException("Quarto " + quarto.getNumero() + " Ocupado no momento!");
				}
			}
		}
		
	}
	
	public void checkIn(Quarto quarto) {
		quarto.setStatus(Status.OCUPADO);
		System.out.println("Check-In efetuado com sucesso! \nO Quarto " + quarto.getNumero() + " a partir de agora se encontra Ocupado.");
	}
	
	//preciso do valor diaria de Quarto e diasDeEstadia de Reserva
	public void checkOut(Quarto quarto, Reserva reserva) {
		double custoDaEstadia = quarto.getDiaria() * reserva.getDiasDeEstadia();
		System.out.println("Custo Total Estadia: R$" + custoDaEstadia);
		quarto.setStatus(Status.DISPONIVEL);
		System.out.println("Check-Out efetuado com sucesso! \nO Quarto " + quarto.getNumero() + " já está novamente Disponível");
	}
	
}

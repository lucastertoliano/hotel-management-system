package gerenciamentos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import abstracoes.Pessoa;
import enums.Status;
import enums.Tipo;
import interfaces.GerenciamentoInterface;
import modelos.Hospede;
import modelos.Quarto;
import modelos.Reserva;

public class HospedeGerenciador implements GerenciamentoInterface {

	Scanner sc = new Scanner(System.in);
	private List<Hospede> hospedes;
	
	public HospedeGerenciador() {
		hospedes = new ArrayList<>();
	}

	//cadastra uma reserva do hóspede
	public void criarReserva() {
		
		System.out.print("Informe o CPF do Hóspede: ");
		String cpf = sc.nextLine();
		
        Hospede hospede = null;
        for (Hospede h : hospedes) {
            if (h.getCpf().equals(cpf)) {
                hospede = h;
                break;
            }
        }
        
        if (hospede == null) {
            System.out.print("Hóspede não cadastrado no sistema!");
            return;
        }
       
		System.out.println("Informe a data do Check-In a seguir, no formato AAAA-MM-DD: ");
		String dataEntrada = sc.nextLine();
		LocalDate dataCheckIn = LocalDate.parse(dataEntrada);
		
		System.out.println("Informe a data do Check-Out a seguir, no formato AAAA-MM-DD: ");
		String dataSaida = sc.nextLine();
		LocalDate dataCheckOut = LocalDate.parse(dataSaida);
		
		System.out.println("Informe o a opção correspondente ao tipo do quarto: [1]Solteiro [2]Casal [3]Suíte");
		int opcaoTipo = sc.nextInt();
		sc.nextLine();
		
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
	
		System.out.println("Informe o número de hóspedes: ");
		int numeroDeHospedes = sc.nextInt();
		sc.nextLine();
	    
		long diasDeEstadia = ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut);
	    Reserva reserva = new Reserva(dataCheckIn, dataCheckOut, tipoQuarto, numeroDeHospedes, diasDeEstadia);
	    hospede.adicionarReserva(reserva);
	    
	    System.out.println("Reserva criada com sucesso!");
	}
	
	@Override //cancela uma reserva
	public void cancelar() {
		
		System.out.println("Insira o CPF do Hóspede: ");
        String cpf = sc.nextLine();
        
        if (cpf.isEmpty()) {
            System.out.println("CPF errado, tente novamente!");
            return;
        }
        
        Hospede hospede = null;
        for (Hospede h : hospedes) {
            if (h.getCpf().equals(cpf)) {
                hospede = h;
                break;
            }
        }
        
        if (hospede == null) {
            System.out.print("Hóspede não cadastrado no sistema!");
            return;
        }
      
        ArrayList<Reserva> reservas = hospede.getReservas();
        
        for(Reserva reserva : reservas) {
        	if(reserva.isAtiva() == true) {
        		reserva.setAtiva(false);
        	}
        }
        
        System.out.println("Reserva cancelada com sucesso!");
        
	
	}
	
	//cadastra um hóspede
	@Override
	public void cadastrar() {
		
		System.out.print("Informe o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe o CPF: "); 
		String cpf = sc.nextLine();
		
		System.out.print("Informe a data de Nascimento: ");
		int dataDeNascimento = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Informe seu Endereço: ");
		String endereco = sc.nextLine();
		
		System.out.print("Informe um número para Contato: ");
		int numeroDeContato = sc.nextInt();
		sc.nextLine();
		
		
		Hospede hospede = new Hospede(nome,cpf,dataDeNascimento, endereco,numeroDeContato);
		hospedes.add(hospede);
		System.out.println("Hóspede cadastrado com sucesso!");
	   
	}
	
	@Override // vizualizar historico de reservas de um hospede
	public void vizualizar() {
		
		if (hospedes.isEmpty()) {
			System.out.println("Não temos nenhum Hóspede cadastrado e consequentemente nenhuma Reserva.");
			return;
		}

		System.out.print("Insira o CPF: ");
		String cpf = sc.nextLine();

		Hospede hospede = null;
	    for (Hospede h : hospedes) {
	        if (h.getCpf().equals(cpf)) {
	            hospede = h;
	            break;
	        }
	    }
	    
	    if (hospede == null) {
	        System.out.println("Hóspede não cadastrado no sistema!");
	        return;
	    }
	    
	    ArrayList<Reserva> reservas = hospede.getReservas();
	    if (reservas.isEmpty()) {
	        System.out.println("Este hóspede não possui nenhuma reserva no histórico.");
	        return;
	    }
	    
	    System.out.println("Histórico de Reservas do Hóspede " + hospede.getNome() + ":");
		for (Reserva reserva : reservas) {
			System.out.println(reserva);
		}
		
		System.out.println("Histórico de Reservas exibido com sucesso!");
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizar não é aplicável para Hóspedes.");
	}

	@Override
	public void editar() {
		
	System.out.print("Informe o CPF: ");
	String cpf = sc.next();
		
		for (Hospede hospede : hospedes) {
			if (hospede.getCpf().equals(cpf)) { 
				
				System.out.println("Hóspede encontrado, informe novamente seus dados: ");
				sc.nextLine();
				System.out.print("Informe o nome: ");
				String nome = sc.nextLine();
				hospede.setNome(nome);
				
				System.out.print("Informe o CPF : ");
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
	public void disponibilidade() {
		System.out.println("Disponibilidade não é aplicável para Hóspedes.");
	}
	
	public void checkIn() {
		
	}
	
	public void checkOut() {
		
		System.out.println("Insira o CPF do Hóspede: ");
        String cpf = sc.nextLine();
        
        if (cpf.isEmpty()) {
            System.out.println("CPF errado, tente novamente!");
            return;
        }
        
        Hospede hospede = null;
        for (Hospede h : hospedes) {
            if (h.getCpf().equals(cpf)) {
                hospede = h;
                break;
            }
        }
        
        if (hospede == null) {
            System.out.print("Hóspede não cadastrado no sistema!");
            return;
        }
      
        ArrayList<Reserva> reservas = hospede.getReservas();
        
        for(Reserva reserva : reservas) {
        	if(reserva.isAtiva() == true) {
        		if(reserva.getTipoQuarto() == Tipo.SOLTEIRO) {
        			System.out.println("Valor da estadia: R$" + reserva.getDiasDeEstadia() * 200);
        		}
        		else if(reserva.getTipoQuarto() == Tipo.CASAL)  {
        			System.out.println("Valor da estadia: R$" + reserva.getDiasDeEstadia() * 350);
        		}
        		else if(reserva.getTipoQuarto() == Tipo.SUITE)  {
        			System.out.println("Valor da estadia: R$" + reserva.getDiasDeEstadia() * 500);
        		}
        			
        		reserva.setAtiva(false);
        		System.out.println("Check-Out efetuado com sucesso, Quarto liberado!");
        		return;
        	}
        }
        
        System.out.println("Esse hóspede não possui uma reserva ativa!");
	}
	
}

package gerenciamentos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enums.Status;
import enums.Tipo;
import interfaces.GerenciamentoInterface;
import modelos.Hospede;
import modelos.Quarto;
import modelos.Reserva;

public class ReservaGerenciador implements GerenciamentoInterface {

	Scanner sc = new Scanner(System.in);
	private List<Reserva> reservas;

	public ReservaGerenciador() {
		reservas = new ArrayList<>();
	}
	
	public void cadastrarReserva(Quarto quarto) {
		
		System.out.println("Informe o CPF do Hóspede: ");
		String cpf = sc.nextLine();
		
		
		System.out.println("Informe a data do Check-In a seguir: ");
		System.out.print("Dia: ");
		int diaEntrada = sc.nextInt();
		sc.nextLine();
		System.out.print("Mês: ");
		int mesEntrada = sc.nextInt(); 
		sc.nextLine();
		System.out.print("Ano: ");
		int anoEntrada = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Informe a data do Check-Out a seguir: ");
		System.out.print("Dia: ");
		int diaSaida = sc.nextInt();
		sc.nextLine();
		System.out.print("Mês: ");
		int mesSaida = sc.nextInt(); 
		sc.nextLine();
		System.out.print("Ano: ");
		int anoSaida = sc.nextInt();
		sc.nextLine();
		
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
		
		System.out.println("Informe o número de hóspedes: ");
		int numeroDeHospedes = sc.nextInt();
	    
	    LocalDate dataCheckIn = LocalDate.of(diaEntrada, mesEntrada, anoEntrada);
	    LocalDate dataCheckOut = LocalDate.of(diaSaida, mesSaida, anoSaida);
	    
	    long diasDeEstadia = ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut); //dias de estadia do hospede
	    
	    Reserva reserva = new Reserva(dataCheckIn, dataCheckOut, tipoQuarto, numeroDeHospedes, diasDeEstadia);
	    Hospede.setReservas(reserva);
	}
	
	@Override
	public void cadastrar() {
		
		System.out.println("Informe o CPF do Hóspede: ");
		String cpf = sc.nextLine();
		
		System.out.println("Informe a data do Check-In a seguir: ");
		System.out.print("Dia: ");
		int diaEntrada = sc.nextInt();
		sc.nextLine();
		System.out.print("Mês: ");
		int mesEntrada = sc.nextInt(); 
		sc.nextLine();
		System.out.print("Ano: ");
		int anoEntrada = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Informe a data do Check-Out a seguir: ");
		System.out.print("Dia: ");
		int diaSaida = sc.nextInt();
		sc.nextLine();
		System.out.print("Mês: ");
		int mesSaida = sc.nextInt(); 
		sc.nextLine();
		System.out.print("Ano: ");
		int anoSaida = sc.nextInt();
		sc.nextLine();
		
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
		
		System.out.println("Informe o número de hóspedes: ");
		int numeroDeHospedes = sc.nextInt();
	    
	    LocalDate dataCheckIn = LocalDate.of(diaEntrada, mesEntrada, anoEntrada);
	    LocalDate dataCheckOut = LocalDate.of(diaSaida, mesSaida, anoSaida);
	    
	    long diasDeEstadia = ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut); //dias de estadia do hospede
	    
	    Reserva reserva = new Reserva(dataCheckIn, dataCheckOut, tipoQuarto, numeroDeHospedes, diasDeEstadia);
	    
	   
	    
//	    for (Hospede hospede : hospedes) {
//			if (hospede.getCpf().equals(cpf)) { 
//			
//			}
//	    }
		
	    //Reserva reserva = new Reserva(dataCheckIn, dataCheckOut);
	    //criar reserva new reserva e passar as informações
	    
	    
	    
	    
	}

	@Override
	public void vizualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarHoras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void criar() {
		// TODO Auto-generated method stub
		
	}

	public void cancelarReserva(Quarto quarto) {
		if (quarto.getStatus() == Status.OCUPADO) {
			quarto.setStatus(Status.DISPONIVEL);
			System.out.println("Reserva cancelada com sucesso!");
		}
	}
	
	@Override
	public void cancelar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disponibilidade() {
		
	}

}

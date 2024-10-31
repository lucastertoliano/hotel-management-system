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
		
	}
	
	@Override
	public void cadastrar() {
		
//		System.out.println("Informe o CPF do Hóspede: ");
//		String cpf = sc.nextLine();
//		
//		
//		
//		System.out.println("Informe a data do Check-In a seguir: ");
//		System.out.print("Dia: ");
//		String diaCheckIn = sc.nextLine();
//		System.out.print("Mês: ");
//		String mesCheckIn = sc.nextLine();
//		System.out.print("Ano: ");
//		String anoCheckIn = sc.nextLine();
//		
//		System.out.println("Informe a data do Check-Out a seguir: ");
//		System.out.print("Dia: ");
//		String diaCheckOut = sc.nextLine();
//		System.out.print("Mês: ");
//		String mesCheckOut = sc.nextLine();
//		System.out.print("Ano: ");
//		String anoCheckOut = sc.nextLine();
//		
//		int diaIn = Integer.parseInt(diaCheckIn);
//	    int mesIn = Integer.parseInt(mesCheckIn);
//	    int anoIn = Integer.parseInt(anoCheckIn);
//	    
//	    int diaOut = Integer.parseInt(diaCheckOut);
//	    int mesOut = Integer.parseInt(mesCheckOut);
//	    int anoOut = Integer.parseInt(anoCheckOut);
//	    
//	    LocalDate dataCheckIn = LocalDate.of(diaIn, mesIn, anoIn);
//	    LocalDate dataCheckOut = LocalDate.of(diaOut, mesOut, anoOut);
//	    
//	 
//		
//	    Reserva reserva = new Reserva(dataCheckIn, dataCheckOut);
//	    criar reserva new reserva e passar as informações
//	    
//	    
//	    long diasEstadia = ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut); //dias de estadia do hospede
	    
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

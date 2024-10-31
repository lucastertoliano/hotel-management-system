package modelos;

import java.time.LocalDate;

import enums.Status;
import enums.Tipo;

public class Reserva {
	
	private String cpf;
	private LocalDate dataCheckIn;
	private LocalDate dataCheckOut;
	private Tipo tipoQuarto;
	private int numeroDeHospedes;
	private Quarto quarto;
	private long diasDeEstadia;
	//private boolean ativa;
	
	public Reserva(LocalDate dataCheckIn, LocalDate dataCheckOut, Tipo tipoQuarto, int numeroDeHospedes, long diasDeEstadia) {
		this.dataCheckIn = dataCheckIn;
		this.dataCheckOut = dataCheckOut;
		this.tipoQuarto = tipoQuarto;
		this.numeroDeHospedes = numeroDeHospedes;
		this.diasDeEstadia = diasDeEstadia;
		this.quarto.setStatus(Status.OCUPADO);
		//this.ativa = true;
	}

	public LocalDate getDataEntrada() {
		return dataCheckIn;
	}

	public void setDataEntrada(LocalDate dataCheckIn) {
		this.dataCheckIn = dataCheckIn;
	}

	public LocalDate getDataSaida() {
		return dataCheckOut;
	}

	public void setDataSaida(LocalDate dataCheckOut) {
		this.dataCheckOut = dataCheckOut;
	}

	@Override
	public String toString() {
		return "Reserva - Quarto " + quarto.getNumero() + ", Data Check-In: " + dataCheckIn + ", Data Check-Out: " + dataCheckOut + ", Tempo de Estadia: " + diasDeEstadia + " Dias";
	}
	
	
	
	
	
}

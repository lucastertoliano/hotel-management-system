package modelos;

import java.time.LocalDate;

import enums.Status;

public class Reserva {
	
	private LocalDate dataCheckIn;
	private LocalDate dataCheckOut;
	private Quarto quarto;
	private boolean ativa;
	
	public Reserva(LocalDate dataCheckIn, LocalDate dataCheckOut, Quarto quarto) {
		this.dataCheckIn = dataCheckIn;
		this.dataCheckOut = dataCheckOut;
		this.ativa = true;
		this.quarto.setStatus(Status.OCUPADO);
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
		return "Reserva - Quarto " + quarto.getNumero() + ", Data Check-In: " + dataCheckIn + ", Data Check-Out: " + dataCheckOut;
	}
}

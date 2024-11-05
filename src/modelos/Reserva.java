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
	private boolean ativa; // indica se a reserva está ativa ou não
	
	public Reserva(LocalDate dataCheckIn, LocalDate dataCheckOut, Tipo tipoQuarto, int numeroDeHospedes, long diasDeEstadia) {
		this.dataCheckIn = dataCheckIn;
		this.dataCheckOut = dataCheckOut;
		this.tipoQuarto = tipoQuarto;
		this.numeroDeHospedes = numeroDeHospedes;
		this.diasDeEstadia = diasDeEstadia;
		this.ativa = true;
		Quarto quarto = new Quarto(0, null, 0, 0);
		quarto.setStatus(Status.OCUPADO);
		
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
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

	public long getDiasDeEstadia() {
		return diasDeEstadia;
	}

	public void setDiasDeEstadia(long diasDeEstadia) {
		this.diasDeEstadia = diasDeEstadia;
	}

	public boolean isAtiva() {
		return ativa;
	}

	//desativa o atributo ativa
	public void setAtiva(boolean ativa) {
		ativa = false;
	}

	@Override
	public String toString() {
		return "Reserva - " + " Data Check-In: " + dataCheckIn + ", Data Check-Out: " + dataCheckOut + ", Tempo de Estadia: " + diasDeEstadia + " Dias";
	}
}

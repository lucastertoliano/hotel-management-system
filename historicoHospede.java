package Hóspedes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class historicoHospede {

	private String dataInicio;
	private String dataFinal;
	private String quarto;
	
	public historicoHospede(String dataInicio, String dataFinal,String quarto) {
		
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.quarto = quarto;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getQuarto() {
		return quarto;
	}

	public void setQuarto(String quarto) {
		this.quarto = quarto;
	}
	public String toString() {
		return "historicohospede [dataInicio=" + dataInicio + ", dataFinal=" + dataFinal + ", quarto=" + quarto + "]";
	}
}

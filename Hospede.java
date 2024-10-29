package Hóspedes;

import java.util.ArrayList;
import java.util.List;

public class Hospede {
	
	private Hospede hospede;
	private List<historicoHospede> historico;
	
	public Hospede(Hospede hospede) {
		
		this.hospede = hospede;
		this.historico = new ArrayList<>();
		
	}
	   public void adicionarHistorico(String dataInicio, String dataFinal, String quarto) {
	        historicoHospede estadia = new historicoHospede(dataInicio, dataFinal, quarto);
	        historico.add(estadia);
	    }
	   public void exibirHistorico() {
	        System.out.println(hospede.toString());
	        System.out.println("Histórico de estadias:");
	        for (historicoHospede estadia : historico) {
	            System.out.println(estadia);
	        }
	    }
}

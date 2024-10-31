package gerenciamentos;

import excecoes.QuartoIndisponivelException;

public class Hotel {
	
	private QuartoGerenciador gerenciadorQuarto;
	private HospedeGerenciador gerenciadorHospede;
	private FuncionarioGerenciador gerenciadorFuncionario;
	private ReservaGerenciador gerenciadorReserva;
	
	public Hotel() {
		gerenciadorQuarto = new QuartoGerenciador();
		gerenciadorHospede = new HospedeGerenciador();
		gerenciadorFuncionario = new FuncionarioGerenciador();
		gerenciadorReserva = new ReservaGerenciador();
	}
	
	public void cadastrarQuarto() {
		gerenciadorQuarto.cadastrar();
	}
	
	public void vizualizarQuarto() {
		gerenciadorQuarto.vizualizar();
	}
	
	public void atualizarStatus() {
		gerenciadorQuarto.atualizar();
	}
	
	public void cadastrarHospede() {
		gerenciadorHospede.cadastrar();
	}
	
	public void vizualizarHistoricoDeEstadias() {
		
	}
	
	public void editarHospede() {
		gerenciadorHospede.editar();
	}
	
	public void verificarDisponibilidade () {
		try {
			gerenciadorQuarto.disponibilidade();
		}catch (QuartoIndisponivelException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void cadastrarFuncionario() {
		gerenciadorFuncionario.cadastrar();
	}
	
	public void vizualizarFuncionario() {
		gerenciadorFuncionario.vizualizar();
	}
	
	public void editarFuncionario() {
		gerenciadorFuncionario.editar();
	}
	
	public void registrarHorasTrabalhadas() {
		gerenciadorFuncionario.registrarHoras();
	}
	
	public void calcularSalario() {
		gerenciadorFuncionario.calcularSalario();
	}
	
}

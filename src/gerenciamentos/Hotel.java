package gerenciamentos;

import excecoes.QuartoIndisponivelException;

public class Hotel {
	
	private QuartoGerenciador gerenciadorQuarto;
	private HospedeGerenciador gerenciadorHospede;
	private FuncionarioGerenciador gerenciadorFuncionario;
	
	public Hotel() {
		gerenciadorQuarto = new QuartoGerenciador();
		gerenciadorHospede = new HospedeGerenciador();
		gerenciadorFuncionario = new FuncionarioGerenciador();
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
		gerenciadorHospede.vizualizar();
	}
	
	public void editarHospede() {
		gerenciadorHospede.editar();
	}
	
	public void cadastrarReserva() {
		gerenciadorHospede.criarReserva();
	}
	
	public void cancelarReserva() {
		gerenciadorHospede.cancelar();
	}
	
	public void verificarDisponibilidade () {
		try {
			gerenciadorQuarto.disponibilidade();
		}catch (QuartoIndisponivelException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void checkOut() {
		gerenciadorHospede.checkOut();
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

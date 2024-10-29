package gerenciamentos;

public class Hotel {
	
	private QuartoGerenciador gerenciadorQuarto;
	private HospedeGerenciador gerenciadorHopede;
	private FuncionarioGerenciador gerenciadorFuncionario;
	
	public Hotel() {
		gerenciadorQuarto = new QuartoGerenciador();
		gerenciadorHopede = new HospedeGerenciador();
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

	public void cadastrarHospede() {
		gerenciadorFuncionario.cadastrar();
		
	}
	
}

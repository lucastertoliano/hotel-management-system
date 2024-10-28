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
	
}

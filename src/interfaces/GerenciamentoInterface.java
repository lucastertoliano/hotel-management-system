package interfaces;

import excecoes.QuartoIndisponivelException;

public interface GerenciamentoInterface {
	
	void cadastrar();
	void vizualizar();
	void atualizar();
	void editar();
	void registrarHoras();
	void calcularSalario();
	void criar();
	void cancelar();
	void disponibilidade() throws QuartoIndisponivelException;

	
}


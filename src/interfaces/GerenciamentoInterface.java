package interfaces;

public interface GerenciamentoInterface {
	
	void cadastrar();
	void vizualizar();
	void atualizar();
	void editar();
	void registrarHoras();
	void calcularSalario();
	void criar();
	void cancelar();
	void disponibilidade();
	
}

/* Quartos
 * - cadastrar
 * - vizualizar
 * - atualizar status dos quartos
 * 
 * Hospedes
 * - cadastrar
 * - vizualizar
 * - editar dados dos hospedes cadastrados
 * 
 * Funcionarios
 * - cadastrar 
 * - editar dados dos funcionarios cadastrados
 * - registar horas trabalhadas e calcular salário
 * 
 * Reservas
 * - Criar
 * - Cancelar
 * - Verificar disponibilidade dos quartos nas datas selecionadas, garantindo que estejam livre para reserva
 * 
 * Check-In e Check-Out
 * - ao realizar check-in o hospede deve ser cadastrado no quarto e o status do quarto deve atualizar p/ "ocupado"
 * - o sistema deve permitir o hospede fazer check-out, calcular o valor total da estadia c/ base no numero de dias e no tipo de quarto e atualizar o quarto p/ "disponivel"
 * */

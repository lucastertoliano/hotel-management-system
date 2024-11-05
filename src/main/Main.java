package main;

import java.util.Scanner;

import gerenciamentos.Hotel;

public class Main {
	
	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n ===== Menu De Gerenciamento ===== \n [1] Quartos \n [2] Hóspedes \n [3] Reservas \n [4] Funcionários \n [5] Sair");
			System.out.print("Informe a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
	        case 1:
	        	gerenciarQuartos(sc, hotel);
	            break;
	        case 2:
	        	gerenciarHospedes(sc, hotel);
	            break;
	        case 3:
	        	gerenciarReservas(sc, hotel);
	        	break;
	        case 4:
	        	gerenciarFuncionarios(sc, hotel);
	        	break;
	        case 5:
	        	System.out.println("Sessão encerrada.");
	        	break;
	        default:
	            System.out.println("Opção inválida! Tente escolher um número entre 1 e 5.");
			}
			
		} while (opcao != 5);
	}

	private static void gerenciarQuartos(Scanner sc, Hotel hotel) {
		int opcaoQuartos;
		
		do {
            System.out.println("\n ===== Menu Quartos ===== \n [1] Cadastrar \n [2] Vizualizar \n [3] Atualizar Status \n [4] Voltar ao Menu de Gerenciamento");
            System.out.print("Informe a opção desejada: ");
            opcaoQuartos = sc.nextInt();
            sc.nextLine(); 

            switch (opcaoQuartos) {
                case 1:
                    hotel.cadastrarQuarto();
                    break;
                case 2:
                    hotel.vizualizarQuarto();
                    break;
                case 3:
                    hotel.atualizarStatus();
                    break;
                case 4:
                    System.out.println(" --- Menu Quartos Encerrado ---");
                    break;
                default:
                    System.out.println("Opção inválida! Tente escolher um número entre 1 e 4.");
            }
        } while (opcaoQuartos != 4);
		
	}
	
	private static void gerenciarHospedes(Scanner sc, Hotel hotel) {
		int opcaoHospede;
		
		do {
			System.out.println("\n ===== Menu Hóspedes ===== \n [1] Cadastrar \n [2] Vizualizar Histórico \n [3] Editar \n [4] Check-Out \n [5] Voltar ao Menu de Gerenciamento");
            System.out.print("Informe a opção desejada: ");
            opcaoHospede = sc.nextInt();
            sc.nextLine(); 
		
			switch(opcaoHospede) {
			case 1:
				hotel.cadastrarHospede();
				//hotel.cadastrarReserva();
				break;
			case 2:
			    hotel.vizualizarHistoricoDeEstadias();
			    break;
			case 3:
				hotel.editarHospede();
				break;
			case 4:
				hotel.checkOut();
				break;
			case 5:
				System.out.println(" --- Menu Hóspedes Encerrado ---");
				break;
			default:
				System.out.println("Opção inválida! Tente escolher um número entre 1 e 5.");
			}
		} while (opcaoHospede != 5);
	}
	
	private static void gerenciarReservas(Scanner sc, Hotel hotel) {
		int opcaoReserva;
		
		do {
			System.out.println("\n ===== Menu Reservas ===== \n [1] Cadastrar \n [2] Cancelar \n [3] Verificar Disponibilidade \n [4] Voltar ao Menu de Gerenciamento");
            System.out.print("Informe a opção desejada: ");
            opcaoReserva = sc.nextInt();
            sc.nextLine(); 
		
			switch(opcaoReserva) {
			case 1:
				hotel.cadastrarReserva();
				break;
			case 2:
			    hotel.cancelarReserva();
			    break;
			case 3:
				hotel.verificarDisponibilidade();
				break;
			case 4:
				System.out.println(" --- Menu Reservas Encerrado ---");
				break;
			default:
				System.out.println("Opção inválida! Tente escolher um número entre 1 e 4.");
			}
		} while (opcaoReserva != 4);
		
	}
	
	private static void gerenciarFuncionarios(Scanner sc, Hotel hotel) {
		int opcaoFuncionarios;
		
		do {
            System.out.println("\n ===== Menu Funcionários ===== \n [1] Cadastrar \n [2] Vizualizar \n [3] Editar \n [4] Registrar Horas Trabalhadas \n [5] Calcular Salário \n [6] Voltar ao Menu Gerenciamento");
            System.out.print("Informe a opção desejada: ");
            opcaoFuncionarios = sc.nextInt();
            sc.nextLine(); 

            switch (opcaoFuncionarios) {
                case 1:
                    hotel.cadastrarFuncionario();
                    break;
                case 2:
                    hotel.vizualizarFuncionario();
                    break;
                case 3:
                    hotel.editarFuncionario();
                    break;
                case 4:
                   hotel.registrarHorasTrabalhadas();
                    break;
                case 5:
                    hotel.calcularSalario();
                    break;
                case 6:
                    System.out.println(" --- Menu Funcionários Encerrado ---");
                    break;
                default:
                    System.out.println("Opção inválida! Tente escolher um número entre 1 e 6.");
            }
        } while (opcaoFuncionarios != 6);
	}

}

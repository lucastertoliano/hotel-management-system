package main;

import java.util.Scanner;

import gerenciamentos.Hotel;

public class Main {
	
	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n ===== Menu De Gerenciamento ===== \n [1] Quartos \n [2] Hóspedes \n [3] Funcionários \n [4] Sair");
			System.out.print("Informe a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
	        case 1:
	        	gerenciarQuartos(sc, hotel);
	            break;
	        case 2:
	        	//gerenciadorHospedes(sc);
	            break;
	        case 3:
	        	//gerenciadorFuncionarios(sc);
	            break;
	        case 4:	
	            System.out.println("Sessão encerrada.");
	        	break;
	        default:
	            System.out.println("Opção inválida! Tente escolher um número entre 1 e 4.");
			}
			
		} while (opcao != 4);
	}

	private static void gerenciarQuartos(Scanner sc, Hotel hotel) {
		int opcaoQuartos;
		
		do {
            System.out.println("\n ===== Menu Quartos ===== \n [1] Criar \n [2] Vizualizar \n [3] Atualizar Status \n [4] Voltar ao Menu de Gerenciamento");
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

}

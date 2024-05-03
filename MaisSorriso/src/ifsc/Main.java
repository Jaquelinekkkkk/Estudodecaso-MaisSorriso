package ifsc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Cliente> listaClientes = new ArrayList<>();
		ArrayList<Consulta> listaConsultas = new ArrayList<>();
		int qtdConsultas=0;
		int qtdClientes=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mais Sorriso - Sistema da Clinica Odontologica");
		System.out.println("1 - Cadastro de Consulta/Cliente");
		System.out.println("2 - Mostrar consultas/clientes cadstrados");
		System.out.println("3 - Buscar consultas/clientes");
		System.out.println("4 - Atualizar consultas/clientes");
		System.out.println("5 - Excluir consultas/clientes");
		System.out.println("6 - Sair");
		
		System.out.println("Escolha opcao do menu:");
		String opcaoTxt = scan.nextLine();
		int opcaoMenuPrincipal = Integer.valueOf(opcaoTxt);
		
		do {
			
			System.out.println("Escolha opcao do menu:");
			opcaoTxt = scan.nextLine();
			opcaoMenuPrincipal = Integer.valueOf(opcaoTxt);
		
		switch(opcaoMenuPrincipal) {
		
		case 1:
			
			System.out.println("- Cadastro de Consulta/Cliente -");
			System.out.println("1 - Cadastrar nova consulta");
			System.out.println("2 - Cadastrar novo cliente");
			System.out.println("Digite 1 ou 2:");
			String opcaoSubmenuTxt = scan.nextLine();
			int opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
			
			verificaOpcaoSubmenu(opcaoSubmenu);
			
			if(opcaoSubmenu == 1) {
				
				Consulta[] consultas = new Consulta[10];
				
				for(int i=qtdConsultas; i<consultas.length;) {
			
				Consulta consulta1 = new Consulta();

				System.out.println("- Cadastrar nova consulta -");
				
				System.out.println("Dentista:");
				String dentista = scan.nextLine();
				consulta1.setDentista(dentista);
				System.out.println("Data e hora:");
				String dataHora = scan.nextLine();
				consulta1.setDataHora(dataHora);
				System.out.println("Preco da consulta:");
				String precoTxt = scan.nextLine();
				double preco = Double.valueOf(precoTxt);
				consulta1.setPrecoConsulta(preco);
				System.out.println("Codigo da consulta:");
				String codigoTxt = scan.nextLine();
				int codigoConsulta = Integer.valueOf(codigoTxt);
				consulta1.setCodigo(codigoConsulta);
				System.out.println("Tipo de consulta:");
				String tipoConsulta = scan.nextLine();
				consulta1.setTipoConsulta(tipoConsulta);
				System.out.println("Cliente:");
				String nomeCliente = scan.nextLine();
				consulta1.setCliente(nomeCliente);
				consultas[i]= consulta1;
				
				listaConsultas.add(consultas[i]);
				qtdConsultas++;
				System.out.println("Consulta cadastrada!");
				break;
				
				}
				
			}
			
			if(opcaoSubmenu == 2) {
				
				Cliente[] clientes = new Cliente[10];
				
				for(int i=qtdClientes; i<clientes.length;) {
				
				Cliente cliente1 = new Cliente();
				
				System.out.println("- Cadastrar novo cliente -");
				
				System.out.println("Nome:");
				String nomeCliente = scan.nextLine();
				cliente1.setNome(nomeCliente);
				System.out.println("Sobrenome:");
				String sobrenomeCliente = scan.nextLine();
				cliente1.setSobrenome(sobrenomeCliente);
				System.out.println("CPF:");
				String cpf = scan.nextLine();
				cliente1.setCpf(cpf);
				System.out.println("Telefone:");
				String telefone = scan.nextLine();
				cliente1.setTelefone(telefone);
				System.out.println("Endereco:");
				String endereco = scan.nextLine();
				cliente1.setEndereco(endereco);
				System.out.println("Codigo:");
				String codigoTxt = scan.nextLine();
				int codigoCliente = Integer.valueOf(codigoTxt);
				cliente1.setCodigo(codigoCliente);
				clientes[i] = cliente1;
					
				listaClientes.add(clientes[i]);
				qtdClientes++;
				System.out.println("Cliente cadastrado(a)!");
				break;
				
				}
			}
			
			break;
			
			
		case 2:
			
			System.out.println("- Mostrar -");
			System.out.println("1 - Consultas cadastradas");
			System.out.println("2 - Clientes cadastrados");
			System.out.println("Digite 1 ou 2:");
			opcaoSubmenuTxt = scan.nextLine();
			opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
			
			verificaOpcaoSubmenu(opcaoSubmenu);
			
			if (opcaoSubmenu == 1 ){
				
				System.out.println("- Consultas cadastradas -");
				
				for(Consulta consulta : listaConsultas) {
					
					System.out.println("Dentista: " + consulta.getDentista());
					System.out.println("Data e hora: " + consulta.getDataHora());
					System.out.println("Preco: R$" + consulta.getPrecoConsulta());
					System.out.println("Codigo" + consulta.getCodigo());
					System.out.println("Codigo: " + consulta.getCodigo());
					System.out.println("Cliente: " + consulta.getCliente());
					System.out.println();
				}
			}
				
				if (opcaoSubmenu == 2 ){
					
					System.out.println("- Clientes cadastrados -");
					
					for(Cliente cliente : listaClientes) {
						
						System.out.println("Nome: " + cliente.getNome());
						System.out.println("Sobrenome: " + cliente.getSobrenome());
						System.out.println("CPF: " + cliente.getCpf());
						System.out.println("Telefone: " + cliente.getTelefone());
						System.out.println("Endereco: " + cliente.getEndereco());
						System.out.println("Codigo: " + cliente.getCodigo());
						System.out.println();	 
				}				
			}
			
		    break;
			
		case 3:
			
			System.out.println("- Buscar -");
			System.out.println("1 - Consulta");
			System.out.println("2 - Cliente");
			System.out.println("Digite 1 ou 2:");
			opcaoSubmenuTxt = scan.nextLine();
			opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
			
			verificaOpcaoSubmenu(opcaoSubmenu);
			
			if(opcaoSubmenu == 1) {
				
				System.out.println("Digite o codigo da consulta que procura:");
				String codigoConsultaTxt = scan.nextLine();
				int codigoConsulta = Integer.valueOf(codigoConsultaTxt);
				
				for(Consulta consulta : listaConsultas) {
					
					if(consulta.getCodigo() == codigoConsulta) {
						System.out.println("Consulta encontrada!");
	
					}
				}
			}
			
			if(opcaoSubmenu == 2) {
				
				System.out.println("Digite o codigo do cliente que procura:");
				String codigoClienteTxt = scan.nextLine();
				int codigoCliente = Integer.valueOf(codigoClienteTxt);
				
				for(Cliente cliente : listaClientes) {
					
					if(cliente.getCodigo() == codigoCliente) {
						System.out.println("Cliente encontrado!");
	
					}
				}
			}
					
			break;
			
		case 4:
			
			System.out.println("- Atualizar cadastro -");
			System.out.println("1 - Consulta");
			System.out.println("2 - Cliente");
			System.out.println("Digite 1 ou 2:");
			opcaoSubmenuTxt = scan.nextLine();
			opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
			
			verificaOpcaoSubmenu(opcaoSubmenu);
			
			if(opcaoSubmenu == 1) {
				
				System.out.println("Digite o codigo da consulta que deseja atualizar:");
				String codigoConsultaTxt = scan.nextLine();
				int codigoConsulta = Integer.valueOf(codigoConsultaTxt);
				
				for(Consulta consulta : listaConsultas) {
				
					
					if(consulta.getCodigo() == codigoConsulta) {
						
						System.out.println("Qual das opcoes deseja editar?");
						System.out.println("1-Dentista/n2-Data/n3-Precon/4-Codigon/5-Tipon/6-Cliente");
						String opcaoAtualizarTxt = scan.nextLine();
						int opcaoAtualizar = Integer.valueOf(opcaoAtualizarTxt);
						
						if(opcaoAtualizar == 1) {
							String dentista = scan.nextLine();
							consulta.setDentista(dentista);
						}
						
	
					}
				}
			}
			


			
			
			
			break;
			
		case 5:
			
			System.out.println("- Exclusao de cadastro -");
			System.out.println("1 - Consulta");
			System.out.println("2 - Cliente");
			System.out.println("Digite 1 ou 2:");
			opcaoSubmenuTxt = scan.nextLine();
			opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
			
			verificaOpcaoSubmenu(opcaoSubmenu);

			if(opcaoSubmenu == 1) {
				
				System.out.println("Digite o codigo da consulta que deseja excluir:");
				String codigoConsultaTxt = scan.nextLine();
				int codigoConsulta = Integer.valueOf(codigoConsultaTxt);
				
				for(Consulta consulta : listaConsultas) {
					
					if(consulta.getCodigo() == codigoConsulta) {
						listaConsultas.remove(consulta);
						
						System.out.println("Cadastro de consulta removida!");
	
					}
				}
			}

			if(opcaoSubmenu == 2) {
				
				System.out.println("Digite o codigo do cliente que deseja excluir:");
				String codigoClienteTxt = scan.nextLine();
				int codigoCliente = Integer.valueOf(codigoClienteTxt);
				
				for(Cliente cliente : listaClientes) {
					
					if(cliente.getCodigo() == codigoCliente) {
						listaClientes.remove(cliente);
						
						System.out.println("Cadastro de cliente removido!");
	
					}
				}
			}		
			
			break;
		
		}


		}while(opcaoMenuPrincipal!=6);
	}

public static void verificaOpcaoSubmenu(int opcaoSubmenu) {
	
	Scanner scan = new Scanner(System.in);

	while(opcaoSubmenu!=1 && opcaoSubmenu!=2) {
		System.out.println("Opcao inexistente. Digite novamente:");
		String opcaoSubmenuTxt = scan.nextLine();
		opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
	}
}
}

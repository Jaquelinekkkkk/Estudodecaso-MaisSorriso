package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.ClienteDAO;
import modelo.Cliente;
import modelo.Consulta;

public class Main {

	public static void main(String[] args) {

		ArrayList<Consulta> listaConsultas = new ArrayList<>();
			
		ClienteDAO dao = ClienteDAO.getInstancia();
		
		Scanner scan = new Scanner(System.in);
		
		int opcaoMenuPrincipal = 0;
				
		do {
			
			System.out.println("Mais Sorriso - Sistema da Clinica Odontologica");
			System.out.println("1 - Cadastro de Consulta/Cliente");
			System.out.println("2 - Mostrar consultas/clientes cadstrados");
			System.out.println("3 - Buscar consultas/clientes");
			System.out.println("4 - Atualizar consultas/clientes");
			System.out.println("5 - Excluir consultas/clientes");
			System.out.println("6 - Sair");
			
			System.out.println("Escolha opcao do menu:");
			String opcaoTxt = scan.nextLine();
			opcaoMenuPrincipal = Integer.valueOf(opcaoTxt);
		
		switch(opcaoMenuPrincipal) {
		
		case 1:
			
			System.out.println("- Cadastro de Consulta/Cliente -");
			System.out.println("1 - Cadastrar nova consulta");
			System.out.println("2 - Cadastrar novo cliente");
			System.out.println("Digite 1 ou 2:");
			
			String opcaoSubmenuTxt = scan.nextLine();
			int opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);

			while(opcaoSubmenu!=1 && opcaoSubmenu!=2) {
				System.out.println("Opcao inexistente. Digite novamente:");
				opcaoSubmenuTxt = scan.nextLine();
				opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
			}
			
			if(opcaoSubmenu == 1) {
				
			
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
				
				listaConsultas.add(consulta1);
	
				System.out.println("Consulta cadastrada!");
				break;			
				
			}
			
			if(opcaoSubmenu == 2) {
				
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
				
				dao.inserirId(cliente1);
				
				System.out.println("Cliente cadastrado(a)!");
				break;
			
				}
			
			break;
			
			
		case 2:
			
			System.out.println("- Mostrar -");
			System.out.println("1 - Consultas cadastradas");
			System.out.println("2 - Clientes cadastrados");
			System.out.println("Digite 1 ou 2:");

			opcaoSubmenuTxt = scan.nextLine();
			opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);

			while(opcaoSubmenu!=1 && opcaoSubmenu!=2) {
				System.out.println("Opcao inexistente. Digite novamente:");
				opcaoSubmenuTxt = scan.nextLine();
				opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
			}
			
			if (opcaoSubmenu == 1 ){
				
				System.out.println("- Consultas cadastradas -");
				
				for(Consulta consulta : listaConsultas) {
					
					System.out.println("Dentista: " + consulta.getDentista());
					System.out.println("Data e hora: " + consulta.getDataHora());
					System.out.println("Preco: R$" + consulta.getPrecoConsulta());
					System.out.println("Tipo de consulta: " + consulta.getTipoConsulta());
					System.out.println("Codigo: " + consulta.getCodigo());
					System.out.println("Cliente: " + consulta.getCliente());
					System.out.println();
				}
			}
				
				if (opcaoSubmenu == 2 ){
					
					System.out.println("- Clientes cadastrados -");
					
					for(Cliente cliente1 : dao.listar()) {
					
					System.out.println("Nome: " + cliente1.getNome());
					System.out.println("Sobrenome: " + cliente1.getSobrenome());
					System.out.println("CPF: " + cliente1.getCpf());
					System.out.println("Telefone: " + cliente1.getTelefone());
					System.out.println("Endereco: " + cliente1.getEndereco());
					System.out.println("Codigo: " + cliente1.getId());
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

			while(opcaoSubmenu!=1 && opcaoSubmenu!=2) {
				System.out.println("Opcao inexistente. Digite novamente:");
				opcaoSubmenuTxt = scan.nextLine();
				opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
			}
			
			if(opcaoSubmenu == 1) {
				
				System.out.println("Digite o codigo da consulta que procura:");
				String codigoConsultaTxt = scan.nextLine();
				int codigoConsulta = Integer.valueOf(codigoConsultaTxt);
				
				for(Consulta consulta : listaConsultas) {
					
					if(consulta.getCodigo() == codigoConsulta) {
						System.out.println("Consulta encontrada!");
						System.out.println("Dentista: " + consulta.getDentista());
						System.out.println("Data e hora: " + consulta.getDataHora());
						System.out.println("Preco: R$" + consulta.getPrecoConsulta());
						System.out.println("Codigo" + consulta.getCodigo());
						System.out.println("Codigo: " + consulta.getCodigo());
						System.out.println("Cliente: " + consulta.getCliente());
						System.out.println();
						break;
	
					}
					
					
				}
				
				
			}
			
			if(opcaoSubmenu == 2) {
				
				System.out.println("Digite o codigo do cliente que procura:");
				String idClienteTxt = scan.nextLine();
				int idCliente = Integer.valueOf(idClienteTxt);
				
				
				for(Cliente cliente1 : dao.listar()) {
					
					dao.buscarPorId(idCliente);
					System.out.println("Nome: " + cliente1.getNome());
					System.out.println("Sobrenome: " + cliente1.getSobrenome());
					System.out.println("CPF: " + cliente1.getCpf());
					System.out.println("Telefone: " + cliente1.getTelefone());
					System.out.println("Endereco: " + cliente1.getEndereco());
					System.out.println("Codigo: " + cliente1.getId());
					System.out.println();	
					
				}

				//for(Cliente cliente : listaClientes) {
					
					//if(cliente.getId() == idCliente) {
						//System.out.println("Cliente encontrado!");
						//System.out.println("Nome: " + cliente.getNome());
						//System.out.println("Sobrenome: " + cliente.getSobrenome());
						//System.out.println("CPF: " + cliente.getCpf());
						//System.out.println("Telefone: " + cliente.getTelefone());
						//System.out.println("Endereco: " + cliente.getEndereco());
						//System.out.println("Codigo: " + cliente.getId());
						//System.out.println();	
						
						//dao.buscarPorId(idCliente);
	
					//}
				//}
			}
					
			break;
			
		case 4:
			
			System.out.println("- Atualizar cadastro -");
			System.out.println("1 - Consulta");
			System.out.println("2 - Cliente");
			System.out.println("Digite 1 ou 2:");

			opcaoSubmenuTxt = scan.nextLine();
			opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);

			while(opcaoSubmenu!=1 && opcaoSubmenu!=2) {
				System.out.println("Opcao inexistente. Digite novamente:");
				opcaoSubmenuTxt = scan.nextLine();
				opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
				
			}
			
			
			if(opcaoSubmenu == 1) {
				
				System.out.println("Digite o codigo da consulta que deseja atualizar:");
				String codigoConsultaTxt = scan.nextLine();
				int codigoConsulta = Integer.valueOf(codigoConsultaTxt);
				
				for(Consulta consulta : listaConsultas) {
					
					if(consulta.getCodigo() == codigoConsulta) {
						
						System.out.println("Qual das opcoes deseja editar?");
						System.out.println("1-Dentista\n2-Data\n3-Precon\n4-Tipon\n5-Cliente");
						String opcaoAtualizarTxt = scan.nextLine();
						int opcaoAtualizar = Integer.valueOf(opcaoAtualizarTxt);
						
						while(opcaoAtualizar<1 && opcaoAtualizar>5) {
							System.out.println("Opcao inexistente. Digite novamente:");
							opcaoAtualizarTxt = scan.nextLine();
							opcaoAtualizar = Integer.valueOf(opcaoAtualizarTxt);
						}
						
						if(opcaoAtualizar == 1) {
							System.out.println("Digite o dentista:");
							String dentista = scan.nextLine();
							consulta.setDentista(dentista);
							System.out.println("Cadastro atualizado");
							break; 
						}
						if(opcaoAtualizar == 2) {
							System.out.println("Digite a data e hora:");
							String dataHora = scan.nextLine();
							consulta.setDataHora(dataHora);
							System.out.println("Cadastro atualizado");
							break;
						}
						if(opcaoAtualizar == 3) {
							System.out.println("Digite o preco da consulta:");
							String precoTxt = scan.nextLine();
							double precoConsulta = Double.valueOf(precoTxt);
							consulta.setPrecoConsulta(precoConsulta);
							System.out.println("Cadastro atualizado");
							break;
						}
						if(opcaoAtualizar == 4) {
							System.out.println("Digite o tipo de consulta:");
							String tipoConsulta = scan.nextLine();
							consulta.setTipoConsulta(tipoConsulta);
							System.out.println("Cadastro atualizado");
							break;
						}
						if(opcaoAtualizar == 5) {
							System.out.println("Digite o nome do cliente:");
							String cliente = scan.nextLine();
							consulta.setCliente(cliente);
							System.out.println("Cadastro atualizado");
							break;
						}	
	
					}
					
				}
		
			}
			
			if (opcaoSubmenu == 2) {
				
				System.out.println("Digite o codigo do cliente que deseja atualizar:");
				String idClienteTxt = scan.nextLine();
				int idCliente = Integer.valueOf(idClienteTxt);
				
				//for(Cliente cliente : listaClientes) {
					
					//if(cliente.getId() == idCliente) {
						
						//System.out.println("Qual das opcoes deseja editar?");
						//System.out.println("1-Nome\n2-Sobrenome\n3-CPF\n4-Endereco\n5-Telefone");
						//String opcaoAtualizarTxt = scan.nextLine();
						//int opcaoAtualizar = Integer.valueOf(opcaoAtualizarTxt);
						
						//while(opcaoAtualizar<1 && opcaoAtualizar>5) {
							//System.out.println("Opcao inexistente. Digite novamente:");
							//opcaoAtualizarTxt = scan.nextLine();
							//opcaoAtualizar = Integer.valueOf(opcaoAtualizarTxt);
						//}
						
						//if(opcaoAtualizar == 1) {
						//System.out.println("Digite o nome:");
							//String nome = scan.nextLine();
							//cliente.setNome(nome);
							//System.out.println("Cadastro atualizado");
							//break;
						//}
						//
						//if(opcaoAtualizar == 2) {
						//	System.out.println("Digite o sobrenome:");
						//	String sobrenome = scan.nextLine();
						//	cliente.setSobrenome(sobrenome);
						//	System.out.println("Cadastro atualizado");
						//	break;
						//}
						
						//if(opcaoAtualizar == 3) {
						//	System.out.println("Digite o CPF:");
						//	String cpf = scan.nextLine();
						//	cliente.setCpf(cpf);
						//	System.out.println("Cadastro atualizado");
						//	break;
						//}
						
						//if(opcaoAtualizar == 4) {
						//	System.out.println("Digite o endereço:");
						//	String endereco = scan.nextLine();
						//	cliente.setEndereco(endereco);
						//	System.out.println("Cadastro atualizado");
							//break;
						//}
						
					//	if(opcaoAtualizar == 5) {
						//	System.out.println("Digite o telefone:");
						//	String telefone = scan.nextLine();
						//	cliente.setTelefone(telefone);
						//	System.out.println("Cadastro atualizado");
						//	break;
					//	}
					////	
				//	}
						
				//	}
	
			}
			break;
		//	
		case 5:
			
			System.out.println("- Exclusao de cadastro -");
			System.out.println("1 - Consulta");
			System.out.println("2 - Cliente");
			System.out.println("Digite 1 ou 2:");

			opcaoSubmenuTxt = scan.nextLine();
			opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);

			while(opcaoSubmenu!=1 && opcaoSubmenu!=2) {
				System.out.println("Opcao inexistente. Digite novamente:");
				opcaoSubmenuTxt = scan.nextLine();
				opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
			}
			

			if(opcaoSubmenu == 1) {
				
				System.out.println("Digite o codigo da consulta que deseja excluir:");
				String codigoConsultaTxt = scan.nextLine();
				int codigoConsulta = Integer.valueOf(codigoConsultaTxt);
				
					
						dao.removerPorId(codigoConsulta);
						System.out.println("Cadastro de consulta removida!");
						break;
						

			}

			if(opcaoSubmenu == 2) {
				
				System.out.println("Digite o codigo do cliente que deseja excluir:");
				String idClienteTxt = scan.nextLine();
				int idCliente = Integer.valueOf(idClienteTxt);
				
				
					
					dao.removerPorId(idCliente);						
						System.out.println("Cadastro de cliente removido!");
						break;
					}
			
			break;
			
			
		}


		}while(opcaoMenuPrincipal>=1 && opcaoMenuPrincipal<=5);
	}

}
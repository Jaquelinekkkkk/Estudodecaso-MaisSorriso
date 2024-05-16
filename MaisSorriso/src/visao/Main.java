package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.ClienteDAO;
import modelo.Cliente;
import modelo.Consulta;

public class Main {

	public static void main(String[] args) {
			
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
			
			System.out.println("- Cadastrar novo cliente -");


				
				Cliente cliente1 = new Cliente();
				
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
				
				System.out.println("Codigo: " + dao.inserirId(cliente1));
				
				System.out.println("Cliente cadastrado(a)!");
				break;
				
			
		case 2:
			

				System.out.println("- Clientes cadastrados -");
					
					for(Cliente cliente : dao.listar()) {
					
					System.out.println("Nome: " + cliente.getNome());
					System.out.println("Sobrenome: " + cliente.getSobrenome());
					System.out.println("CPF: " + cliente.getCpf());
					System.out.println("Telefone: " + cliente.getTelefone());
					System.out.println("Endereco: " + cliente.getEndereco());
					System.out.println("Codigo: " + cliente.getId());
					System.out.println();	
													
			}
			
		    break;
		    
			
		case 3:
			
			System.out.println("- Buscar cliente cadastrado -");
							
				System.out.println("Digite o codigo do cliente que procura:");
				
				String idClienteTxt = scan.nextLine();
				int idCliente = Integer.valueOf(idClienteTxt);
							
				
					System.out.println("Nome: " + dao.buscarPorId(idCliente).getNome());
					System.out.println("Sobrenome: " + dao.buscarPorId(idCliente).getSobrenome());
					System.out.println("CPF: " + dao.buscarPorId(idCliente).getCpf());
					System.out.println("Telefone: " + dao.buscarPorId(idCliente).getTelefone());
					System.out.println("Endereco: " + dao.buscarPorId(idCliente).getEndereco());
					System.out.println("Codigo: " + dao.buscarPorId(idCliente).getId());
					System.out.println();	
									
			break;
			
			
		case 4:
			
			System.out.println("- Atualizar cadastro -");

			
				
				System.out.println("Digite o codigo do cliente que deseja atualizar:");
				
			    idClienteTxt = scan.nextLine();
				idCliente = Integer.valueOf(idClienteTxt);
					
						System.out.println("Qual das opcoes deseja editar?");
						System.out.println("1-Nome\n2-Sobrenome\n3-CPF\n4-Endereco\n5-Telefone");
						String opcaoAtualizarTxt = scan.nextLine();
						int opcaoAtualizar = Integer.valueOf(opcaoAtualizarTxt);
						
						while(opcaoAtualizar<1 && opcaoAtualizar>5) {
							System.out.println("Opcao inexistente. Digite novamente:");
							opcaoAtualizarTxt = scan.nextLine();
							opcaoAtualizar = Integer.valueOf(opcaoAtualizarTxt);
						}
						
						if(opcaoAtualizar == 1) {
						System.out.println("Digite o nome:");
							String nome = scan.nextLine();
							dao.alterarPorId(idCliente).setNome(nome);
							System.out.println("Cadastro atualizado");
							break;
						}
						
						if(opcaoAtualizar == 2) {
							System.out.println("Digite o sobrenome:");
							String sobrenome = scan.nextLine();
							dao.alterarPorId(idCliente).setSobrenome(sobrenome);
							System.out.println("Cadastro atualizado");
							break;
						}
						
						if(opcaoAtualizar == 3) {
							System.out.println("Digite o CPF:");
							cpf = scan.nextLine();
							dao.alterarPorId(idCliente).setCpf(cpf);
							System.out.println("Cadastro atualizado");
							break;
						}
						
						if(opcaoAtualizar == 4) {
							System.out.println("Digite o endereço:");
							endereco = scan.nextLine();
							dao.alterarPorId(idCliente).setEndereco(endereco);
							System.out.println("Cadastro atualizado");
							break;
						}
						
						if(opcaoAtualizar == 5) {
							System.out.println("Digite o telefone:");
							telefone = scan.nextLine();
							dao.alterarPorId(idCliente).setTelefone(telefone);
							System.out.println("Cadastro atualizado");
							break;
						}

			break;
			
		
		case 5:
			
			System.out.println("- Exclusao de cadastro -");
				
				System.out.println("Digite o codigo do cliente que deseja excluir:");
				idClienteTxt = scan.nextLine();
				idCliente = Integer.valueOf(idClienteTxt);
	
					
					dao.removerPorId(idCliente);						
						System.out.println("Cadastro de cliente removido!");
						break;
			
			
		}


		}while(opcaoMenuPrincipal>=1 && opcaoMenuPrincipal<=5);
	}

}
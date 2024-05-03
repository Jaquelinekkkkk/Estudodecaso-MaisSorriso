package ifsc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Cliente> listaClientes = new ArrayList<>();
		ArrayList<Consulta> listaConsultas = new ArrayList<>();
		
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
			String opcaoSubmenuTxt = scan.nextLine();
			int opcaoSubmenu = Integer.valueOf(opcaoSubmenuTxt);
			
			verificaOpcaoSubmenu(opcaoSubmenu);
			
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
				System.out.println("Cliente:");
				String nomeCliente = scan.nextLine();
				consulta1.setCliente(nomeCliente);
				
				listaConsultas.add(consulta1);
				System.out.println("Consulta cadastrada!");
				
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
				System.out.println("Codigo:");
				String codigoTxt = scan.nextLine();
				int codigoCliente = Integer.valueOf(codigoTxt);
				cliente1.setCodigo(codigoCliente);
					
				listaClientes.add(cliente1);
				System.out.println("Cliente cadastrado(a)!");
				
			}
			
			break;
			
			
		case 2:
			
			System.out.println("- Mostrar -");
			System.out.println("1 - Consultas cadastradas");
			System.out.println("2 - Clientes cadastrados");
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
					System.out.println("Codigo" + consulta.getCodigo());
					System.out.println("Codigo: " + consulta.getCodigo());
					System.out.println("Cliente: " + consulta.getCliente());
					System.out.println();
				}
				
				if (opcaoSubmenu == 2 ){
					
				}
				
				
			}
			
		break;
			
		case 3:
			
			System.out.println("-Buscar consulta-");
			//codigo - anne
			break;
			
		case 4:
			
			System.out.println("-Atualizar cadastro-");
			//codigo - nao definido
			break;
			
		case 5:
			System.out.println("-Exclusao de cadastro-");
			//codigo - nao definido
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

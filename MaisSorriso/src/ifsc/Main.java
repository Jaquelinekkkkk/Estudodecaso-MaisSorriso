package ifsc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Cliente> consultas = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha opcao do menu:");
		String opcaoTxt = scan.nextLine();
		int opcao = Integer.valueOf(opcaoTxt);
		
		switch(opcao) {
		
		case 1:
			
			System.out.println("-Cadastro do Cliente-");
			Cliente cadastro = new Cliente();
			
			cadastro.setNome(cadastro.getNome());
			cadastro.setSobrenome(cadastro.getSobrenome());
			cadastro.setCodigo(cadastro.getCodigo());
			cadastro.setTelefone(cadastro.getTelefone());
			cadastro.setEndereco(cadastro.getEndereco());
			cadastro.setCpf(cadastro.getCpf());
			
			
			consultas.add(cadastro);
			break;
			
		case 2:
			
			System.out.println("- Digite a opção desejada. -");
			System.out.println("- 1 para agendar nova consulta.-");
			System.out.println("- 2 para consultas agendadas.-");
			String opcaoConsulta = scan.nextLine();	
			
			if ( opcaoconsulta = 1 ) {
				
			}
			 System.out.println();
			
		//  Consulta  consulta = new Consulta();
		 // consulta.setDentitsa(null);
		 // consulta.setAuxiliar(null);
		 // consulta.setTipoConsulta(null);
		 // consulta.setPrecoConsulta(0);
		//  consulta.setDataHora(null);
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
		

	}

}

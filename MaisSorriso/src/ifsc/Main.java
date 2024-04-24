package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Cliente> consultas = new ArrayList<>();
		
		int op = 1;
		switch(op) {
		
		case 1:
			
			System.out.println("-Cadastro do Cliente-");
			Cliente cadastro = new Cliente();
			
			cadastro.setNome(null);
			cadastro.setCodigo(null);
			cadastro.setTelefone(null);
			cadastro.setEndereco(null);
			cadastro.setCpf(null);
			
			
			consultas.add(null);
			break;
			
		case 2:
			
			System.out.println("-Consultas agendadas-");
			//codigo - jaque
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

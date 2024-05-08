package controle;

import java.util.ArrayList;

import modelo.Cliente;

public class ClienteDAO {	
	
	private ArrayList<Cliente> listaClientes;
	private int geradorId;
	
	public ClienteDAO() {
		this.listaClientes = new ArrayList<>();
		this.geradorId = 0;
	}
	
	public int inserir(Cliente cliente1) {
			
		if (cliente1 != null) {	
			cliente1.setId(geradorId);
			geradorId = geraodrId + 1;		
			listaClientes.add(cliente1);	
		}
		
		return cliente1.getId();
	
	
	}

	
    public ArrayList<Cliente> listar() {		
		return this.listaClientes;
	}

}

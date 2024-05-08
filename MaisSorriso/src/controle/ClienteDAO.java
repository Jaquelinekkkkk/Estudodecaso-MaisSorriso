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
	
	public int inserir(Cliente cliente) {
			
		if (cliente != null) {	
			cliente.setId(geradorId);
			geradorId = geradorId + 1;		
			listaClientes.add(cliente);	
		}
		
		return cliente.getId();
	
	
	}

	
    public ArrayList<Cliente> listar() {		
		return this.listaClientes;
	}
    
    // metodo de buscar    
    //Cliente clieneteEncontrado = dao.buscarPorId(idDelete);
    		
    		
    //metodo de excluir
    public boolean remover(Cliente cliente) {
    	boolean verifica = listaClientes.remove(cliente);
    	return verifica;
    }

    //metodo de alterar
}

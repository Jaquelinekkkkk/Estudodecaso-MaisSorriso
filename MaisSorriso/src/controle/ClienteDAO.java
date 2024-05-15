package controle;

import java.util.ArrayList;

import modelo.Cliente;

public class ClienteDAO {	
	
	private ArrayList<Cliente> listaClientes;
	private int geradorId;
	private static ClienteDAO  instancia;
	
	public static ClienteDAO getInstancia() {
		if(instancia == null) {
			instancia = new ClienteDAO();
		}
		return instancia;
		
	}
	//Pseudo metodo*
	private ClienteDAO() {
		this.listaClientes = new ArrayList<>();
		this.geradorId = 0;
	}
	
	public int inserir(Cliente cliente) {
			
		if (cliente != null) {	
			cliente.setId(geradorId);
			geradorId = geradorId ++;		
			listaClientes.add(cliente);	
		}
		
		return cliente.getId();
	
	
	}
	//listar
    public ArrayList<Cliente> listar() {		
		return this.listaClientes;
		
	}
    
    // buscar  
    public Cliente buscarPorId(int id) {
    	for(Cliente cliente : listaClientes) {
    		if(cliente.getId() == id) {
    			return cliente;
    		}
    	}
    	return null;
    	
    }
    //Cliente clieneteEncontrado = dao.buscarPorId(idDelete);
    		
    		
    //excluir
    public Cliente removerPorId(int id) {
    	for(Cliente cliente : listaClientes) {
    		if(cliente.getId() == id) {
    			listaClientes.remove(cliente);
    		}
    		
    	}
    	return null;
    }

    //alterar
    
    public Cliente alterarPorId(int id) {
    	for(Cliente cliente : listaClientes) {
    		if(cliente.getId() == id) {
    			
    		}
    	}
    	return null;
    }
}

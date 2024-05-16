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
	//Pseudo metodo 
	
	public ClienteDAO() {
		this.listaClientes = new ArrayList<>();
		this.geradorId = 1;
	}
	
    //case 1: gerar id
	public int inserirId(Cliente cliente1) {

		if (cliente1 != null) {	
			cliente1.setId(geradorId);
			geradorId ++;		
			listaClientes.add(cliente1);	
		}
		
		return cliente1.getId();
		
	}
	
	//case 2: listar
    public ArrayList<Cliente> listar() {	
		
		return this.listaClientes;		
	}
    
    //case 3: buscar  
    public Cliente buscarPorId(int id) {
    	for(Cliente cliente1 : listaClientes) {
    		if(cliente1.getId() == id) {
    			return cliente1;
    		}
    	}
    	return null;
    	
    }

    //case 4: alterar
    
    public Cliente alterarPorId(int id) {
    	for(Cliente cliente1 : listaClientes) {
    		if(cliente1.getId() == id) {
    			return cliente1;
    			
    		}
    	}
    	return null;
    }
    
    //case 5: excluir
    public Cliente removerPorId(int id) {
    	for(Cliente cliente1 : listaClientes) {
    		if(cliente1.getId() == id) {
    			listaClientes.remove(cliente1);
    		}
    		
    	}
    	return null;
    }
}

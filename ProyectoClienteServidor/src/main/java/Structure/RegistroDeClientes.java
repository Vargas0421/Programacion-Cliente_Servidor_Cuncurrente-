
package Structure;

import java.util.LinkedList;

public class RegistroDeClientes extends Cliente{
    
    
    protected LinkedList<Cliente> listaDeUsuasros = new LinkedList();
    
    public void ingresarUsusario(Cliente dato){
        listaDeUsuasros.add(dato);
    }
    
    
    
    
    
}

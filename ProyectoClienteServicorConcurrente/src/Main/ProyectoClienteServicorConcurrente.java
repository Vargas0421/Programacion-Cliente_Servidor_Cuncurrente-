package Main;

import Articulos.Articulo;
import Structure.RegistroDeClientes;
import Articulos.GestionDeArticulo;

/**
 *
 * @author Brandon VM
 */
public class ProyectoClienteServicorConcurrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RegistroDeClientes r = new RegistroDeClientes();
        GestionDeArticulo ges = new GestionDeArticulo();
        ges.ingresarArticulo();
        ges.ingresarArticulo();
        ges.mostarInventario();
        /*r.ingresarUsusario();
        r.ingresarUsusario();
        r.verListadoClientes();*/
    }
}

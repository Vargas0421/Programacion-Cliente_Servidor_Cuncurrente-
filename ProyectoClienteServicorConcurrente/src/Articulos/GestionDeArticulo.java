package Articulos;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class GestionDeArticulo extends Articulo {

    protected LinkedList<Articulo> inventario = new LinkedList<>();

    public void ingresarArticulo() {
        Articulo b = new Articulo();
        b.crearArticulo();
        boolean valor = true;

        for (Articulo articulo : inventario) {
            if (b.getNombre() == articulo.getNombre()) {
                valor = false;
                JOptionPane.showMessageDialog(null, "El nombre del articulo ya se encuentra regista");
            }
        }
        if (valor) {
            inventario.add(b);
        }
    }
    
    public void mostarInventario(){
        JOptionPane.showInternalMessageDialog(null, inventario.toString());
    }

}

package Structure;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class RegistroDeClientes extends Cliente {

    protected LinkedList<Cliente> listaDeUsuasros = new LinkedList();

    public void ingresarUsusario() {

        listaDeUsuasros.add(registroDeNuevoCliente());
    }

    private Cliente registroDeNuevoCliente() {
        Cliente c = new Cliente();
        c.setNnombre(JOptionPane.showInputDialog("Ingrese su nombre"));
        c.setApellidos(JOptionPane.showInputDialog("Igrese su primer apellido"));
        c.setCedula(Integer.parseInt(JOptionPane.showInputDialog("ingrese su id")));
        c.setDireccionExacta(JOptionPane.showInputDialog("Ingrese su direccion exacta"));
        String emailtest = JOptionPane.showInputDialog("Ingrese su correo");
        if (esEmailValido(emailtest)) {
            c.setEmail(emailtest);
            c.setMetodoDePagos(MetodoDePagoss.Tarjeta);
        } else {
            JOptionPane.showMessageDialog(null, "Email no válido");
            return null;
        }

        return c;
    }

    public void verListadoClientes() {
        listaDeUsuasros.toString();
    }

}

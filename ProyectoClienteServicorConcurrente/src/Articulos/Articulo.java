package Articulos;

import javax.swing.JOptionPane;

public class Articulo {
    
    protected String nombre;
    protected int cantidad;
    protected tipoDeArticulo categoria;
    protected  double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public tipoDeArticulo getCategoria() {
        return categoria;
    }

    public void setCategoria(tipoDeArticulo categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public enum tipoDeArticulo{
        
    }
    
    public Articulo crearArticulo(){
        Articulo newArticulo = new Articulo();
        newArticulo.setNombre(JOptionPane.showInputDialog("ingrese el nombe del articulo"));
        newArticulo.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de stock ")));
        newArticulo.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio unitario del articulo")));
    return newArticulo;
    }

    @Override
    public String toString() {
                return nombre + " con una cantidad de: " + cantidad + " y un precion unitario de " + precio + " colones \n";

    }

    
    
}

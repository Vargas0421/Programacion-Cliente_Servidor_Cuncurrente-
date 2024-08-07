/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import MetodosDePago.MetodoDePago;
import Articulos.Articulo;

public class Cliente {

    protected String Nnombre;
    protected String apellidos;
    protected int cedula;
    protected String direccionExacta;
    protected String email;
    protected double DineroEnLaCuenta;
    protected MetodoDePagoss metodoDePagos;
    protected int dineroEnLaCuenta;
    
    public enum MetodoDePagoss{
        Tarjeta,
        Efectivo,
        TranferenciaBancaria
    }

    protected LinkedList<Articulo> carritoDeCompra = new LinkedList<>();

    public Cliente() {
    }

    public String getNnombre() {
        return Nnombre;
    }

    public void setNnombre(String Nnombre) {
        this.Nnombre = Nnombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccionExacta() {
        return direccionExacta;
    }

    public void setDireccionExacta(String direccionExacta) {
        this.direccionExacta = direccionExacta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDineroEnLaCuenta() {
        return DineroEnLaCuenta;
    }

    public void setDineroEnLaCuenta(double DineroEnLaCuenta) {
        this.DineroEnLaCuenta = DineroEnLaCuenta;
    }

    public MetodoDePagoss getMetodoDePagos() {
        return metodoDePagos;
    }

    public void setMetodoDePagos(MetodoDePagoss metodoDePagos) {
        this.metodoDePagos = metodoDePagos;
    }

   

    public LinkedList<Articulo> getCarritoDeCompra() {
        return carritoDeCompra;
    }

    public void setCarritoDeCompra(LinkedList<Articulo> carritoDeCompra) {
        this.carritoDeCompra = carritoDeCompra;
    }

    public boolean esEmailValido(String a) {
        return a.contains("@");
    }

    @Override
    public String toString() {
        return Nnombre + "" + apellidos + ", id: " + cedula + ", vive en: " + direccionExacta + ", @; " + email + "\n";
    }

}

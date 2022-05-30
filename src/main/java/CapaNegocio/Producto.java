/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;
import java.util.ArrayList;

public class Producto {
    private char codProducto;
    private String descripcionProducto;
    private double PrecioReferenciaProducto;

    public char getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(char codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecioReferenciaProducto() {
        return PrecioReferenciaProducto;
    }

    public void setPrecioReferenciaProducto(double PrecioReferenciaProducto) {
        this.PrecioReferenciaProducto = PrecioReferenciaProducto;
    }
    
    public ArrayList<DetalleFactura> EstaenDetalleFactura = new ArrayList();
    public ArrayList<DetallePedido> estaenPedido = new ArrayList();
    
}

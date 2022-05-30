/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;
import java.util.ArrayList;

public class Factura {

    public char getCodRegistroVenta() {
        return codRegistroVenta;
    }

    public void setCodRegistroVenta(char codRegistroVenta) {
        this.codRegistroVenta = codRegistroVenta;
    }

    public String getTipoPagoRegistroVenta() {
        return tipoPagoRegistroVenta;
    }

    public void setTipoPagoRegistroVenta(String tipoPagoRegistroVenta) {
        this.tipoPagoRegistroVenta = tipoPagoRegistroVenta;
    }

    public double getSubTotalDetalleFactura() {
        return subTotalDetalleFactura;
    }

    public void setSubTotalDetalleFactura(double subTotalDetalleFactura) {
        this.subTotalDetalleFactura = subTotalDetalleFactura;
    }
    private char codRegistroVenta;
    private String tipoPagoRegistroVenta;
    private double subTotalDetalleFactura;
    
    public Cliente correspondeCliente;
    public ArrayList<DetalleFactura> tieneDetalleFactura= new ArrayList();
}

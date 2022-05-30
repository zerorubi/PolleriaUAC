/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

public class DetalleFactura {
    private char coddetalleFactura;
    private double precioRealUnitarioDetalleFactura;
    private double subTotalDetalleFactura;
    private float cantidadDetalleFactura;

    public char getCoddetalleFactura() {
        return coddetalleFactura;
    }

    public void setCoddetalleFactura(char coddetalleFactura) {
        this.coddetalleFactura = coddetalleFactura;
    }

    public double getPrecioRealUnitarioDetalleFactura() {
        return precioRealUnitarioDetalleFactura;
    }

    public void setPrecioRealUnitarioDetalleFactura(double precioRealUnitarioDetalleFactura) {
        this.precioRealUnitarioDetalleFactura = precioRealUnitarioDetalleFactura;
    }

    public double getSubTotalDetalleFactura() {
        return subTotalDetalleFactura;
    }

    public void setSubTotalDetalleFactura(double subTotalDetalleFactura) {
        this.subTotalDetalleFactura = subTotalDetalleFactura;
    }

    public float getCantidadDetalleFactura() {
        return cantidadDetalleFactura;
    }

    public void setCantidadDetalleFactura(float cantidadDetalleFactura) {
        this.cantidadDetalleFactura = cantidadDetalleFactura;
    }

    public Factura perteneceFactura;
    public Producto contieneProducto;
    
}

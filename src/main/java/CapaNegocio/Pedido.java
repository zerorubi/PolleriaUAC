/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;
import java.util.ArrayList;

public class Pedido {

    public char getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(char codPedido) {
        this.codPedido = codPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    public String getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    public void setFechaHoraPedido(char codPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }
    private String fechaHoraPedido;
    private char codPedido;
    private String estadoPedido;
    
    public ArrayList<DetallePedido> contieneDetallePedido = new ArrayList();
    public Motorizado atendidoporMotorizado;

    public void setFechaHoraPedido(String fechaHoraPedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

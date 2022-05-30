/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;


public class DetallePedido {
    private char codDetallePedido;
    private float CantidadDetallePedido;

    public char getCodDetallePedido() {
        return codDetallePedido;
    }

    public void setCodDetallePedido(char codDetallePedido) {
        this.codDetallePedido = codDetallePedido;
    }

    public float getCantidadDetallePedido() {
        return CantidadDetallePedido;
    }

    public void setCantidadDetallePedido(float CantidadDetallePedido) {
        this.CantidadDetallePedido = CantidadDetallePedido;
    }
    
    public Producto consignaProducto;
    public Pedido perteneceaPedido;
    
}

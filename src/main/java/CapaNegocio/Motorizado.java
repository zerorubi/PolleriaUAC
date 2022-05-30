/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import java.util.ArrayList;

public class Motorizado {
    private char codMotorizado;
    private String nombreMotorizado;
    private String celularMotorizado;

    public char getCodMotorizado() {
        return codMotorizado;
    }

    public void setCodMotorizado(char codMotorizado) {
        this.codMotorizado = codMotorizado;
    }

    public String getNombreMotorizado() {
        return nombreMotorizado;
    }

    public void setNombreMotorizado(String nombreMotorizado) {
        this.nombreMotorizado = nombreMotorizado;
    }

    public String getCelularMotorizado() {
        return celularMotorizado;
    }

    public void setCelularMotorizado(String celularMotorizado) {
        this.celularMotorizado = celularMotorizado;
    }
   
    public ArrayList<Pedido> atiendePedido= new ArrayList();
}

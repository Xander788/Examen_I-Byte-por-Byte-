/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reclamos;

/**
 *
 * @author Student
 */
public enum EnumEstado {
    PENDIENTE,('ESTADO PENDIENTE'),
    ENPROCESO('ESTADO EN PROCESO'),
    RESUELTO('ESTADO RESUELTO');
    

    public final String estado;

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "EnumEstado{" + "estado=" + estado + '}';
    }
   
}

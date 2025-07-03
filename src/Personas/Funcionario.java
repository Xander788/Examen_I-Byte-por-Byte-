/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Funcionario extends Ciudadano{
    private String cargo;
    private String unidad;

    public String getCargo() {
        return cargo;
    }

    public String getUnidad() {
        return unidad;
    }

    public Funcionario(String cargo, String unidad, LocalDate fecha_nacimiento, String correo, String telefono, int cedula, String nombre) {
        super(fecha_nacimiento, correo, telefono, cedula, nombre);
        this.cargo = cargo;
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cedula=" + this.getCedula() + "nombre=" + this.getNombre() + "cargo=" + cargo + ", unidad=" + unidad + '}';
    }
    
}

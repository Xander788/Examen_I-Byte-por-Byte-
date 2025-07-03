/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Student
 */
public class Ciudadano extends Persona {
    private LocalDate fecha_nacimiento;
    private String correo;
    private String telefono;

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Ciudadano(LocalDate fecha_nacimiento, String correo, String telefono, int cedula, String nombre) {
        super(cedula, nombre);
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "cedula=" + this.getCedula() + "nombre=" + this.getNombre() + "fecha_nacimiento=" + fecha_nacimiento + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    public int calcularEdad(){
        return Period.between(fecha_nacimiento, LocalDate.now()).getYears();
    }
    
}

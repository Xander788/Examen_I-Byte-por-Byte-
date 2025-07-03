/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reclamos;
import Personas.Persona;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Student
 */
public class Reclamo {
    private int codigo;
    private String descripcion;
    private LocalDate fecha;
    private String categoria;
    private Persona ciudadano;
    private Persona funcionario;

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   
    //metodo constructor
    public Reclamo(int codigo, String descripcion, LocalDate fecha, String categoria) {
        
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.categoria = categoria;
    }
 //dias transcurridos desde la emicion(metodo) 
 public int fechaTranscurrida (LocalDate fecha){
        return Period.between(fecha, LocalDate.now()).getDays();
    }
 
 //error al momento de implementar los gets para decir quien es el ciudadano y el funcionario
    @Override
    public String toString() {
        return "Reclamo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", fecha=" + fecha + ", categoria=" + categoria + ", ciudadano=" + this.getNombre() + ", funcionario=" + this.getCedula()'}';
    }
    
    
}
  
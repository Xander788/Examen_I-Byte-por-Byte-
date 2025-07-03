/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import List.List;

/**
 *
 * @author Student
 */
public class Funcionario_lista implements List<Funcionario> {
    public Funcionario Funcionario[];
    
    public Funcionario_lista(){
        this.Funcionario = new Funcionario[100];
    }

    @Override
    public boolean Add(Funcionario t) {
        int max = Funcionario.length;
        for (int i = 0; i < max; i++) {
            if(Funcionario[i]==null){
                Funcionario[i]=t;
                return true;
            }
            
        }
        return false;
    }

    @Override
    public boolean Delete(Funcionario t) {
       int max = Funcionario.length;
        for (int i = 0; i < max; i++) {
            if(Funcionario[i]==t){
                Funcionario[i]=null;
                return true;
            }
            
        }
        return false;
    }

    @Override
    public Funcionario Find(Object cedula) {
        int max = Funcionario.length;
        for (int i = 0; i < max; i++) {
            if(Funcionario[i]==cedula){
                Funcionario[i].toString();
            }
        }
        return null;
    }   
}


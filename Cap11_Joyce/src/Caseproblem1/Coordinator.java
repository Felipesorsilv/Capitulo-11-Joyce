/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caseproblem1;

/**
 *
 * @author felipe
 */
public class Coordinator extends Employee{

    public Coordinator(Integer identificador, String apellido, String nombre) {
        super(identificador, apellido, nombre);
    }

    @Override
    public Double setTarifa() {
        return 20.00; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String setPuesto() {
        return "Coodinador"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author franc
 */
public class Persona {
    public String nombre;
    public String apellido;
    public String fechaNacimiento;

    public Persona(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void identificate(){
        System.out.print("\n mi nombre es: "+ 
                nombre);
    }
    
    public void cumpleaños(){
        System.out.print("\n mi cumpleaños es el: " + 
                fechaNacimiento.substring(0, 5));
    }
    
    
    
    
    
    
    
}

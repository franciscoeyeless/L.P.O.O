/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author franc
 */
public class Personaje {
    public String nombre;
    public String apellido;
    public int edad;
    public int posicionX;
    public int posicionY;

    public Personaje(String nombre, String apellido, int edad, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
    public void presentate(){
        System.out.print("\n Hola me presento, soy: "+ 
                nombre+" "+apellido);
    }
}

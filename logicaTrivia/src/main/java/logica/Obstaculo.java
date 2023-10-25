/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author franc
 */
public class Obstaculo {
    public String nombre;
    public int posicionX;
    public int posicionY;

    public Obstaculo(String nombre, int posicionX, int posicionY) {
        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
    public void mostrar(){
        System.out.print("\n El obstaculo es: "+ 
                nombre+"\n"+" En la posicion: X:"+posicionX+", Y:"+posicionY);
    }
}

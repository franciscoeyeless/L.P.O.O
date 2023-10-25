/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author franc
 */
public class Protagonista extends Personaje{
    public int idProtagonista;
    public int vida;
    public int puntos;

    public Protagonista(int idProtagonista, int vida, int puntos, String nombre, String apellido, int edad, int posicionX, int posicionY) {
        super(nombre, apellido, edad, posicionX, posicionY);
        this.idProtagonista = idProtagonista;
        this.vida = vida;
        this.puntos = puntos;
    }
    
    
    public void presentate(){
        super.presentate();
        System.out.print("\n mi edad es: "+ edad +"\n mis puntos de vida son: "+ vida +"\n mi puntuación es: "+puntos+
                "\n mi posicion en X es: "+posicionX +"\n en Y es: "+posicionY+"\n");
    }
}

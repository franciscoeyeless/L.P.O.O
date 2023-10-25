/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author franc
 */
public class Villano extends Personaje{
    public int idVillano;
    public String respuesta;
    public String respCorrect;
    public String pregunta;

    public Villano(int idVillano, String respuesta, String respCorrect, String pregunta, String nombre, String apellido, int edad, int posicionX, int posicionY) {
        super(nombre, apellido, edad, posicionX, posicionY);
        this.idVillano = idVillano;
        this.respuesta = respuesta;
        this.respCorrect = respCorrect;
        this.pregunta = pregunta;
    }

    public void presentate(){
        super.presentate();
        System.out.print("\n mi edad es: "+ edad +
                "\n mi posicion en X es: "+posicionX +"\n en Y es: "+posicionY+"\n");
    }
    
    
}

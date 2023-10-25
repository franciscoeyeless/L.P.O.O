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
    public int posX, posY;
    public int tam;

    public Personaje(String nombre, int posX, int posY, int tam) {
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
        this.tam = tam;
    }
    
    
    
    public void mDerecha(){
        this.posX = posX + 1;
    }
    
    public void mIzquierda(){
        this.posX = posX - 1;
    }
    
    public void mAbajo(){
        this.posY = posY - 1;
    }
    
    public void mArriba(){
        this.posY = posY + 1;
    }
}

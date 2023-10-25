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
    public boolean estado;
    int valor;
    int posX, posY;

    public Obstaculo(boolean estado, int valor, int posX, int posY) {
        this.estado = estado;
        this.valor = valor;
        this.posX = posX;
        this.posY = posY;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getValor() {
        return valor;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
    
    public void mostrar(){
        System.out.println("Obstaculo: "+ posX + ", "+ posY + " valor " + valor +" "+ estado);
    }
    
}

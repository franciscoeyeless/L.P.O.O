/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Escenario {
    
    public String nombre;
    Personaje p;
    //Obstaculo o;
    public ArrayList obstaculo;
    public int limiteObstaculo=10;
    
    public Escenario(){
        p = new Personaje("CrazyFrog", 0, 0, 5);
        //r = new Recompensa(true, 100);
        obstaculo = new ArrayList();
        limiteObstaculo =  10;
    }
    
    /*public void añadirRecompensa(Recompensa r){
        if(recompensas.size()<limiteRecompensas)
            recompensas.add(r);
    }*/
    
    /*public void mostrar(){
        for (int i =0; i <recompensas.size(); i++){
            Object o =recompensas.get(i);
            Recompensa rr=(Recompensa)o;
            rr.mostrar();
           // ((Recompensa)recompensas.get(i)).mostrar();
            
        }
    }*/

    public Personaje getP() {
        return p;
    }

    public void setP(Personaje p) {
        this.p = p;
    }
    
    
}

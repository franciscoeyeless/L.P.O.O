/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

import logica.Obstaculo;
import logica.Protagonista;
import logica.Villano;

/**
 *
 * @author franc
 */
public class LogicaTrivia {

    public static void main(String[] args) {
       
        Protagonista p1= new Protagonista(1, 3, 0, "Franc", "Martin", 27, 100, 100);
        
        p1.presentate();
        
        Villano v1= new Villano(1, " ", " ", " ", "Thanos", " ", 40, 100, 100);
        v1.presentate();
        
        Obstaculo o1= new Obstaculo("pared", 150, 150);
        o1.mostrar();
        
        
        
    }
}

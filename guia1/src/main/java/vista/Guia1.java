/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

import logica.Profesor;
/**
 *
 * @author franc
 */
public class Guia1 {

    public static void main(String[] args) {
        System.out.println("");
        
        Profesor p1 = new Profesor(123,"20-02-2022","big data","franc","zinatra","19-03-1951");
        
        
        
        Profesor p2 = new Profesor(789, "21-01-2023", "neurociencia", "flanberto", "bridge", "30-05-2000");
        p2.identificate();
        p2.cumpleaños();
        
        
    }
}

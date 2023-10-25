/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author franc
 */
public class Profesor extends Persona {
    public int numeroDeContrato;
    public String fechaDeContrato;
    public String especialidad;

    public Profesor(int numeroDeContrato, String fechaDeContrato, String especialidad, String nombre, String apellido, String fechaNacimiento) {
        super(nombre, apellido, fechaNacimiento);
        this.numeroDeContrato = numeroDeContrato;
        this.fechaDeContrato = fechaDeContrato;
        this.especialidad = especialidad;
    }
    
    public void identificate(){
        super.identificate();
        System.out.print(" "+numeroDeContrato + " " +
            fechaDeContrato + " " + especialidad+" ");
    }
    
    /*public void evalua(Estudiante estudiante){
        estudiante.nota = 7;
    }*/
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempresa;

/**
 *
 * @author delly
 */
public class Empleado extends Persona{
    private int sueldo_bruto;

    public Empleado(int sueldo_bruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public int getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(int sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

     @Override
    public void mostrar() {
        super.mostrar(); 
         System.out.println("y su sueldo bruto es "+sueldo_bruto);
    }
    
    
    
    
}

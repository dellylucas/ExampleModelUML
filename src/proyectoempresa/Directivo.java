/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempresa;

import java.util.ArrayList;

/**
 *
 * @author delly
 */
public class Directivo extends Empleado{
    private String categoria;
    private ArrayList<Empleado> subordinados;

    public Directivo(String categoria, ArrayList<Empleado> subordinados, int sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }

}

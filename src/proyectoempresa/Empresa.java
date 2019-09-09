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
public class Empresa {
    private ArrayList<Cliente> clientes;
    private  ArrayList<Empleado> empleados;
    private String nombre;

    public Empresa(String nombre) {
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
}

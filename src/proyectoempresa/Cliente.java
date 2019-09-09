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
public class Cliente extends Persona{
    private String nombre_empresa;
    private String telefono_de_contacto;

    public Cliente(String nombre_empresa, String telefono_de_contacto, String nombre, int edad) {
        super(nombre, edad);
        this.nombre_empresa = nombre_empresa;
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }

    @Override
    public void mostrar() {
        super.mostrar(); 
         System.out.println("y su empresa es "+nombre_empresa+" telefono "+telefono_de_contacto);
    }
    
}

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
public class ProyectoEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa emp=new Empresa("Rappi");
        
        Cliente cli1=new Cliente("enterprise","23423","Juan",33);
        Empleado emp1=new Empleado(300000,"jorge",33);
        emp.getEmpleados().add(emp1);
         emp.getClientes().add(cli1);
        System.out.println(emp.getClientes().size()); 
        emp1.mostrar();
     
    }
    
}

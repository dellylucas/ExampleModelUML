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
public class ProyectoEmpresa {

    private ArrayList<Empresa> empresas;

    public static void main(String[] args) {
        ProyectoEmpresa ejecucion = new ProyectoEmpresa();

        ejecucion.empresas = new ArrayList<>();
        ejecucion.inicializacion();
        ejecucion.empresas.get(2).ordenarClientes();
        
        
    }

    private void inicializacion() {

        Empresa emp;
        Cliente cliente;
        Directivo directivo;
        Empleado empledo;

        //primera
        emp = new Empresa("Rappi");
        cliente = new Cliente("macinc", "4343453", "pedro", 33);
        emp.getClientes().add(cliente);
        cliente = new Cliente("macinc", "3434342", "pablo", 22);
        emp.getClientes().add(cliente);
        cliente = new Cliente("colsubsidio", "6878978", "peter", 20);
        emp.getClientes().add(cliente);
        cliente = new Cliente("sanitas", "687854", "paco", 50);
        emp.getClientes().add(cliente);
        cliente = new Cliente("sanitas", "3567899", "pastor", 42);
        emp.getClientes().add(cliente);

        directivo = new Directivo("sistemas", 2000000, "juan", 32);
        emp.getEmpleados().add(directivo);

        empledo = new Empleado(200000, "jorge", 22);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);
        empledo = new Empleado(250000, "jacobo", 25);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);
        empledo = new Empleado(300000, "jercio", 40);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);
        empledo = new Empleado(400000, "jesus", 33);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);

        empresas.add(emp);

        //segunda
        emp = new Empresa("Juan Valdez");
        cliente = new Cliente("facebook", "23453", "alberto", 33);
        emp.getClientes().add(cliente);
        cliente = new Cliente("facebook", "34534342", "ernesto", 22);
        emp.getClientes().add(cliente);
        cliente = new Cliente("eltesa", "658978", "jaramillo", 20);
        emp.getClientes().add(cliente);
        cliente = new Cliente("facebook", "4547854", "esteban", 19);
        emp.getClientes().add(cliente);
        cliente = new Cliente("eltesa", "8767899", "ignacio", 42);
        emp.getClientes().add(cliente);

        directivo = new Directivo("contabilidad", 1000000, "Edilberto", 44);
        emp.getEmpleados().add(directivo);

        empledo = new Empleado(100000, "pompilio", 33);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);
        empledo = new Empleado(270000, "permeo", 25);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);
        empledo = new Empleado(320000, "olga", 23);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);
        empledo = new Empleado(430000, "jessica", 25);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);

        empresas.add(emp);

        //tercera
        emp = new Empresa("Cafam");
        cliente = new Cliente("medimas", "463453", "Ernesto", 37);
        emp.getClientes().add(cliente);
        cliente = new Cliente("medimas", "376342", "Julio", 49);
        emp.getClientes().add(cliente);
        cliente = new Cliente("xmen", "6858978", "Tomas", 43);
        emp.getClientes().add(cliente);
        cliente = new Cliente("xmen", "654854", "Yesenia", 22);
        emp.getClientes().add(cliente);
        cliente = new Cliente("sony", "32889899", "Maria", 20);
        emp.getClientes().add(cliente);

        directivo = new Directivo("diseño", 2500000, "Michel", 22);
        emp.getEmpleados().add(directivo);

        empledo = new Empleado(120000, "Marco", 22);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);
        empledo = new Empleado(90000, "Federico", 31);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);
        empledo = new Empleado(200000, "Iniria", 21);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);
        empledo = new Empleado(490000, "James", 30);
        directivo.getSubordinados().add(empledo);
        emp.getEmpleados().add(empledo);

        empresas.add(emp);

    }

}

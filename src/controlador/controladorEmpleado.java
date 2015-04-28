/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.EmpleadoJpaController;
import logica.Empleado;

/**
 *
 * @author julian
 */
public class controladorEmpleado {
   
    EmpleadoJpaController empContro;

    public controladorEmpleado() {
    
        empContro = new EmpleadoJpaController();
    }
    
    public void agregarEmpleado(String empId, String nombre, String cedula, String correo, String cargo,
                                float salario, String direccion, String telefono) throws Exception{
    
        Empleado emp = new Empleado(empId, cedula, nombre, direccion, telefono, cargo, correo, salario);
        
        empContro.create(emp);
    }

    public void actualizarEmpleado(String empId, String nombre, String cedula, String correo, String cargo,
                                float salario, String direccion, String telefono) throws Exception{
    
        Empleado emp = new Empleado(empId, cedula, nombre, direccion, telefono, cargo, correo, salario);
        
        empContro.create(emp);
    }
    
    public void eliminarEmpleado(String empId) throws Exception{
    
        empContro.destroy(empId);
    }
    
    public Empleado buscarEmpleado(String empleadoId){
    
        return empContro.findEmpleado(empleadoId);
    
    }
    
    
}

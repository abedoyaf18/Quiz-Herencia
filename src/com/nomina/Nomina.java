package com.nomina;

import java.util.ArrayList;
import java.util.List;

public class Nomina {

    private List<Empleado> empleados;


    public Nomina(){
        this.empleados= new ArrayList<>();
    }

    public void  calcularNomina(List<Empleado> empleados){


        listarDirectos(empleados);
        listarFreelancers(empleados);
        listarPromotores(empleados);
    }

    public void  listarDirectos(List<Empleado> empleados){
        empleados.forEach(empleado -> {
            if (empleado instanceof Directo) {
                if(empleado instanceof Vendedor){
                    System.out.println(empleado.getNombre()+ " Es Directo y el sueldo de este mes es: " + "$" +((Vendedor) empleado).calcularSalario());
                }else {
                    System.out.println(empleado.getNombre()+ " Es Vendedor y el sueldo de este mes es: " + "$" +((Directo) empleado).calcularSalario());
                }
            }
        });
    }
    public void  listarFreelancers(List<Empleado> empleados){
        empleados.forEach(empleado -> {
            if (empleado instanceof Freelance) {
                System.out.println(empleado.getNombre() + " Es Freelance y el sueldo de este mes es: " + "$" +((Freelance) empleado).calcularSalario());
            }
        });

    }
    public void  listarPromotores(List<Empleado> empleados){
        empleados.forEach(empleado -> {
            if (empleado instanceof Promotor) {
                System.out.println(empleado.getNombre()+ " Es Promotor y el sueldo de este mes es: " + "$" +((Promotor) empleado).calcularSalario());
            }
        });

    }
}

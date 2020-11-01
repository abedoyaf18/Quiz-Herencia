package com.app;

import com.nomina.*;

import java.util.ArrayList;
import java.util.List;

public class AppNomina {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        Nomina nomina = new Nomina();

        empleados.add(new Directo("Juan",484000));
        empleados.add(new Vendedor("Julian",2050000,45510000));
        empleados.add(new Vendedor("Carolina",980000,35989000));
        empleados.add(new Freelance("Johanna", 71000,89));
        empleados.add(new Promotor("Pedro", 1200,300,62));
        empleados.add(new Directo("David",3975000));
        empleados.add(new Freelance("Gustavo", 42500,65));


        System.out.println("Nomina Empresa Camaras");
        nomina.calcularNomina(empleados);

    }
}

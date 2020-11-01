package com.nomina;

public class Directo extends Empleado{
    private static double APORTESALUD = 0.05;
    private static double APORTEPENSION = 0.065;
    private long salario;

    public Directo(String nombre,long salario) {
        super(nombre);
        this.salario = salario;
    }

    private long calcularSalud(){
        return (long) (this.salario * APORTESALUD);
    }

    private long calcularPension(){
        return (long) (this.salario * APORTEPENSION);
    }

    public long getSalario() {
        return this.salario;
    }

    @Override
    public long calcularSalario() {
        return this.salario - calcularPension()-calcularSalud();
    }
}

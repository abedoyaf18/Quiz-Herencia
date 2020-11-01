package com.nomina;

public class Vendedor extends Directo{
    public static final double VALORMENOR = 0.04;
    public static final double VALORMAYOR = 0.035;
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    public long calcularSalario() {
        return super.calcularSalario() + this.calcularComision();
    }

    public long calcularComision(){
        if (getSalario() < 999999){
            return (long) (this.ventasDelMes * VALORMENOR);
        }else {
            return (long) (this.ventasDelMes * VALORMAYOR);
        }
    }
}

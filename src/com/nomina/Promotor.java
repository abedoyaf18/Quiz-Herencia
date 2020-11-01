package com.nomina;

public class Promotor extends Empleado{
    public static final int PORCADACOMPRA = 15000;
    private int volanteRepartidos;
    private long valorVolante;
    private long comprasVolantes;

    public Promotor(String nombre, int volanteRepartidos, long valorVolante,long comprasVolantes ) {
        super(nombre);
        this.volanteRepartidos = volanteRepartidos;
        this.valorVolante = valorVolante;
        this.comprasVolantes = comprasVolantes;
    }

    @Override
    public long calcularSalario() {

        return (volanteRepartidos * valorVolante) + (PORCADACOMPRA * comprasVolantes);
    }
}

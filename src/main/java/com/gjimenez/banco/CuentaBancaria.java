package com.gjimenez.banco;

public abstract class CuentaBancaria {
    private String titular;
    private TiposCuenta tipoCuenta;
    protected double saldo;
    private final double COMISION = 1.2;

    public CuentaBancaria(String t, TiposCuenta tipo, double s){
        this.titular = t;
        this.tipoCuenta = tipo;
        this.saldo = s;
    }

    public CuentaBancaria(String t, double s){
        this(t, TiposCuenta.AHORRO, s);
    }

    public void sacarDinero(double cantidad){
        if(cantidad <= 0){
            return;
        }
        saldo -= cantidad;

    }

    public void ingresarDinero(double cantidad){
        if(cantidad <= 0){
            return;
        }
        saldo += cantidad;
    }

    public void cambiarTipoCuenta(TiposCuenta tipoNuevo){
        tipoCuenta = tipoNuevo;
    }

    public double obtenerSaldo(){
        return saldo;
    }

    public abstract void informarSobreCondicionesLegales();

}


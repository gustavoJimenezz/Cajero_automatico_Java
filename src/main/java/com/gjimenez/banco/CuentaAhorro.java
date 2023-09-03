package com.gjimenez.banco;

public class CuentaAhorro extends CuentaBancaria {
    private final double COMISION = 0.2;
    public CuentaAhorro(String t, TiposCuenta tipo, double s){
        super(t, tipo, s);
    }

    public CuentaAhorro(String t, double s){
        super(t, TiposCuenta.AHORRO, s);
    }

    @Override
    public void sacarDinero(double cantidad){
        if(cantidad <= 0){
            return;
        }
        saldo -= cantidad;
        saldo -= this.COMISION;
    }

    @Override
    public void informarSobreCondicionesLegales(){
        System.out.println("Condiciones legales de la cuenta Nomina del banco ***");
        System.out.println("Segun el acuerdo firmado por usted ...");
    }

}

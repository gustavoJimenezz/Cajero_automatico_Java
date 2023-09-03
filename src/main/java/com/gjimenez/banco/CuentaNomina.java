package com.gjimenez.banco;

public class CuentaNomina extends CuentaBancaria{
    public CuentaNomina(String t, TiposCuenta tipo, double s){
        super(t, tipo, s);
    }

    public CuentaNomina(String t, double s){
        super(t, TiposCuenta.AHORRO, s);
    }

    @Override
    public void informarSobreCondicionesLegales(){
        System.out.println("Condiciones legales de la cuenta Nomina del banco ***");
        System.out.println("Segun el acuerdo firmado por usted ...");
    }

}

public class CuentaBancaria {
    String titular;
    TiposCuenta tipoCuenta;
    double saldo;
    final double COMISION = 1.2;

    CuentaBancaria(String t, TiposCuenta tipo, double s){
        this.titular = t;
        this.tipoCuenta = tipo;
        this.saldo = s;
    }

    CuentaBancaria(String t, double s){
        this(t, TiposCuenta.AHORRO, s);
    }

    void sacarDinero(double cantidad){
        if(cantidad <= 0){
            return;
        }
        saldo -= cantidad;

    }

    void ingresarDinero(double cantidad){
        if(cantidad <= 0){
            return;
        }
        saldo += cantidad;
    }

    void cambiarTipoCuenta(TiposCuenta tipoNuevo){
        tipoCuenta = tipoNuevo;
    }

    double obtenerSaldo(){
        return saldo;
    }

}


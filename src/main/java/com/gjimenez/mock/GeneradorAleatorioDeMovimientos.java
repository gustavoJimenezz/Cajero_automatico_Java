package com.gjimenez.mock;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorAleatorioDeMovimientos {

    //se puede usar un enum para las constantes
    private static final String TRANSFERENCIA = "Transferencia de ";
    private static final String INGRESO = "Ingreso de ";
    private static final String RETIRADA = "Retirada de ";
    private static final String PAGO_CON_TARJETA = "Pago con tarjeta de ";
    private static final String NOMINA = "Nomina de ";
    private static final String PAGO_RECIBO = "Pago recibo de ";

    public ArrayList<String> obtenerMovimiento(int numeroDeMovimientos, String moneda){
        ArrayList<String> movimientos = new ArrayList<>();
        for (int i = 0; i < numeroDeMovimientos; i++){
            int numeroDeMovimiento = obtenerIntAleatorio(1, 6);
            String tipoDeMovimiento;
            switch (numeroDeMovimiento){
                case 1:
                    tipoDeMovimiento = TRANSFERENCIA;
                    break;
                case 2:
                    tipoDeMovimiento = INGRESO;
                    break;
                case 3:
                    tipoDeMovimiento = RETIRADA;
                    break;
                case 4:
                    tipoDeMovimiento = PAGO_CON_TARJETA;
                    break;
                case 5:
                    tipoDeMovimiento = NOMINA;
                    break;
                default:
                    tipoDeMovimiento = PAGO_RECIBO;
                    break;
            }
            double cantidadAleatoria = obtenerDoubleAleatorio(1.0, 3000.0);
            String movimiento = tipoDeMovimiento + String.format("%.2f", cantidadAleatoria) + " " + moneda;
            movimientos.add(movimiento);
        }
        return movimientos;
    }

    private int obtenerIntAleatorio(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    private double obtenerDoubleAleatorio(double min, double max){
        return ThreadLocalRandom.current().nextDouble(min, max + 1.0);
    }
}



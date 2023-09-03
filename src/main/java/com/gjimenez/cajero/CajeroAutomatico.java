package com.gjimenez.cajero;

import com.gjimenez.banco.CuentaBancaria;
import com.gjimenez.mock.GeneradorAleatorioDeMovimientos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
    private CuentaBancaria cuentaBancariaActual;
    protected CajeroAutomatico(String identificador, String contra){
        double cantindadAleatoria = ThreadLocalRandom.current().nextDouble(0,1000);
        cuentaBancariaActual = new CuentaBancaria("Gustavo", cantindadAleatoria);
    }

    protected void mostrarSaldo(){
        DecimalFormat format = new DecimalFormat("#.00");
        String saldo = format.format(cuentaBancariaActual.obtenerSaldo());
        System.out.println("Saldo Actual : " + saldo);
    }

    protected void  ingresarDinero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("** INGRESAR DINERO **");
        System.out.println("Ingrese : ");
        double dineroIngresado = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(dineroIngresado);
    }

    protected void sacarDinero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("** SACAR DINERO **");
        System.out.println("Ingrese : ");
        double dineroIngresado = scanner.nextDouble();
        cuentaBancariaActual.sacarDinero(dineroIngresado);
    }

    protected void consultarUltimosMovimientos(){
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("Cuantos movimientos quiere consultar? : ");
        Scanner scanner = new Scanner(System.in);
        int cantMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimiento(cantMovimientos, "euros");
        mostrarMovimientos(movimientos);
    }
    private void mostrarMovimientos(ArrayList<String> movimientos){
        for (String mov:movimientos){
            System.out.println(mov);
        }
    }

    protected void salir(){
        System.out.println("Muchas gracias, hasta luego !");
    }
}

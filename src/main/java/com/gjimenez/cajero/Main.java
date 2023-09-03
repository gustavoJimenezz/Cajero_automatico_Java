package com.gjimenez.cajero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Identificacion : ");
        String indentificacion = scanner.nextLine();

        System.out.println("Ingrese Contraseña : ");
        String contra = scanner.nextLine();

        CajeroAutomatico cajero = new CajeroAutomatico(indentificacion, contra);

        int opcionSeleccionada;
        do {

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("** MENU PRINCIPAL **");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Ingresar dinero");
            System.out.println("3 - Sacar dinero");
            System.out.println("4 - Consultar ultimos movimientos");
            System.out.println("6 - salir");
            opcionSeleccionada = scanner.nextInt();

            switch (opcionSeleccionada){
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                    cajero.sacarDinero();
                    break;
                case 4:
                    cajero.consultarUltimosMovimientos();
                    break;
                default:
                    cajero.salir();
            }
        } while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3);
    }
}
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {
    CuentaBancaria cuentaBancariaActual;
    CajeroAutomatico(String identificador, String contra){
        double cantindadAleatoria = ThreadLocalRandom.current().nextDouble(0,1000);
        cuentaBancariaActual = new CuentaBancaria("Gustavo", cantindadAleatoria);
    }

    void mostrarSaldo(){
        System.out.println("Saldo Actual : " + cuentaBancariaActual.obtenerSaldo());
    }

    void  ingresarDinero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("** INGRESAR DINERO **");
        System.out.println("Ingrese : ");
        double dineroIngresado = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(dineroIngresado);
    }

    void  sacarDinero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("** SACAR DINERO **");
        System.out.println("Ingrese : ");
        double dineroIngresado = scanner.nextDouble();
        cuentaBancariaActual.sacarDinero(dineroIngresado);
    }

    void consultarUltimosMovimientos(){
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("Cuantos movimientos quiere consultar? : ");
        Scanner scanner = new Scanner(System.in);
        int cantMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimiento(cantMovimientos, "euros");
        mostrarMovimientos(movimientos);
    }
    void mostrarMovimientos(ArrayList<String> movimientos){
        for (String mov:movimientos){
            System.out.println(mov);
        }
    }

    void salir(){
        System.out.println("Muchas gracias, hasta luego !");
    }
}

# Cajero Automático en Java

## Descripción
Este proyecto simula un **Cajero Automático (ATM)** en Java, permitiendo al usuario:
- Consultar saldo
- Depositar dinero
- Retirar dinero
- Salir del programa

## Estructura del proyecto
│
├─ src/
│ └─ main/java/com/gjimenez/
│ ├─ Cuenta.java # Maneja la lógica de la cuenta
│ └─ CajeroAutomatico.java # Interfaz de usuario y flujo principal
│
└─ README.md # Este archivo

## Clases importantes

### 1. `Cuenta.java`
Representa la cuenta bancaria del usuario.

**Atributos:**
- `saldo`: saldo actual de la cuenta.

**Métodos:**
- `getSaldo()`
- `depositar(double monto)`
- `retirar(double monto)`

**Ejemplo de uso:**
```java
Cuenta cuenta = new Cuenta(1000);
cuenta.depositar(500);
cuenta.retirar(200);
System.out.println(cuenta.getSaldo());

--------------------------------------

### `Cuenta.java`
Representa la cuenta bancaria del usuario.

**Atributos:**
- `saldo`: saldo actual de la cuenta.

**Métodos:**
- `getSaldo()`: devuelve el saldo.
- `depositar(double monto)`: suma dinero al saldo si el monto es válido.
- `retirar(double monto)`: resta dinero del saldo si hay suficiente saldo.

**Ejemplo de uso:**
```java
Cuenta cuenta = new Cuenta(1000);
cuenta.depositar(500);
cuenta.retirar(200);
System.out.println(cuenta.getSaldo()); // Muestra el saldo

### CajeroAutomatico.java

switch (opcion) {
    case 1:
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        break;
    case 2:
        System.out.print("Ingrese monto a depositar: ");
        cuenta.depositar(scanner.nextDouble());
        break;
    case 3:
        System.out.print("Ingrese monto a retirar: ");
        cuenta.retirar(scanner.nextDouble());
        break;
    case 4:
        System.out.println("Gracias por usar el Cajero Automático.");
        scanner.close();
        return;
    default:
        System.out.println("Opción no válida.");
}

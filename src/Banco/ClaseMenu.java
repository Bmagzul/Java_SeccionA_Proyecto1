/*
 * Clase encargada de controlar las opciones del menu
 */
package Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class ClaseMenu {
    private ArrayList<CuentaBancaria> cuentas = new ArrayList();
    
    public void iniciar() {
        int opcion=0;
        
        do {
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("-------------------------------");
            System.out.println("-   Transacciones bancarias   -");
            System.out.println("-------------------------------");
            System.out.println("1. Crear cuenta bancaria");
            System.out.println("2. Realizar deposito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Informacion cuentas bancarias");
            System.out.println("5. Salir\n");

            System.out.print("Seleccion una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                    
                case 2:
                    deposito();
                    break;
                    
                case 3:
                    retiro();
                    break;
                    
                case 4:
                    informacionCuentas();
                    break;
                    
                case 5:
                    System.out.println("Gracias por utilizar la aplicacion. :)");
                    break;
                    
                default:
                    System.out.println("Ups!, La opcion no existe, vuelva a intentarlo");
                    break;
            }
            
            System.out.println("\n\n");
            
        } while (opcion != 5);
    }
    
    private void crearCuenta() {
        int cantidad, numero;
        String habiente, tipo;
        double saldo;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de cuentas a crear: ");
        cantidad = teclado.nextInt();
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\n  ----  Datos cuenta #" + i + "  ----  ");
            
            teclado = new Scanner(System.in);
            System.out.print("Ingrese el numero de cuenta: ");
            numero = teclado.nextInt();
            
            teclado = new Scanner(System.in);
            System.out.print("Ingrese el  nombre del titular de la cuenta: ");
            habiente = teclado.nextLine();
            
            teclado = new Scanner(System.in);
            System.out.print("Ingrese el tipo de cuenta (Ahorro, Monetaria): ");
            tipo = teclado.nextLine();
            
            teclado = new Scanner(System.in);
            System.out.print("Ingrese el saldo inicial de la cuenta: ");
            saldo = teclado.nextDouble();
            
            CuentaBancaria cuenta = new CuentaBancaria(numero, habiente, tipo, saldo);
            cuentas.add(cuenta);
        }
    }
    
    private void deposito() {
        int numero;
        double monto;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de cuenta: ");
        numero = teclado.nextInt();
        
        if (existeCuenta(numero)) {
            System.out.print("Ingrese el monto a depositar: ");
            monto = teclado.nextDouble();
            
            CuentaBancaria cuenta = getCuenta(numero);
            cuenta.deposito(monto);
        } else {
            System.out.println("No existe una cuenta con el numero ingresado");
        }   
    }
    
    private void retiro() {
        int numero;
        double monto;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de cuenta: ");
        numero = teclado.nextInt();
        
        if (existeCuenta(numero)) {
            System.out.print("Ingrese el monto a retirar: ");
            monto = teclado.nextDouble();
            
            CuentaBancaria cuenta = getCuenta(numero);
            cuenta.retiro(monto);
        } else {
            System.out.println("No existe una cuenta con el numero ingresado");
        }   
    }
    
    private void informacionCuentas() {
        if (cuentas.size() > 0) {
            for(int i = 0; i< cuentas.size(); i++) {
                System.out.println(cuentas.get(i).toString());
            }
        } else {
            System.out.println("No se encontraron cuentas.");
        }
    }
    
    private boolean existeCuenta(int numero) {
        CuentaBancaria item = getCuenta(numero);
        
        return item != null;
        
    }
    
    private CuentaBancaria getCuenta(int numero) {
        CuentaBancaria cuenta = null;
        
        if (cuentas.size() > 0) {
            for(int i = 0; i < cuentas.size(); i++) {
                CuentaBancaria tmp = cuentas.get(i);
                
                if (tmp.getNumeroCuenta() == numero) {
                    cuenta = tmp;
                    break;
                }
            }
        }
        
        return cuenta;
    }
}

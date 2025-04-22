package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;

    public static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    public CuentaBancaria(double saldo, Persona titular){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = generarNumeroCuenta();

        listaDeCuentasBancarias.add(this);
    }

    private int generarNumeroCuenta(){
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

        public double getSaldo() {
        return saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println(titular.getNombre() + " depósito exitoso de $" + monto + ". Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Monto inválido para depósito.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println(titular.getNombre() +" retiro exitoso de $" + monto + ". Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
    
    public void despliegaInformacion() {
        System.out.println("\n" + //
                        "");
        System.out.println("=== Información de la Cuenta ===");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("*******");
        System.out.println("Titular");
        titular.despliegaInformacion(); 
        System.out.println();
    }

    public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("=== Todas las cuentas registradas ===");
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
        }
    }
}

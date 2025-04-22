import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25);
        Persona persona2 = new Persona("Jose", 34);
        Persona persona3 = new Persona("Sofia", 40);

        CuentaBancaria cuenta1 = new CuentaBancaria(1000.0, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(500.0, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(2000.0, persona3);

        cuenta1.depositar(200);
        cuenta2.retirar(100);
        cuenta3.depositar(300);
        cuenta3.retirar(500);

        System.out.println("\n=== Saldo actual por cuenta ===");
        System.out.println("Cuenta de " + cuenta1.getTitular().getNombre() + ": $" + cuenta1.getSaldo());
        System.out.println("Cuenta de " + cuenta2.getTitular().getNombre() + ": $" + cuenta2.getSaldo());
        System.out.println("Cuenta de " + cuenta3.getTitular().getNombre() + ": $" + cuenta3.getSaldo());

        System.out.println("\n=== Información completa de todas las cuentas ===");
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
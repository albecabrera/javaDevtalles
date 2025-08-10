package proyectofinal;

import java.util.Scanner;

public class BankApp {
    private BankAccount account;
    private Scanner scanner;

    public BankApp(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    private void displayMenu(){
        System.out.println("\nSeleccionar opciones");
        System.out.println("1 - Depositar dinero");
        System.out.println("2 - Retirar dinero");
        System.out.println("3 - Mostrar saldo");
        System.out.println("4 - Salir");
    }
    private int getUserOption(){
        return scanner.nextInt();
    }
    private void handleDeposit(){
        System.out.println("Ingrese el monto a depositar");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
    }
}

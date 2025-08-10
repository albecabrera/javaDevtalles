package proyectofinal;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void doposit(double amount){
        if (amount>0){
            balance+= amount;
            System.out.println("Depósito exitoso!!!");
        }else {
            System.out.println("El monto ingresado no es correcto");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance-=amount;
            System.out.println("Extracción exitosa!!!");
        }else{
            System.out.println("Fondos insuficiente o monto inválido!!!");
        }
    }
    public void displayBalance(){
        System.out.println("Saldo: " + balance);
    }
}

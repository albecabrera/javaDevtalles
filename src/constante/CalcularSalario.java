package constante;
import java.util.Scanner; // Necesario para leer datos del teclado

public class CalcularSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ Pedimos el salario
        System.out.print("Introduce tu salario total: ");
        double salarioTotal = sc.nextDouble(); // Lee un número decimal

        // 2️⃣ Pedimos el porcentaje de descuento
        System.out.print("Introduce el porcentaje de descuento (por ejemplo, 10 para 10%): ");
        double porcentaje = sc.nextDouble();

        // 3️⃣ Convertimos el porcentaje a decimal dividiendo entre 100
        double salarioNetto = salarioTotal * (1 - porcentaje / 100);

        // 4️⃣ Mostramos el resultado
        System.out.println("Tu salario neto es: " + salarioNetto);

        sc.close(); // Cerramos el Scanner
    }
}

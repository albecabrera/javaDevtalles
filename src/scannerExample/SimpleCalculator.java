package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // La clase Scanner en Java se utiliza para leer datos de
    // entrada, generalmente desde el teclado (es decir, desde la consola).
        System.out.println("Ingrese el primer número");
    int firstNumber = sc.nextInt();

        System.out.println("Ingrese el segundo número");
    int secondNumber = sc.nextInt();
    int difference = firstNumber - secondNumber;

    int sum = firstNumber + secondNumber;
        System.out.println("La suma de a + b = " + (sum));
        System.out.println("La diferencia de a - b = " + (difference));

}
}



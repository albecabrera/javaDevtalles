package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // La clase Scanner en Java se utiliza para leer datos de
        // entrada, generalmente desde el teclado (es decir, desde la consola).

        int first = getNumber(scanner, "Ingrese el primer número");
        int second = getNumber(scanner, "Ingrese el segundo número");

        printArithmeticOperations(first, second);

        compareNumber(first, second);


    }
    public static int getNumber(Scanner scanner, String message) {
        System.out.println(message);
        int number = scanner.nextInt();
        return number;
    }

    public static void printArithmeticOperations(int firstNumber, int secondNumber){
        System.out.println("La suma de a + b = " + (firstNumber + secondNumber));
        System.out.println("La diferencia de a - b = " + (firstNumber - secondNumber));
    }
    public static void compareNumber(int first, int second){
        if (first > second) {
            System.out.println("El primer número es mayor");
        } else {
            System.out.println("El segundo número es mayor o igual");
        }
    }
}



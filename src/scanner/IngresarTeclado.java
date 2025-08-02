package scanner;

import java.util.Scanner;

public class IngresarTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creando una instancia de clase
        System.out.println("Ingrese el primer número: ");
        int a = sc.nextInt(); // Permite ingresar un número entero desde el teclado
        System.out.println("Imprimir a = " + a);
        System.out.println("Ingrese el segundo número: ");
        int b = sc.nextInt(); // Permite ingresar un número entero desde el teclado
        System.out.println("la suma de a+b = " + (a+b));


    }
}

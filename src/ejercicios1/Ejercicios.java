package ejercicios1;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        /*
        1. Usuario: Ingresa edad y 3 calificaciones de un estudiante.
        2. Calcular el promedio de las calificaciones.
        3. Evaluar si el estudiante aprobó o no.
        a. Criterio: average>=6
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la edad del estudiante: ");
        int age = sc.nextInt(); // Ingresa edad del estudiante

        System.out.println("Ingresa la primera calificación: ");
        int calificacion1 = sc.nextInt(); // Ingresa edad del estudiante
        System.out.println("Ingresa la segunda calificación: ");
        int calificacion2 = sc.nextInt(); // Ingresa edad del estudiante
        System.out.println("Ingresa la tercera calificación: ");
        int calificacion3 = sc.nextInt(); // Ingresa edad del estudiante

        double average = (calificacion1 + calificacion2 + calificacion3) / 3;
        System.out.println("El promedio de las calificaciones es = " + average);

        if (average<=4) {
            System.out.println("El estudiante aprobó");
        }else {
            System.out.println("El estudiante desaprobó");
        }

    }
}

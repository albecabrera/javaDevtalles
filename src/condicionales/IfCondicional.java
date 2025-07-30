package condicionales;

public class IfCondicional {
    public static void main(String[] args) {
        int age = 20;
        double average = 7.5;

        boolean isAdult = age >= 18;
        boolean hasPassingGrade = average > 7;

        if (isAdult && hasPassingGrade) {
            System.out.println("El estudiante cumple todos los requisitos");
        }

        if (isAdult) {
            System.out.println("Es adulto");
        }
    }
}
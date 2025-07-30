package bucles;

public class EjercicioGoodPractice {
    public static void main(String[] args) {
        final int MAX_COUNT = 5;
        for (int numeroRecurrente=2; numeroRecurrente<MAX_COUNT; numeroRecurrente+=2) {
            System.out.println(" Valor: " + numeroRecurrente); // Ejercicio para las
            // buenas practicas. Se deben de dar nombres que sean descriptivos
            // para de esta forma hacer más legible el código y para que los otros programadores
            // entiendan bien el código. 
        }
        System.out.println("Sale");

    }
}

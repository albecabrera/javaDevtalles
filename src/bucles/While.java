package bucles;

public class While {
    public static void main(String[] args) {
        for (int i=2; i<=5; i+=2) {
            System.out.println(" Valor: " + i); // Se muestran los valores del 0-4 pues
            // se incremento 1 y el 5 no se cuenta.
        }
        System.out.println("Sale");

        int counter=4;
        int acumulador=0; // El acumulador tiene un valor variable
        /*
        while (counter<5){
            System.out.println("Counter: " + counter);
            counter++;
            acumulador = acumulador+counter;
            System.out.println("Acumlador " + acumulador); */

            int counter2=0;
            do {
                System.out.println("Counter: " + counter2);
                counter2++;
            }while (counter2<5);
        }
    }


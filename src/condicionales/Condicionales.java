package condicionales;

public class Condicionales {
    public static void main(String[] args) {
        int age = 23;
        if (age> 18) {
            System.out.println("Mayor de edad");
        } else if (age>=0) {
            System.out.println("No es válido");
        }else {
            System.out.println("Es menor a 18");
        }
        int day = 35;
        switch (day) {
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miércoles");
                break;
            default:
                System.out.println("El dato ingresado no es válido");
        }
    }
}

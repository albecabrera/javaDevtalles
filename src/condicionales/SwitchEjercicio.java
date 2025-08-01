package condicionales;

public class SwitchEjercicio {
    public static void main(String[] args) {

        String color = "rojo";

        switch (color) {
            case "verde":
                System.out.println("Puedes pasar");
                break;
            case "naranja":
                System.out.println("Tienes que tener precaución");
                break;
            case "rojo":
                System.out.println("Tienes que frenar");
                break;
            default:
                System.out.println("El color no es válido");
        }

    }
}

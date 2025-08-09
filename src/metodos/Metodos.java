package metodos;

public class Metodos {
    public static void main(String[] args) {
        // Método length()
        String text = "Hola, mundo!";
        System.out.println("Longitud:" + text.length()); // 12

        // Método chartAt(int index)
        System.out.println("Carácter en la posición 2: " + text.charAt(2)); // l

        // Método substring( int beginIndex, int endIndex)
        System.out.println("Subcadena:" + text.substring(0, 4)); // Hola

        // Métodos  toUpperCase() y toLowerCase()
        System.out.println("Mayúsculas:" + text.toUpperCase()); // HOLA, MUNNDO!
        System.out.println("Minúsculas:" + text.toLowerCase()); // Hola, mundo!

        // Método equals(Object, obj)
        String texto1 = "Hola";
        String texto2 = "hola";
        System.out.println("¿Son iguales? " + texto1.equals(texto2)); // false

        // Método egualsIgnoreCase(String str)
        System.out.println("¿Son iguales (ignorando mayúsculas)? " + texto1.equalsIgnoreCase(texto2)); // true

        // Método contains(CharSequence, s)
        System.out.println("Contiene 'mundo'? " + text.contains("mundo")); // true

        // Método replace(char oldchar, char newchar)
        System.out.println("Reemplazodo: " + text.replace("o", "a")); // Hala, munda!

        // Método trimm
        String textWithSpaces = "   Hola, mundo!      ";
        System.out.println("Trimmed: " + textWithSpaces.trim()); // Hola, mundo!

        // Método split(String regex)
        String csvText = "Uno, Dos, Tres";
        String[] parts = csvText.split(",");
        String[] parts2 = {"Uno", "Dos", "Tres"};
        System.out.println("Dividio: ");

        for (String part: parts) {
            System.out.println(part);
            // Salida:
            // Uno
            // Dos
            // Tres
        }
    }

}

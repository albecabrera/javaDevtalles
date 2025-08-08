package strings;

import org.w3c.dom.ls.LSOutput;

public class ExampleString {
    public static void main(String[] args) {

        String name = "Alberto";  // Strings sin inmutables
        String name2 = "Alberto";
//        Se llama Pool String porque
//        Java no repite espacio en memoria, es decirr que Alberto prevalece.

        System.out.println(name==name2);

        System.out.println(name.toUpperCase());
        System.out.println(name);
        
    Person person = new Person("Alberto", "Cabrera");
        System.out.println(person.toString());
    }
        
}

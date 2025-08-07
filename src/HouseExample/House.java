package HouseExample;

public class House {
    // Atributos

    public House(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    } // Este método se llama sobre carga de constructores


    int doors;
    int windows;
    double size;


    // Métodos
    void openDoor() {
        System.out.println("La puerta está abierta");
    }

    double calculateArea() {
        return size * size;
    }

}

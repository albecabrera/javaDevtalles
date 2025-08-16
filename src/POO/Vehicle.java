package POO;

public class Vehicle {
   private String brand;
   private String model;
   private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    package POO;

    public class Main {
        public static void main(String[] args) {

        /*Vehicle vehicle = new Vehicle("Fiat", "Duna", 2000);
                vehicle.setYear(2020);

        System.out.println(vehicle.toString());*/

            Vehicle myCar = new Car("Toyota", "Corolla", 2024, 4);
            Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2021, false);

            myCar.start();
            motorcycle.start();

            printVehicle(motorcycle);
            printVehicle(myCar);

            ((Car)myCar).setDoors(5);
        }

        public static void printVehicle(Vehicle vehicle){
            System.out.println(vehicle.toString());

        }
    }

    public void stop(){
        System.out.println("El vehículo está parado");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();

        if (year<1886 || year>currentYear + 2){
            throw new IllegalArgumentException("Año inválido!!!");
        }

        this.year = year;
    }
    @Override // se denomina decorador
    public String toString() {
        return "Vehicle{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", year=" + year +
            '}';
    }
}


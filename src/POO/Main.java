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

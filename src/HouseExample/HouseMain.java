package HouseExample;

public class HouseMain {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.doors=2;
        myHouse.windows=4;
        myHouse.size=10;

        House myHouse2 = new House(4, 6, 20);

        System.out.println("La cantidad de puertas abiertas son = " + myHouse2.doors);
        myHouse2.openDoor();

        double area= myHouse2.calculateArea();
        System.out.println("El area de la casa es = " + area);



    }
}
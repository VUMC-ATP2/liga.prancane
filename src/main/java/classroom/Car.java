package classroom;

public class Car {
String brand;
String color;
int nobraukums;
int tank = 50;

public void printInformation (){
    System.out.println("Firma" + brand);
    System.out.println("Krāsa:" + color);
    System.out.println("Nobraukums:" + nobraukums);
    System.out.println("Bāka" + tank);
    }

public int fullTankPrice(){
    return tank * 2;


}

}

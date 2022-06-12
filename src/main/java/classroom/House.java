package classroom;

public class House {
    int houseNumber = 7;
    int bedrooms = 2;
    int year = 1998;

    public void printInformation () //metode
    {
        System.out.println("Mājas numurs: " + houseNumber);
        System.out.println("guļamistabas: " + bedrooms);
        System.out.println("Celšanas gads: " + year);
    }

    public boolean isHouseOld(){
        boolean isOld;
        if (year < 2000){
            System.out.println("veca maja");
            isOld = true;
        }
        else {
            System.out.println("jauna");
            isOld = false;
        }
        return isOld;

    }
}

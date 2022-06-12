package classroom;


public class Classes {
    public static void main(String[] args) {
        House myHouse = new House();
        //System.out.println(myHouse);
        myHouse.printInformation();
        myHouse.isHouseOld();

        System.out.println("----");

        //car bmw (nosaukums) = new Car();
       Cat myCat = new Cat();
       myCat.name = "Rudolfs";
       myCat.age = 7;
       myCat.color = "raibs";
       myCat.wherehelive = " privātmājā";
       myCat.owner = "Barnijs";

        myCat.printInformation();

        Car myCar = new Car();
        myCar.brand = "bmw";

        System.out.println("----");

        Fish myFish = new Fish();
        myFish.name = "Piko";
        myFish.fishSpecies = "Zelta zivtiņa";
        myFish.wherelives = "Akvārijā";

        myFish.printInformation();

//        Circle aplis = new Circle();
//        aplis.circleArea( 50));
//        System.out.println("");

    }
}

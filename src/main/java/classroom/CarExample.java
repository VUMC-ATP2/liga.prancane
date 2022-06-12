package classroom;

public class CarExample {


    public static void main(String[] args) {
        Cars bmw = new Cars();
        bmw.brand = "BMW";
        bmw.color = "black";
        System.out.println();

        Cars audi = new Cars();
        audi.fillHalfCarData("AUDI", "blue");
        System.out.println();
        // ja vajag saglabāt vērtību klases līmenī, tad izmanto this.brand
        //kam noder saglabāt klases līmenī?

        Cars toyota = new Cars();
        System.out.println(bmw.brand);
        System.out.println(bmw.color);

        Cars skoda =new Cars();
        System.out.println(skoda);



    }

}

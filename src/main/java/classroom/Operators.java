package classroom;

public class Operators {
    public static void main(String[] args) {
        //Equal to ==
        int a = 10;
        int b = 5;
        System.out.println(a == b); // false

        //not equal to !=
        int c = 5;
        int d = 4;
        System.out.println(c!=d); // true

        //les than <
        a = 30;
        b = 20;
        System.out.println(a < b); //false

        //Great than >
        c = 40;
        d = 50;
        System.out.println(c > d); //false

        boolean result = 40 < 20;
        System.out.println(result); // false
        //tagad šo mainigo result vares izmantot citur

        //Less than or equal to
        a = 100;
        b = 100;
        System.out.println(a <= b); // true

        //Greather than or equal to
        a = 200;
        b = 100;
        System.out.println(b >= a); //false
        
        //String comparison
        String name = "Saule";
        String name2 = "Saule";
        System.out.println(name == name2); //true
        // System.out.println(name == new String( original:"Saule")); //false
        // te varētu izmantot equals

        //Logic operators
        int x = 10;
        result = x < 5 && x <10;   // AND sakrīt abas puses
        // 10 < 5 false
        // 10 < 10 false
        System.out.println(result); //false

        result = 3 < 5 && 4 < 5;
        System.out.println(result);  //true

        result = 3 < 5 || 4 > 5;  // OR izpildās viens vai otrs
        System.out.println(result); //true

        a = 10;
        b = 20;
        result = (a > b);    //false
        result = !(a > b);  //true
        //izsaukuma zīme priekšā uztaisa inversu darbību

    }
}

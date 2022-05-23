package classroom;

public class Conditions {
    public static void main(String[] args) {

        //
        System.out.println("Before check");
        //while execute 10 line if condition is true
        if (20 > 18) {
            System.out.println("Yes, 20 > 18");
        }
        System.out.println("After check");
        // ja nosacījums nav pareizs, tad izdrukās tikai before un after komentāru

        //
        int age = 0;
        if (age >= 18) {
            System.out.println("You can vote!");
        }
        System.out.println("You can go home!");
        //ja vecums nav 18, tad drukā -> vari iet mājās, ja ir, tad - vari balsot

        //ie - else nosacījums
        int currentHours = 19;
        if (currentHours < 18) {
            System.out.println("Good day!"); //Labdien
        } else {
            System.out.println("Good evening!"); //Labvakar
        }

        //
        int i =20;
        if (i < 15){
            System.out.println("i is smaller than 15");
        } else {
            System.out.println("i is greater than 15");
        }
        System.out.println("Outside if-else block");

        //
        String vumc = "LU";
        if (vumc == "LU"){ //true
            System.out.println("VUMC is the same as LU");
        } else {
            System.out.println("VUMC is not the same as LU");
        }

        // if - else - if
        //ja te ir true, tad neiet talak pa soliem. apstājas pie pirmā true. ja nav true, tad drukā to, kas ir else.
        int number = 2;
        if (number > 0) {
            System.out.println("Number ir greater than 0");
        } else if (number == 0) {
            System.out.println("Number is equal to 0");
        } else {
            System.out.println("Number is less than 2 and not equal to 0");
        }

        //int - primitive type
        // Integer - non -primitive
        System.out.println("Integer MAX: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN:" + Integer.MIN_VALUE);
        ////////

        /// Switch:
        String animal = "Cat";
        switch (animal){
            case "Dog":
                System.out.println("You have a dog!");
                break;
            case "Cat":
                System.out.println("You have a cat!");
                break;
            default:
                System.out.println("I don't know about animal you have!" + animal);        }
        // jāliek break, lai pabeigtos switch;

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("Wednesday!");
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            case 6:
                System.out.println("Saturtday!");
                break;
            case 7:
                System.out.println("Sunday!");
                break;
            default:
                System.out.println("Not correct day of the week!");
        }

        //vēl viens variants, kā smukāk pierakstīt
//        String month = "June";
//        //var - data type, JAVA pati noteiks, kāds būs datatips?
//       var result :String = switch (month){
//           case "Dec", "Jan", "Feb" -> "winter";
//           case "June", "Jul", "Aug" -> "summer";
//            default -> "Don't know";
//       };
//        System.out.println("%s this is %s, month, result");

    }
}

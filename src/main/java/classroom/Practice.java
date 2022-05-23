package classroom;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
       //Uzrakstit progr., kas ...

       Scanner scanner = new Scanner(System.in);
/*        System.out.println("Please write a number:");
        int inputResult = scanner.nextInt(); //saglaba mainigo

        if (inputResult > 0) {
            System.out.println("Number ir > 0 which is: " + inputResult);
        }

        //Paprasa lietotaja vecumu, izvada uz ekrana. ja vecums >= 18, tad var piedalīties , ja mazāks, tad nevar
        System.out.println("Please write your age:");
        int age = scanner2.nextInt();
        if (age >= 18) {
            System.out.println("Yes, you can vote");
        } else {
            System.out.println("You can't vote");
      }
*/
    //if - else vai switch
/*      System.out.println("Please write a number:");
        int inputResult = scanner.nextInt();//saglaba mainigo
        switch (inputResult) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Darba diena");
                break;
            case 6:
            case 7:
                System.out.println("Brivdiena!");
                break;
            default:
                System.out.println("Incorrect day of the week!");
        }

        /// Ievada skaitli, programma nosaka un izvada vai ir pāra/nepāra skaitlis
*/
        System.out.println("Please write a number:");
        int inputResult = scanner.nextInt();//saglaba mainigo
       if (inputResult <= 0) {
           System.out.println("ievadiet pozitivus skaitlus");
       } else if (inputResult % 2 == 0) {
           System.out.println("pāra skaitlis");
       } else {
            System.out.println("nepara skaitlis");
       }




    }
}

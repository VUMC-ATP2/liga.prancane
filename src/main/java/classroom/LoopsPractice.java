package classroom;

import java.util.Arrays;

public class LoopsPractice {
    public static void main(String[] args) {
        // cikli.
        // izprintet ciparus 0-4

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++; // 0+1 ; true, izprinte 1 un tad talak jau seko 1+1 un parbauda nosacijumu; tad izdruka 2 un talak 2 + 1
            // vai i = i + 1;
        }
        //lai neaiziet muuziigaa ciklā, jo 0 ir mazāka par 5. tapec pieliek i++

        int a = 10;
        while (a >= 1) {
            System.out.println(i);
            a--; // sis ies uz leju, preteja virziena
        }

        //

        int[] arr = {2, 11, 45, 9};
        int number = 0;
        while (number < 4) {    // vai (number < arr.lenght)
            System.out.println(arr[number]); // arr [0]
            number++; // 0 + 1; ta atkarto ciklu
        }

        // so var uzrakstit ari:
        int[] arr2 = {2, 11, 45, 9};
        while (i < 4) {
            System.out.println(arr2[i]);
            i++;
        }

        // izdrukat para skaitlus  0 - 10; i % 2
        int[] arr3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        while (i % 2 == 0) {
            System.out.println(arr3[i]);
            i = i + 1;
        }
        // te nebija kaut kas pareizi

        number = 1;
        System.out.println("While Start");
        while (number < 10) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
        System.out.println("While END");

        // 0 - 5
        int age = 18;
        do {
            System.out.println(age + ",");
            age++;
        } while (age <= 65);

        // para skaitli:
        number = 1;
        do {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 10);

        //// for. kamer nosacijums ir true, cikls izpildisies:
        for (int x = 0; x < 10; x++) {
            System.out.print(x + ",");
        }
        System.out.println("");

        System.out.println("nakamais uzdevums. para skaitli no 20->0");

        //// izprintet 20 -> 0. no lielaka uz mazako, tapec sak ar 20 un turpina ar nosacijumu, kamer x bus 0
        for (int x = 20; x >= 0; x--) {
            if (x % 2 == 0) {
                System.out.print(x + ",");
            }
        }
        System.out.println("");

        System.out.println("nakamais uzdevums");

//        // for. pirmais vienmer ir skaits?
      String[] countries = new String[]{"LV", "CAN", "USA", "EST"};
//        for (int j = 0; j <= countries.length; j++) {
//            System.out.println(countries[j]);
//        }

        // for each
        for(String country: countries) {
            System.out.println(country);
        }

        //izveidot masivu, kas satur  0 - 100, izdrukat ciparus > 50

        int[] numArry = new int [101];  //tukss masiivs ar 100 cipariem
        for (int d = 0; d < numArry.length; d++) { // izveidojam ciklu, lai tuksas vietas aizpilditu ar cipariem
            numArry[d] = d;
        }
       // System.out.println(Arrays.toString(numArry));
        for (int d = 0; d < numArry.length; d++) {
            if (numArry[d]>=50 ){
                System.out.println(numArry[d]);
            }
        }
//        // Sadi var izmantot for each;
//        for (int j : numArry) {
//            if (j >= 50) {
//                System.out.println(j);
//            }
//        }

        //Zarošanas izteiksmes: break un continue
        System.out.println("nakamais uzdevums");

        for (int j = 0; j < countries.length; j++) {
            if (countries[j].equals("LV")){
                System.out.println("Atradu isto! Partrauc meklet");
                break;
            }
        }

        for (int j = 0; j < 10; j++) {
            if (j > 4 && j < 9) {
                continue;
            }
            System.out.println(j); // izdruka tikai tos, kuri neatbilst nosacijumam.
        }
            // tad, kad atrod to, kas der, cipars 5 izpilda abus nosacijumus, tad tas izpilda nosacijumu, kas ir if norade
            // tas ir continue, viņs nedrukā.
            // kad nosacijums atgriez false, tad iet talak uz drukasanu



    }
}

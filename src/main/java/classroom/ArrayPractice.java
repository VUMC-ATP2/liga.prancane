package classroom;

import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {

        //tema masivi. katram datatipam var izveidot masiivu.

        int[]dayOfTheWeek = {1,2,3,4,5,6,7};  //deklarets jauns masivs un noraditas vertibas
        System.out.println(dayOfTheWeek.length);  //izdruka masiva izmeru: lenght = 7

       // dayOfTheWeek[7];
       // System.out.println(dayOfTheWeek[7]);
        //sis atgriezis kludu, jo [0]=1 1 definets zem 0 indeksa, [1]=2 .. [6] = 7, tapec pareizak ir
        System.out.println(dayOfTheWeek[6]); // vai arī [6-1]

        String[]nameOfTheWeek = {"Monday", "Tue", "Wed",  "Thur", "Fri", "Satur", "Sun"};
       // System.out.println("Today is: "nameOfTheWeek[0]);

        String[]fruits =  new String[6];
        fruits[0] = "apple";
        fruits[1] = "kiwi";
        fruits[2] = "banana";
        fruits[3] = "strawberry";
        fruits[4] = "cherry";
        fruits[5] = "pineapple";

        fruits[0] = "pear";

        char[] myNameCharacters = {'L', 'I', 'G', 'A'};
        System.out.printf("%s %s \n ", myNameCharacters[0], myNameCharacters[1]);

        Random random = new Random();
       // System.out.println(random.nextInt(bound:100)); //te kaut kas trukst



    }
}

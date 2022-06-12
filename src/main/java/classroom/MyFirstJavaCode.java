package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {

        //one line comment
        /*
        multi line comment
        test test and test
        and test test test
         */
        //ctrl+p parāda komandas
        //veidojam jaunu mainigo, byte data type
        byte floorCount = 5;
        System.out.println("My house has "+floorCount +" floors");
        System.out.printf("My house has %d floors\n", floorCount);
        //%d - priekš numbers
        //%s - priekš text/string
        //%b - priekš boolean
        //%f - kas tas bija? float
        // \n pārnes uz jaunu rindu

        short salaryInEur = 1000;
        System.out.println ("salaryInEur");
        System.out.println ("1200");

        System.out.printf("Average salary for Juniora QA is: %d\n", salaryInEur);

        int chinaPopulation = 1445459;
        long currentWorldPopulation = 1587456523;
        System.out.printf("current world population: %d. In ... Chine is: %d people \n", currentWorldPopulation, chinaPopulation);

        //floating numbers
        float myCurrentWeight = 72.4f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.8325d;
        System.out.println(gasPriceInEur);

        //primitive text (char)
        char firstLettersOfMyName = 'L';

        //non-primitive String
        String myName = "Liga";
        System.out.println(myName);

        String mySentence = "hello, hello";
        String mySecondSentence = "hi hi hi";
        System.out.println(mySentence);
        System.out.println(mySentence + mySecondSentence);
        System.out.println(mySentence + "" + mySecondSentence);
        System.out.printf("%s %s\n", mySentence, mySecondSentence);

        //boolen
        //vienmer saksies ar jautajumu is / has
        //isSummer, hasItems

        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);

    }
}

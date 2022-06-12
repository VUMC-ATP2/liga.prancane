package homework;

public class FirstClass {
    public static void main(String[] args) {
        //Izveleta valsts Gruzija
        String countryName = "Georgia";
        float population = 3.7f; //3729635
        int area = 69700;
        String capital = "Tbilisi";
        String officialLanguage = "Georgian language";
        boolean isMemberOfEs = false;
        char currency = 'ლ';

        System.out.printf("One of my favourite travel destination is %s. \n", countryName);
        System.out.printf("Georgia covers an area of %d km^2 and has a population of %.1f million people. \n", area, population );
        System.out.println("Capital and largest city: " + capital);
        System.out.println("Official language: " + officialLanguage);
        System.out.println("Currency: Georgian lari ("+ currency + ") (GEL)");
        System.out.println("Is Georgia a member of EU? No, it's "+ isMemberOfEs + " information.");
        System.out.println();
        String factOne = "Georgia is a country of unique culture and rich history, which can be traced to classical antiquity and even earlier.";
        String factTwo = "Georgia is generally considered the 'cradle of wine', as archaeologists have traced the world's first known wine creation back to the people of the South Caucasus in 6,000BC";
        String factThree = "Georgians love to host a guest!";
        String factFour = "There are 12 different climate zones.";
        System.out.println("Some facts about Georgia:");
        System.out.println(factOne);
        System.out.println(factTwo);
        System.out.println(factThree);
        System.out.println(factFour);
        System.out.println();
        System.out.println("----------");
        System.out.println("Aritmetiskie operatori:");
        // Dazadas darbibas un pieraksti ar aritmetiskajiem operatoriem:
        // +
        int a = 52;
        int b = -4;
        int c = a + b;
        int d = c + 4;
        int e = (8 - b) + 3;
        int f = 37;
        int g = b - f;
        int x = 12;
        int y = 21;
        int z = 3;
        int m = x * y;
        System.out.println("a = 52");
        System.out.println("b = -4");
        System.out.println("c = a + b");
        System.out.println("d = c + 4");
        System.out.println();
        System.out.println("c = " + a + b + " => c = " + c);
        System.out.printf("if c = %d => d = %d + 4 \n", c, c);
        System.out.println("d = " + d);
        System.out.println(d);
        System.out.println(20 + 82);
        System.out.println();
        // -
        System.out.printf("b = %d \n", b);
        System.out.printf("f = %d \n", f);
        System.out.println("g = b - f");
        System.out.printf("g = %d - %d \n", b, f);
        System.out.println("g = " + g);
        System.out.println(84 - (- 43));
        System.out.println("a - c + 2 = " + (a-c+2));
        System.out.println();
        // *, /
        System.out.println("m = x * y => m = " + (x * y));
        System.out.println("n = m / 4 => " + (m / 4));
        System.out.println("x * y * z = " + (x * y * z));
        System.out.println(m * 0.01);
        System.out.println("(a * z) / x = " + (a*z/x) );
        System.out.println(y / z);
    }
}

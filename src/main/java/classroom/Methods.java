package classroom;

public class Methods {
    public static void main(String[] args) {
        checkAge(21);
    }
        public static void checkAge(int age) {
            if (age < 0) {
                System.out.println("Viss slikti?");
            } else if (age >= 14 && age <= 16) {
                System.out.println("Japaciesas!");
            } else if (age > 18) {
                System.out.println("viss kuul!");
            }
        }

    }

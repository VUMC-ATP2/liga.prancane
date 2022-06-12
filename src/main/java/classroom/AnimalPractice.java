package classroom;

public class AnimalPractice {
    public static void main(String[] args) {
        Animal justRegularAnimal = new Animal();
        justRegularAnimal.name= "Nezinams";
        justRegularAnimal.voice();

        Dog rex = new Dog();
        rex.canProtectHouse = true;
        rex.voice(); // paņem no Dog


    }
}

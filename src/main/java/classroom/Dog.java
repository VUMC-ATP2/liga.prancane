package classroom;

public class Dog extends Animal {
    //Dog var dabūt visas īpašības, kas pieder klasei Animals
    boolean canProtectHouse = true;

    @Override // šo pieliekam, lai sunim neprintētu Hello, bet, lai būtu vau vaur
    void voice() {
     //   super.voice(); šis norāda uz Animal klasi
        System.out.println("vau, vau, vau!");
    }
}

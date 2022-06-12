package classroom;

public class Cars {
    int doorCount;
    int tyres = 4;
    int productionYear;
    int milleage;
    String color;
    String brand;



    // public void fillCarData(int doorCount, int productionYear, int milleage, String color, String brand)
    public void fillHalfCarData (String carBrand, String carColor) {
        //vajag savienot klases mainigos ar datiem, kurus aizpilda?
        brand = carBrand; // to, ko norādīs te, ierakstīs sadaļā brand
        color = carColor;
        System.out.println("Information updated");
    }

        public Cars() {
        System.out.println("objekts ir izveidots!");
        }


        public Cars(String color, String brand) {
            this.color = color;
            this.brand = brand;
        }
}

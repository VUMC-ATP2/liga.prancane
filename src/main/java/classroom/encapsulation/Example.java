package classroom.encapsulation;

public class Example {
    public static void main(String[] args) {

        //veidojam jaunu studentu
       Student liga = new Student("liga.pranc");
       System.out.println(liga.getMail());

       liga.setMail("prancane@lu.lv"); // te e-pasta adresi maina caur metodi
       //liga.mail = "prancane@lu.lv" dara to pasu, ko  augseja rindina, bet ne tik smuks variants
       liga.setName("Liga");
       liga.setLastname("Prancane");
       liga.setHasMood(true);
       System.out.println(liga);


        Student zana = new Student("");
        System.out.println("Zana email ir:" + zana.getMail());
        zana.setMail("zana@lu.lv");
        System.out.println("Zana email:" + zana.getMail());
        zana.setMail("zanna2@lu.lv");

        /// klases uzdevums:
        zana.setGraduationYear(2023);
        System.out.println(zana.graduationYear); //sis atgriezis 0
        zana.setGraduationYear(2020);
        System.out.println(zana.getGraduationYear());
        zana.setGraduationYear(2015);
        System.out.println("Izlaiduma gads ir: " + zana.getGraduationYear());



    }
}

/*
objektus veido atsevišķi, bet ar objektiem darbojas citā klasē, kur ir definēta main metode
Veidojam jaunu studentu
 */



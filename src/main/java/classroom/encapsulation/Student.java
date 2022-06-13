package classroom.encapsulation;

import lombok.*;

@ToString(callSuper = true)  // ja nebus parametrs super, tad nebus aizpildits ar personu datiem, tikai lauki. ja ir aizpildīts, tad būs dati gan no person, gan student
//Student ir apakšklase Person, tāpēc šeit liek šo super, ... ?
@NoArgsConstructor  //lauj veidot tuksu konstruktoru
//@AllArgsConstructor // konstruktors, kura ir visi mainigie? generejot jaunu konstruktoru?

public class Student extends Person {
    @Getter
    public int graduationYear;
    //   private String mailDomain = "@lu.lv";
    private final String MAIL_DOMAIN = "@lu.lv";  // final neiet konstruktora
    @Getter
    private String mail;


    public Student(String accountName) {
        mail = accountName + MAIL_DOMAIN;
        //pievienojot studentu, prasisim acountname, pec ka mes tad izveidosim e-pastu
    }
// so izmantojam, jo mums mail ir private. privato izmanto, lai nemainitu vertibas

//    public String getMail() {
//        return mail;
//    }

    public void setMail(String mail) {
        if (this.mail.equals("@lu.lv")) {
            this.mail = mail;
        } else {
            System.out.printf("Tavs e-pasts ir %s un netiks mainits \n ", this.mail);
        }
    }
        // this.mail = mail;  parrakstam to e-pastu, kuru padod
        // Create getter / setter for graduationYear
        // if graduationYear is > 2022, then print message that Value cannot be set!


//        public int getGraduationYear() {    // jo uzliku augšā Getteri
//            return graduationYear;
//        }

        public void setGraduationYear(int graduationYear) {
            if(graduationYear > 2022) {
                System.out.println("This value can not be set");
            } else {
                this.graduationYear = graduationYear ;// klases mainigais tiek aizvietots ar ierakstito mainigo no metodes. klases mainigajam jalieto THIS
            }
        }


}


package classroom.encapsulation;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter // anotacijas
@Setter // anotacijas
@ToString (exclude = {"lastname","name"})

public class Person {

    protected String name = "John";
    protected String lastname = "Deer";
    private boolean hasMood;
    // Class, Package, SubClass
}

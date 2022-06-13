package classroom.Exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
// @AllArgsConstructor - var arī ielikt šo, lai nebūtu vel viens konstruktors
public class Author {
    public String name;
    @Setter
    public String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

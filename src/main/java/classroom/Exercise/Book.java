package classroom.Exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString

public class Book {
    @Getter
    protected String isbn;
    @Getter
    protected String name;
    @Getter @Setter
    protected double price;
    @Getter @Setter
    protected int quantity;
    Author author;

    public String getAuthor (){
        return author.getName();
    }
    //atgriez vardu no author


    public Book(String isbn, String name, int quantity, Author author) {
        this.isbn = isbn;
        this.name = name;
        this.quantity = quantity;
        this.author = author;
    }

    // test test test


}

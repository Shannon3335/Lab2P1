package ie.atu.lab2p1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor

public class Book {
    @Getter @Setter private String title;
    @Getter @Setter private String author;
    @Getter @Setter private int isbn;
    @Getter @Setter private int publishedYear;

}

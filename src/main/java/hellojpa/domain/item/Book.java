package hellojpa.domain.item;

import javax.persistence.Entity;

@Entity
public class Book extends Item{
    private String author;
    private Long isbn;
}

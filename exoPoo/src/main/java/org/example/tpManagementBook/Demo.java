package org.example.tpManagementBook;

import java.math.BigDecimal;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Author author1=new Author( "Jon", "Johnson");
        Book[] books=new Book[] {
                new Book( "Book_1", new Author[] { author1 }, new Publisher("Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.Broché),
                new Book( "Book_2", new Author[] { author1, new Author(
                        "William", "Wilson") }, new Publisher( "Publisher_2 "), 2000, 120,
                        BigDecimal.valueOf(14.99), CoverType.Broché),
                new Book( "Livre_3", new Author[] { new Author( "Walter", "Peterson") }, new
        Publisher( "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99),
                CoverType.Relié),
        new Book(  "Book_4", new Author[] { new Author( "Craig", "Gregory") }, new
        Publisher( "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.Broché)
        };

        BookService bookService=new BookService();

        Book[] tab=bookService.filterBooksByAuthor(author1,books);
        System.out.println(Arrays.toString(tab));
    }
}

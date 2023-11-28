package org.example.tpBibliotheque;

public class Demo {
    public static void main(String[] args) {
        Library library=new Library();
        PaperBook paperBook=new PaperBook("Test","toto",250,"Maison test");
        library.addBook(paperBook);
        Person person=new Person("Aurelien","Boets");
        library.borrowBook(1,person);
        library.displayLoans();
    }
}

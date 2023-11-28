package org.example.tpBibliotheque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IHM {
    private static Scanner sc=new Scanner(System.in);
    private static Library library=new Library();

    static void start(){
        int choice = 0;
        do {
            System.out.print(menu());
            choice=sc.nextInt();
            switch (choice){
                case 1->createBook();
                case 2->removeBook();
                case 3->filterByTitle();
                case 4->filterByAuthor();
                case 5->borrow();
                case 6->returnBook();
            }
        }while(choice!=0);

    }

    private static String menu(){
        return """
                1.Ajouter livre
                2.Supprimez un livre
                3.Filtrer par titre
                4.Filtrer par Auteur
                5.Emprunt
                6.Retour
                0.Quittez
                """;
    }

    private static void createBook(){
        System.out.println("Indiquez le titre du livre");
        sc.nextLine();
        String title=sc.nextLine();
        System.out.println("Indiquez l'auteur");
        String author=sc.nextLine();
        System.out.println("Quelle est le format du livre");
        int choiceFormat=0;
        do {
            System.out.print("""
                1.Numérique
                2.Papier
                """);
            choiceFormat=sc.nextInt();
        }while(choiceFormat!=1 && choiceFormat!=2);
        if(choiceFormat==1){
            System.out.println("Indiquez le format du livre");
            sc.nextLine();
            String format=sc.nextLine();
            System.out.println("Indiquez la taille du livre en octet");
            double size=sc.nextDouble();
            NumericBook numericBook=new NumericBook(title,author,format,size);
            library.addBook(numericBook);

        }else{
            System.out.println("Indiquez la maison d'edition");
            sc.nextLine();
            String edition=sc.nextLine();
            System.out.println("Indiquez le nombre de page");
            int amountOfPages=sc.nextInt();
            PaperBook paperBook=new PaperBook(title,author,amountOfPages,edition);
            library.addBook(paperBook);

        }
    }

    private static void displayBooks(){
        List<Book> books=library.getBooks();
        for (Book book:books) {
            System.out.println(book);
        }
    }

    private static void removeBook(){
        displayBooks();
        System.out.println("Tapez l'identifiant du livre que vous voulez supprimer");
        int choice=sc.nextInt();
        library.deleteBook(choice);
    }

    private static void filterByTitle(){
        System.out.println("Tapez le titre que vous rechercher");
        sc.nextLine();
        String title=sc.nextLine().trim();
        List<Book> filterLibrary=library.searchByTitle(title);
        if(filterLibrary.isEmpty()){
            System.out.println("Aucun livre ne possède ce titre dans la bibliothèque");
        }else{
            for (Book book:filterLibrary) {
                System.out.println(book);
            }
        }
    }

    private static void filterByAuthor(){
        System.out.println("Tapez l'auteur que vous rechercher");
        sc.nextLine();
        String author=sc.nextLine().trim();
        List<Book> filterLibrary=library.searchByAuthor(author);
        if(filterLibrary.isEmpty()){
            System.out.println("Aucun livre ne possède cette auteur dans la bibliothèque");
        }else{
            for (Book book:filterLibrary) {
                System.out.println(book);
            }
        }
    }

    private static void borrow(){
        displayBooks();
        System.out.println("Tapez l'identifiant du livre que la personne souhaite emprunté");
        long id= sc.nextLong();
        System.out.println("Tapez le nom de la personne qui souhaite l'emprunter");
        sc.nextLine();
        String lastName=sc.nextLine();
        System.out.println("Tapez le prénom");
        String firstName=sc.nextLine();
        Person person=new Person(firstName,lastName);
        library.borrowBook(id,person);
    }

    private static void returnBook(){
        displayBooks();
        System.out.println("Tapez l'identifiant du livre retourné");
        long id=sc.nextLong();
        library.returnBook(id);
    }
}

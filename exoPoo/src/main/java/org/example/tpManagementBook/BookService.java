package org.example.tpManagementBook;




public class BookService {
    public Book[] filterBooksByAuthor(Author author,Book[] books){
        int length=0;
        for (Book i:
             books) {
            for (Author j: i.getAuthors()
                 ) {
                if(j.equals(author)){
                    length++;
                }
            }
        }
        Book[] filterBooks=new Book[length];
        for (Book i:
                books) {
            for (Author j: i.getAuthors()
            ) {
                if(j.equals(author)){
                    filterBooks[--length]=i;
                }
            }
        }
        return filterBooks;
    }

    public Book[] filterBooksByPublisher(Publisher publisher,Book[] books){
        int length=0;
        for (Book i:
                books) {
            if(i.getPublisher().equals(publisher)) length++;

        }
        Book[] filterBooks=new Book[length];
        length=0;
        for (Book i:
                books) {
            if(i.getPublisher().equals(publisher))filterBooks[length++]=i;
            }

        return filterBooks;
    }

    public Book[] filterBookByYear(int year,Book[] books){
        int length=0;
        for (Book i:
             books) {
            if(i.getPublishingYear()>=year){
                length++;
            }
        }
        Book[] filterBooks=new Book[length];
        length=0;
        for (Book i:
                books) {
            if(i.getPublishingYear()>=year){
                filterBooks[length++]=i;
            }
        }
        return filterBooks;
    }
}

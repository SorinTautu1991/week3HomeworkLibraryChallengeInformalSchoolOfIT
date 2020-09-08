package com.tse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Book> books = new ArrayList<>();


    public static void main(String[] args) {
        Main library = new Main();
        Book book1 = new Novel("Dostoievsky", 290, "Drama");
        Book book2 = new Album("Planet Earth", 560, "hard paper");
        library.addBook(book1);
        library.addBook(book2);
        library.listBooks();

    }



    public boolean addBook(Book book){
        books.add(book);
        return true;
    }

    public boolean deleteBook(String name){
        for(Book book: books){
            if(book.getName().equals(name)){
                books.remove(book);
                return true;
            }
        }
        System.out.println("You don`t have this book in your library.");
        return false;
    }

    public void listBooks(){
        for(Book book:books){
            if(book instanceof Novel){
                System.out.println("Book name: " + book.getName() + " nr. pages: " + book.getNumberOfPages() + " type: " + ((Novel) book).getType());
            } else if(book instanceof Album){
                System.out.println("Book name: " + book.getName() + " nr. pages: " + book.getNumberOfPages() + " paper quality: " + ((Album) book).getPaperQuality());
            }
        }
    }


}

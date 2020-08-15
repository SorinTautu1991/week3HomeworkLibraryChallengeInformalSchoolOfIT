package com.tse;



import java.util.ArrayList;

public class Book {
    private String name;
    private int nrPages;
    private ArrayList<Book> bookList;


    public Book(String name, int nrPages) {
        this.name = name;
        this.nrPages = nrPages;
        this.bookList = new ArrayList<Book>();


    }

    public void addBook(Novel novel){
        bookList.add(novel);
        System.out.println("You added a novel.");
    }


    public void addBook(Album album){
        bookList.add(album);
        System.out.println("You added an album.");
    }

    public void removeBook(Book book){
        bookList.remove(book);
        System.out.println("You removed a book.");
    }


    public Book findIndexremoveBook(String name) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getName().equalsIgnoreCase(name)) {
                return bookList.get(i);
            } else {
                System.out.println("Book not in library or title is worng.");
                return null;
            }
        }
        return null;
    }


    public void printBooks(){
        if(bookList.size() == 0){
            System.out.println("Your library is empty.");
        }
        for(int i=0;i<bookList.size();i++){

            if(bookList.get(i).getClass().getSimpleName().equals("Novel")){

                System.out.println("The "+ (i+1)+ " book is a <<Novel>> called <<" + bookList.get(i).getName() +
                        ">> it has <<" + bookList.get(i).getNrPages() + " pages>> and has the type <<" + returnTypeNovel((Novel)bookList.get(i)) + ">>");
            } else if(bookList.get(i).getClass().getSimpleName().equals("Album")){

                System.out.println("The " + (i+1) + " book is an <<Album>> called <<" + bookList.get(i).getName() +
                        ">> it has <<" + bookList.get(i).getNrPages() + " pages>> and it has a <<" +returnPaperAlbum((Album)bookList.get(i)) +  ">> paper quality");
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getNrPages() {
        return nrPages;
    }

    public String returnTypeNovel(Novel novel){
        return novel.getType();
    }
    public String returnPaperAlbum(Album album){
        return album.getPaperQ();
    }


    public ArrayList<Book> getBookList() {
        return bookList;
    }
}

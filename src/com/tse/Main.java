package com.tse;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        main.libraryMenu();


    }

    public void libraryMenu(){
        Book books = new Book("Test", 0);


        boolean quit = false;
        while(!quit){
            System.out.println("----------------------------------------------------------------------\n" +
                    "Welcome to the library. Please select the actions you want to perform: \n" +
                    "1. Add book ->> Novel \n" +
                    "2. Add book ->> Album \n" +
                    "3. Remove book \n" +
                    "4. Print books \n" +
                    "5. Quit the application \n");

            int input = scanner.nextInt();
            switch(input){
                case 1:
                    System.out.println("Please enter the name of the novel you want to add: ");
                    scanner.nextLine();
                    String nameNovel = scanner.nextLine();
                    System.out.println("Please enter the number of pages the novel has: ");
                    int numberPagesNovel = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the type of the novel: ");
                    String typeNovel = scanner.nextLine();
                    Novel newNovel = new Novel(nameNovel, numberPagesNovel, typeNovel);
                    books.addBook(newNovel);
                    break;
                case 2: System.out.println("Please enter the name of the album you want to add: ");
                    scanner.nextLine();
                    String nameAlbum = scanner.nextLine();
                    System.out.println("Please enter the number of pages the album has: ");
                    int numberPagesAlbum = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the paper quality of the album: ");
                    String paperQuality = scanner.nextLine();
                    Album newAlbum = new Album(nameAlbum,numberPagesAlbum, paperQuality);
                    books.addBook(newAlbum);
                    break;
                case 3:
                    System.out.println("Please enter the name of the book you want to remove: ");
                    scanner.nextLine();
                    String nameBook = scanner.nextLine();
                    books.removeBook(books.findIndexremoveBook(nameBook));

                    break;
                case 4: books.printBooks();
                    break;
                case 5:
                    System.out.println("You quitted the application. Have a nice day !");
                    quit = true;

            }
        }
    }
}

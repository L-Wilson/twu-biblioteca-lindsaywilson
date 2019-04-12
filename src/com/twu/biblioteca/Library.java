package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> inventory;

    public Library() {
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("John Steinbeck", "The Grapes of Wrath", "1939"));
        listOfBooks.add(new Book("Herman Melville", "Moby Dick", "1851"));
        listOfBooks.add(new Book("George Orwell", "Animal Farm", "1945"));
        this.inventory = listOfBooks;
    }

    public ArrayList<Book> getInventory() {
        return inventory;
    }

}

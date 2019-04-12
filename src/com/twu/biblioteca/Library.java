package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> inventory;

    public Library() {
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("The Grapes of Wrath", "John Steinbeck", "1939"));
        listOfBooks.add(new Book("Moby Dick", "Herman Melville", "1851"));
        listOfBooks.add(new Book("Animal Farm", "George Orwell", "1945"));
        this.inventory = listOfBooks;
    }

    public ArrayList<Book> getInventory() {
        return inventory;
    }

}

package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> inventory;

    public Library() {
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("John Steinbeck", "The Grapes of Wrath", "1939", false));
        listOfBooks.add(new Book("Herman Melville", "Moby Dick", "1851", false));
        listOfBooks.add(new Book("George Orwell", "Animal Farm", "1945", false));
        this.inventory = listOfBooks;
    }

    public ArrayList<Book> getInventory() {

        ArrayList<Book> filteredBookList = new ArrayList<Book>();
            for(int index = 0; index < inventory.size(); index++) {
                Book currentBook = inventory.get(index);
                if (!currentBook.isCheckedOut()) {
                    filteredBookList.add(currentBook);
                }
            }
            return filteredBookList;
    }

}

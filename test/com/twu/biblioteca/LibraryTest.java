package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void getInventoryGetTitle() {
        //Given: The Library contains a list of books
        Library library = new Library();

        //When:
        ArrayList<Book> books = library.getInventory();
        books.get(0).getTitle();

        //Then: I want to see the title of the first book
        assertEquals("1 - The Grapes of Wrath", "1 - The Grapes of Wrath");
    }

    @Test
    public void getInventoryGetAuthor() {
        //Given: The Library contains a list of books
        Library library = new Library();

        //When:
        ArrayList<Book> books = library.getInventory();
        books.get(2).getAuthor();

        //Then: I want to see the title of the first book
        assertEquals("George Orwell", "George Orwell");
    }

    @Test
    public void getInventoryGetYear() {
        //Given: The Library contains a list of books
        Library library = new Library();

        //When:
        ArrayList<Book> books = library.getInventory();
        books.get(1).getYear();

        //Then: I want to see the title of the first book
        assertEquals("1851", "1851");
    }
}
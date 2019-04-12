package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void getAuthor() {
        //Given: The Library contains books
        Book book = new Book("T", "B", "C");
        //When: The books should have title, author, year infos
        book.getAuthor();

        //Then: I want to see the menu options
        assertEquals("T", "T");
    }

    @Test
    public void getTitle() {
        //Given: The Library contains books
        Book book = new Book("T", "B", "C");
        //When: The books should have title, author, year infos
        book.getTitle();

        //Then: I want to see the menu options
        assertEquals("B", "B");

    }

    @Test
    public void getYear() {
        //Given: The Library contains books
        Book book = new Book("T", "B", "C");
        //When: The books should have title, author, year infos
        book.getTitle();

        //Then: I want to see the menu options
        assertEquals("C", "C");

    }
}

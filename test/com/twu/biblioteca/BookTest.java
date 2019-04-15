package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldReturnBookAuthor() {
        // Arrange our objects - class to be tested
        Book book = new Book("George Orwell", "Animal Farm", "1945", false);

        // Action we are testing - method to be tested
        String result = book.getAuthor();

        // Assert that the action caused the expected result
        assertThat(result, is("George Orwell"));
    }

    @Test
    public void shouldReturnTrueForCheckedOutBook() {
        // Arrange our objects - class to be tested
        Book book = new Book("George Orwell", "Animal Farm", "1945", true);

        // Action we are testing - method to be tested
        boolean result = book.isCheckedOut();

        // Assert that the action caused the expected result
        assertThat(result, is(true));
    }

    @Test
    public void shouldReturnFalseForAvailableBook() {
        // Arrange our objects - class to be tested
        Book book = new Book("George Orwell", "Animal Farm", "1945", false);

        // Action we are testing - method to be tested
        boolean result = book.isCheckedOut();

        // Assert that the action caused the expected result
        assertThat(result, is(false));
    }
}

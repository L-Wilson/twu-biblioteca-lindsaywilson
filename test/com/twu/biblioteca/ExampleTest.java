package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    //Streams for testing the command line outputs:
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testSimpleWelcomeMessage() {
        //Given: As a user

        //When: I start the application
        Prompter.displayWelcomeMessage();

        //Then: I want to see a welcome message
        assertEquals( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore.\n",
                outContent.toString());
    }

     @Test
     public void testDisplayMenu() {
        //Given: As a user

        //When: I start the application
        Prompter.displayMenuOptions();

        //Then: I want to see the menu options
        assertEquals( " ======== Menu ======== \n 1 - View list of all books \n 2 - Quit",
                outContent.toString());
    }

//    @Test
//    public void testUserInput() {
//        //Given: As a user
//
//        //When: I see the menu options
//        Prompter.promptForMenuOption();
//
//        //Then: I want to be notified when I choose an invalid option
//        assertEquals( "Invalid menu option.", "\n Please select your menu option by typing its number and pressing Enter: ");
//
//    }

//    @Test
//    public void testDisplayMenu() {
//        //Given: As a user
//
//        //When: I choose the menu option "View list of all books"
//        Prompter.displayAllBooks();
//
//        //Then: I want to see a list of all the books
//        assertEquals( , );
//    }

        @Test
        public void testBookAuthor() {
            //Given: The Library contains books
            Book book = new Book("T", "B", "C");
            //When: The books should have title, author, year infos
            book.getAuthor();

            //Then: I want to see the menu options
            assertEquals("T", "T");
        }

        @Test
        public void testBookTitle() {
            //Given: The Library contains books
            Book book = new Book("T", "B", "C");
            //When: The books should have title, author, year infos
            book.getTitle();

            //Then: I want to see the menu options
            assertEquals("B", "B");

        }

        @Test
        public void testBookYear() {
            //Given: The Library contains books
            Book book = new Book("T", "B", "C");
            //When: The books should have title, author, year infos
            book.getTitle();

            //Then: I want to see the menu options
            assertEquals("C", "C");

        }

    @Test
    public void test() {
        assertEquals(1, 1);
    }
}
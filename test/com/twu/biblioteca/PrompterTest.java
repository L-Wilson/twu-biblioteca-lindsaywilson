package com.twu.biblioteca;


        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import java.io.ByteArrayInputStream;
        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;

        import static org.junit.Assert.assertEquals;

public class PrompterTest {

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
    public void testDisplayWelcomeMessage() {
        //Given: As a user

        //When: I start the application
        Prompter.displayWelcomeMessage();

        //Then: I want to see a welcome message
        assertEquals( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore.\n",
                outContent.toString());
    }

    @Test
    public void testDisplayMenuOptions() {
        //Given: As a user

        //When: I start the application
        Prompter.displayMenuOptions();

        //Then: I want to see the menu options
        assertEquals( " ======== Menu ======== \n 1 - View list of all books \n 2 - Quit",
                outContent.toString());
    }

}

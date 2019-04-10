package com.twu.biblioteca;
import java.util.Scanner;

public class Prompter {
    private static String menuOption1 = "1 - View list of all books";
    private static String menuOption2 = "2 - Quit";

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore.");
    }

    public static void displayMenuOptions() {
        System.out.printf(" ======== Menu ======== \n %s \n %s",
                menuOption1,
                menuOption2
        );

    }

}

package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Prompter {
    private static String menuOption1 = "1 - View list of all books";
    private static String menuOption2 = "2 - Quit";

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore.");
    }

    public static void displayMenuOptions() {
        System.out.printf(" ======== Menu ======== \n %s  %s",
                menuOption1,
                menuOption2
        );
    }


    public static char promptForMenuOption() {
        Scanner scanner = new Scanner(System.in);
        String input;
        char usersMenuChoice;
        boolean isAcceptable = false;

            do {
                System.out.println("\n Please select your menu option by typing its number and pressing Enter: ");
                input = scanner.nextLine();
                usersMenuChoice = input.charAt(0);

                if (usersMenuChoice == '1') {
                    isAcceptable = true;
                    Library library = new Library();
                    ArrayList<Book> books = library.getInventory();
                    System.out.printf("List of all books: " +
                                        "\n 1 - %s by %s (%s)" +
                                        "\n 2 - %s by %s (%s)" +
                                        "\n 3 - %s by %s (%s)",
                                        books.get(0).getTitle(), books.get(0).getAuthor(), books.get(0).getYear(),
                                        books.get(1).getTitle(), books.get(1).getAuthor(), books.get(1).getYear(),
                                        books.get(2).getTitle(), books.get(2).getAuthor(), books.get(2).getYear()
                    );
                } else if (usersMenuChoice == '2') {
                    isAcceptable = true;
                    System.exit(0);
                } else {
                    System.out.println("\n Invalid menu option");
                }

            } while (!isAcceptable);

        return usersMenuChoice;
    }

}

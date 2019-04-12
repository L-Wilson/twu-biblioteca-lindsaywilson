package com.twu.biblioteca;

import static com.twu.biblioteca.Prompter.promptForMenuOption;

public class BibliotecaApp {

    public static void main(String[] args) {

        Prompter prompter = new Prompter();
        prompter.displayWelcomeMessage();
        prompter.displayMenuOptions();
        promptForMenuOption();
//        if (prompter.promptForMenuOption() == '1') {
//            Library library = new Library();
//            library.getInventory();
//        }
//        else if (prompter.promptForMenuOption() == '2') {
//            System.exit(0);
//        }


    }
}

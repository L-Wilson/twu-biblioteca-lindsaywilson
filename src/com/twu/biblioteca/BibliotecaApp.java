package com.twu.biblioteca;

import static com.twu.biblioteca.Prompter.promptForMenuOption;

public class BibliotecaApp {

    public static void main(String[] args) {

        Prompter prompter = new Prompter();
        prompter.displayWelcomeMessage();
        prompter.displayMenuOptions();
        promptForMenuOption();
    }
}

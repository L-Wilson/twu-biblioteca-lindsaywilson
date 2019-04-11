package com.twu.biblioteca;

public class Book {
        private String author;
        private String title;
        private String year;
        private boolean isCheckedOut = false;

        public Book(String author, String title, String year) {
            this.author = author;
            this.title = title;
            this.year = year;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public String getYear() {
            return year;
        }

        public boolean getBookStatus() {
            return isCheckedOut;
        }

}

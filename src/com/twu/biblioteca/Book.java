package com.twu.biblioteca;

public class Book {
        private String author;
        private String title;
        private String year;
        private boolean isCheckedOut;

        public Book(String author, String title, String year, boolean isCheckedOut) {
            this.author = author;
            this.title = title;
            this.year = year;
            this.isCheckedOut = isCheckedOut;
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


        public boolean isCheckedOut() {
            return isCheckedOut == true;
        }

}


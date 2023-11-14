package org.code_structure.constructors;

class Book {
    String title;
    String author;
    int year;

    // Default Constructor


    // Parameterized Constructor
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book() {

    }

    void displayInfo() {
        System.out.println(title + " by " + author + ", published in " + year);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
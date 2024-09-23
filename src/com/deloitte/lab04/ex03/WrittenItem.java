package com.deloitte.lab04.ex03;

abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(String id, String title, int copies, String author) {
        super(id, title, copies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}

class Book extends WrittenItem {
    public Book(String id, String title, int copies, String author) {
        super(id, title, copies, author);
    }
}

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(String id, String title, int copies, String author, int yearPublished) {
        super(id, title, copies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }
}

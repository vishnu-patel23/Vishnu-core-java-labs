package com.deloitte.lab04.ex03;

abstract class Item {
    private String id;
    private String title;
    private int copies;

    public Item(String id, String title, int copies) {
        this.id = id;
        this.title = title;
        this.copies = copies;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void checkIn() {
        copies++;
    }

    public void checkOut() {
        if (copies > 0) {
            copies--;
        } else {
            System.out.println("No copies available for checkout.");
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Copies: " + copies;
    }
}


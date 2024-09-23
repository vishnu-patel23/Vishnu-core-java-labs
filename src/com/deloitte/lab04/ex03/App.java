package com.deloitte.lab04.ex03;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "Life of a snail", 5, "Ramdas");
        JournalPaper paper1 = new JournalPaper("J001", "Research on AI", 3, "Aksahy Singh", 2020);
        Video video1 = new Video("V001", "Inception", 2, 148, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd1 = new CD("C001", "The gana", 4, 47, "Koi to singer", "Smooth");

        // Display items
        System.out.println(book1);
        System.out.println(paper1);
        System.out.println(video1);
        System.out.println(cd1);

        // Check out some items
        book1.checkOut();
        video1.checkOut();
        
        // Display updated copies
        System.out.println("\nAfter checkout:");
        System.out.println(book1);
        System.out.println(video1);
    }
}


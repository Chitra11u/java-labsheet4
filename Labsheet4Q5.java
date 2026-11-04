class Book {
    String title;
    String author;
    double price;
    static String publisher = "Penguin Books";

    void setAndDisplayDetails(String t, String a, double p) {
        String localTitle = t;
        String localAuthor = a;
        double localPrice = p;
        this.title = localTitle;
        this.author = localAuthor;
        this.price = localPrice;
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price + ", Publisher: " + publisher);
    }
}

class Labsheet4Q5 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAndDisplayDetails("The Hobbit", "J.R.R. Tolkien", 15.99);
    }
}

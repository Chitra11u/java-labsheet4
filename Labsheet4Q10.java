class Movie {
    String name;
    String genre;
    double rating;
    static String industry = "Hollywood";

    void displayDetails(String n, String g, double r) {
        String localName = n;
        String localGenre = g;
        double localRating = r;
        this.name = localName;
        this.genre = localGenre;
        this.rating = localRating;
        System.out.println("Industry: " + industry + ", Movie: " + this.name + ", Genre: " + this.genre + ", Rating: " + this.rating);
    }
}

class Labsheet4Q10 {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.displayDetails("Inception", "Sci-Fi", 8.8);
    }
}

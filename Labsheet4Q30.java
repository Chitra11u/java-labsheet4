class Library {
    int booksAvailable;
    static String libraryName = "City Central Library";

    void updateOperations(int currentBooks, int issued, int returned) {
        int localCurrent = currentBooks;
        int localIssued = issued;
        int localReturned = returned;
        this.booksAvailable = localCurrent - localIssued + localReturned;
        System.out.println("Library: " + libraryName + ", Updated Books Available: " + this.booksAvailable);
    }
}

public class Labsheet4Q30 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.updateOperations(100, 5, 2);
    }
}

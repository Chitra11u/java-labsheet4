class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String localSentence = sentence;
        String[] words = localSentence.trim().split("\\s+");
        int count = localSentence.isEmpty() ? 0 : words.length;
        System.out.println("Language: " + language + ", Word Count: " + count);
    }
}

public class Labsheet4Q28 {
    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        wc.countWords("Java programming is fun");
    }
}

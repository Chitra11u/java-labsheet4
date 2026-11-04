class StringReverse {
    static int totalReversals = 0;

    void reverse(String str) {
        String localStr = str;
        String reversed = "";
        for (int i = localStr.length() - 1; i >= 0; i--) {
            reversed += localStr.charAt(i);
        }
        totalReversals++;
        System.out.println("Original: " + localStr + ", Reversed: " + reversed + ", Total Reversals: " + totalReversals);
    }
}

public class Labsheet4Q27 {
    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        sr.reverse("Hello");
    }
}

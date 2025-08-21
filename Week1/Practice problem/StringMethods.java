public class StringMethods {
    public static void main(String[] args) {
        String fullName = "Aashik S";
        String language = "Java";
        String sentence = "I love programming in Java";

        // Split full name
        String[] nameParts = fullName.split(" ");
        String first = nameParts[0];
        String last = nameParts[1];

        // Count characters (no spaces)
        int charCount = sentence.replace(" ", "").length();

        // Output
        System.out.println(first);
        System.out.println(last);
        System.out.println(language.toUpperCase());
        System.out.println(charCount);
    }
}

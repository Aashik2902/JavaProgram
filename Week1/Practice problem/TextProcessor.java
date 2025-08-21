import java.util.*;

public class TextProcessor {
    public static void main(String[] args) {
        String text = "Java is fun. I love programming in Java!";

        text = text.trim().replaceAll("\\s+", " ");

     
        String[] words = text.replaceAll("\\p{Punct}", "").split(" ");
        System.out.println("Words: " + words.length);

        System.out.println("Chars(no spaces): " + text.replace(" ", "").length());

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted Words:");
        for (String w : words) {
            System.out.println(w);
        }

        String search = "Java";
        if (Arrays.asList(words).contains(search)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}

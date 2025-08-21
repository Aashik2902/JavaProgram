import java.util.*;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with mixed formatting, digits, punctuation etc:");
        String input = scanner.nextLine();

        String trimmed = input.trim();

        String replacedSpaces = trimmed.replace(" ", "_");

        String noDigits = replacedSpaces.replaceAll("\\d", "");

        String[] wordsArray = noDigits.split("_");

        String joined = String.join(" | ", wordsArray);

        String noPunctuation = removePunctuation(input);
        String capitalized = capitalizeWords(noPunctuation);
        String reversedWords = reverseWords(noPunctuation);

        System.out.println("Trimmed: " + trimmed);
        System.out.println("Spaces replaced: " + replacedSpaces);
        System.out.println("Digits removed: " + noDigits);
        System.out.println("Words array: " + Arrays.toString(wordsArray));
        System.out.println("Rejoined with | : " + joined);

        System.out.println("No punctuation: " + noPunctuation);
        System.out.println("Capitalized words: " + capitalized);
        System.out.println("Reversed words: " + reversedWords);

        LinkedHashMap<String, Integer> freq = wordFrequency(noPunctuation);
        System.out.println("Word frequency: " + freq);

        scanner.close();
    }

    public static String removePunctuation(String text) {
        return text.replaceAll("[\\p{Punct}]", "");
    }

    public static String capitalizeWords(String text) {
        StringBuilder result = new StringBuilder();
        for (String word : text.trim().split("\\s+")) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String reverseWords(String text) {
        String[] parts = text.trim().split("\\s+");
        Collections.reverse(Arrays.asList(parts));
        return String.join(" ", parts);
    }

    public static LinkedHashMap<String, Integer> wordFrequency(String text) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : text.toLowerCase().split("\\s+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}

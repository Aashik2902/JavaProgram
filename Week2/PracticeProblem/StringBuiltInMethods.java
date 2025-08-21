public class StringBuiltInMethods {
    public static void main(String[] args) {
        String sampleText = " Java Programming is Fun and Challenging! ";

        System.out.println("1. Original String: \"" + sampleText + "\"");
        System.out.println("   Length (with spaces): " + sampleText.length());

        String trimmedText = sampleText.trim();
        System.out.println("\n2. Trimmed String: \"" + trimmedText + "\"");
        System.out.println("   Length (after trimming): " + trimmedText.length());

        System.out.println("\n3. Character at index 5: " + sampleText.charAt(5));

        String programmingWord = trimmedText.substring(5, 16);
        System.out.println("\n4. Substring 'Programming': " + programmingWord);

        int indexFun = trimmedText.indexOf("Fun");
        System.out.println("\n5. Index of 'Fun': " + indexFun);

        System.out.println("\n6. Contains 'Java'? " + trimmedText.contains("Java"));

        System.out.println("\n7. Starts with 'Java'? " + trimmedText.startsWith("Java"));

        System.out.println("\n8. Ends with '!'? " + trimmedText.endsWith("!"));

        System.out.println("\n9. Uppercase: " + trimmedText.toUpperCase());

        System.out.println("\n10. Lowercase: " + trimmedText.toLowerCase());

        int vowelCount = countVowels(trimmedText);
        System.out.println("\n11. Number of vowels: " + vowelCount);

        System.out.println("\n12. Occurrences of 'a': ");
        findAllOccurrences(trimmedText, 'a');
    }

    public static int countVowels(String text) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void findAllOccurrences(String text, char target) {
        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                System.out.println("   Found at index: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("   No occurrences found.");
        }
    }
}

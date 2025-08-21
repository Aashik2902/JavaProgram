import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        for (char c : text.toCharArray()) freq[c]++;
        for (char c : text.toCharArray())
            if (freq[c] == 1) return c;
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char res = firstNonRepeating(sc.nextLine());
        System.out.println(res == '\0' ? "No non-repeating character found." : "First non-repeating character: " + res);
        sc.close();
    }
}

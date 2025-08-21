import java.util.*;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Find: ");
        String find = sc.nextLine();
        System.out.print("Replace with: ");
        String replace = sc.nextLine();

        // Manual replacement
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length();) {
            if (i <= text.length() - find.length() &&
                text.substring(i, i + find.length()).equals(find)) {
                result.append(replace);
                i += find.length();
            } else {
                result.append(text.charAt(i++));
            }
        }

        // Output
        System.out.println("Manual : " + result);
        System.out.println("Built-in: " + text.replace(find, replace));
        System.out.println("Same?   : " + result.toString().equals(text.replace(find, replace)));
    }
}

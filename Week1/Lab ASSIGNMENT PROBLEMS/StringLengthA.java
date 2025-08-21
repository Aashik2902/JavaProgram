import java.util.Scanner;

public class StringLengthA {
    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count++);
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.println("Length (without length()): " + findLength(input));
        System.out.println("Length (using length()): " + input.length());
    }
}

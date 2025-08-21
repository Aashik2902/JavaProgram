import java.util.Scanner;

public class AsciiConversionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("ASCII of '" + ch + "' = " + (int) ch);

        System.out.print("Enter an ASCII value: ");
        int n = scanner.nextInt();
        System.out.println("Character for " + n + " = " + (char) n);

        System.out.println("Shifted char (+1): " + (char) (ch + 1));

        if (ch >= 'a' && ch <= 'z')
            System.out.println("Uppercase: " + (char) (ch - 32));
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println("Lowercase: " + (char) (ch + 32));

        scanner.close();
    }
}

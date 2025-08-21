import java.util.Scanner;

public class CharFrequency {
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

        int count = 0;
        for (int f : freq) if (f > 0) count++;

        String[][] res = new String[count][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                res[idx][0] = Character.toString((char) i);
                res[idx][1] = Integer.toString(freq[i]);
                idx++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqData = findFrequency(input);

        System.out.println("Char Frequency");
        for (String[] pair : freqData) {
            System.out.printf("%-4s %s\n", pair[0], pair[1]);
        }
        sc.close();
    }
}

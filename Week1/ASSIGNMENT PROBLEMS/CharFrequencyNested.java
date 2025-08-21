import java.util.Scanner;

public class CharFrequencyNested {
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) freq[i] = 1;

        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') continue;
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (char c : chars) if (c != '0') count++;

        String[] res = new String[count];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                res[idx++] = chars[i] + " : " + freq[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        for (String s : findFrequency(sc.nextLine())) System.out.println(s);
        sc.close();
    }
}

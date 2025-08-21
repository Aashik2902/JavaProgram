import java.util.Scanner;

public class WordLengthTable {
    
    static int getLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }
    
    static String[] manualSplit(String text) {
        int len = getLength(text), count = 1;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') count++;
        String[] words = new String[count];
        int start = 0, idx = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = text.substring(start, len);
        return words;
    }
    
    static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        
        String[] words = manualSplit(input);
        String[][] table = getWordsWithLengths(words);
        
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
        
        sc.close();
    }
}

import java.util.Scanner;

public class SplitTextComparison {
    
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
    
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        
        String[] manual = manualSplit(input);
        String[] builtin = input.split(" ");
        
        System.out.println("\nManual Split:");
        for (String w : manual) System.out.println(w);
        
        System.out.println("\nBuilt-in Split:");
        for (String w : builtin) System.out.println(w);
        
        System.out.println("\nSame Result? " + compareArrays(manual, builtin));
        sc.close();
    }
}

import java.util.*;
class SpellChecker {
    static int distance(String a, String b) {
        int diff = Math.abs(a.length() - b.length());
        for (int i = 0; i < Math.min(a.length(), b.length()); i++)
            if (a.charAt(i) != b.charAt(i)) diff++;
        return diff;
    }
    static String suggest(String w, String[] dict) {
        String best = w; int min = 99;
        for (String d : dict) {
            int dis = distance(w, d);
            if (dis < min) { min = dis; best = d; }
        }
        return (min <= 2) ? best : w;
    }
    public static void main(String[] a) {
        String[] dict = {"java","python","code","hello","world"};
        String[] words = {"jvaa","pythn","world"};
        for (String w : words)
            System.out.println(w+" -> "+suggest(w,dict));
    }
}


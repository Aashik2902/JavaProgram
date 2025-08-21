import java.util.*;

public class VotingEligibility {
    static int[] generateAges(int n) {
        Random r = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = r.nextInt(90) + 10;
        return a;
    }
    static String[][] checkEligibility(int[] a) {
        String[][] res = new String[a.length][2];
        for (int i = 0; i < a.length; i++) {
            res[i][0] = String.valueOf(a[i]);
            res[i][1] = (a[i] >= 18) ? "true" : "false";
        }
        return res;
    }
    static void display(String[][] d) {
        System.out.println("Age\tCan Vote?");
        for (String[] r : d) System.out.println(r[0] + "\t" + r[1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = generateAges(10);
        display(checkEligibility(ages));
        sc.close();
    }
}

public class PerformanceTest {
    public static void main(String[] args) {
        int n = 50000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) s += "a";
        long t1 = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        long t2 = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("a");
        long t3 = System.nanoTime() - start;

        System.out.println("String time: " + t1);
        System.out.println("StringBuilder time: " + t2);
        System.out.println("StringBuffer time: " + t3);
    }
}

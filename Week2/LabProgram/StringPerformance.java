import java.util.*;

public class StringPerformance {
    static long testString(int n){
        long start=System.currentTimeMillis();
        String s=""; for(int i=0;i<n;i++) s+= "x";
        return System.currentTimeMillis()-start;
    }
    static long testBuilder(int n){
        long start=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++) sb.append("x");
        return System.currentTimeMillis()-start;
    }
    static long testBuffer(int n){
        long start=System.currentTimeMillis();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;i++) sb.append("x");
        return System.currentTimeMillis()-start;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter iterations: ");
        int n=sc.nextInt();

        long t1=testString(n), t2=testBuilder(n), t3=testBuffer(n);

        System.out.println("\n--- Performance Comparison ---");
        System.out.printf("%-15s | %-10s\n","Method","Time(ms)");
        System.out.println("-----------------------------");
        System.out.printf("%-15s | %-10d\n","String (+)",t1);
        System.out.printf("%-15s | %-10d\n","StringBuilder",t2);
        System.out.printf("%-15s | %-10d\n","StringBuffer",t3);
    }
}

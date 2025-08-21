import java.util.Scanner;

public class CalendarDisplay {
    static String[] months = { "January","February","March","April","May","June",
                               "July","August","September","October","November","December"};
    static int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        sc.close();

        System.out.println("\n   " + months[m-1] + " " + y);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int start = getFirstDay(m,y);
        int totalDays = (m == 2 && isLeapYear(y)) ? 29 : daysInMonth[m-1];

        for(int i=0;i<start;i++) System.out.print("   ");
        for(int d=1;d<=totalDays;d++) {
            System.out.printf("%2d ", d);
            if((d+start)%7==0) System.out.println();
        }
        System.out.println();
    }

    static boolean isLeapYear(int y) {
        return (y%400==0) || (y%4==0 && y%100!=0);
    }

    static int getFirstDay(int m,int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }
}

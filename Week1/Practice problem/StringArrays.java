public class StringArrays {
    public static void main(String[] args) {
        String[] names = {"Aashik S", "Ash john", "Dolly D"};

        String longest = names[0];
        for (String n : names) if (n.length() > longest.length()) longest = n;
        System.out.println(longest);

        int count = 0;
        for (String n : names) if (n.charAt(0) == 'A') count++;
        System.out.println(count);

        for (String n : names) {
            String[] p = n.split(" ");
            System.out.println(p[1] + ", " + p[0]);
        }
    }
}

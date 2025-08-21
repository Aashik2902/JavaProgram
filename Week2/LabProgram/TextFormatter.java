import java.util.*;

public class TextFormatter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: "); String text=sc.nextLine();
        System.out.print("Enter width: "); int w=sc.nextInt();
        String[] words=text.split(" ");

        // Justify
        System.out.println("\nJustified:");
        for(int i=0;i<words.length;){
            String line=words[i++]; 
            while(i<words.length && line.length()+1+words[i].length()<=w)
                line+=" "+words[i++];
            System.out.println(line+" ".repeat(w-line.length()));
        }

        // Center
        System.out.println("\nCentered:");
        for(int i=0;i<words.length;){
            String line=words[i++]; 
            while(i<words.length && line.length()+1+words[i].length()<=w)
                line+=" "+words[i++];
            int pad=(w-line.length())/2;
            System.out.println(" ".repeat(pad)+line);
        }
    }
}

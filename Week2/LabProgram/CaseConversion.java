import java.util.*;

public class CaseConversion {
    static char toUpper(char c){ return (c>='a'&&c<='z')?(char)(c-32):c; }
    static char toLower(char c){ return (c>='A'&&c<='Z')?(char)(c+32):c; }

    static String toUpperStr(String s){ 
        StringBuilder r=new StringBuilder(); 
        for(char c:s.toCharArray()) r.append(toUpper(c)); 
        return r.toString(); 
    }

    static String toLowerStr(String s){ 
        StringBuilder r=new StringBuilder(); 
        for(char c:s.toCharArray()) r.append(toLower(c)); 
        return r.toString(); 
    }

    static String toTitleStr(String s){ 
        StringBuilder r=new StringBuilder(); 
        boolean newWord=true; 
        for(char c:s.toCharArray()){ 
            if(c==' ') { r.append(c); newWord=true; } 
            else { r.append(newWord?toUpper(c):toLower(c)); newWord=false; } 
        } 
        return r.toString(); 
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();

        String up=toUpperStr(text), low=toLowerStr(text), title=toTitleStr(text);

        System.out.println("\n--- Conversion Results ---");
        System.out.printf("%-12s | %s\n","Manual UPPER",up);
        System.out.printf("%-12s | %s\n","Built-in UPPER",text.toUpperCase());
        System.out.printf("%-12s | %s\n","Manual lower",low);
        System.out.printf("%-12s | %s\n","Built-in lower",text.toLowerCase());
        System.out.printf("%-12s | %s\n","Manual Title",title);
    }
}

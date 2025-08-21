import java.util.*;

public class CaesarCipher {
    static char shiftChar(char c,int shift){
        if(c>='A'&&c<='Z') return (char)((c-'A'+shift+26)%26+'A');
        if(c>='a'&&c<='z') return (char)((c-'a'+shift+26)%26+'a');
        return c;
    }
    static String encrypt(String txt,int shift){
        StringBuilder sb=new StringBuilder();
        for(char c:txt.toCharArray()) sb.append(shiftChar(c,shift));
        return sb.toString();
    }
    static String decrypt(String txt,int shift){ return encrypt(txt,-shift); }

    static void showAscii(String label,String txt){
        System.out.print(label+": "+txt+"\nASCII : ");
        for(char c:txt.toCharArray()) System.out.print((int)c+" ");
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: "); String text=sc.nextLine();
        System.out.print("Enter shift: "); int shift=sc.nextInt();

        String enc=encrypt(text,shift), dec=decrypt(enc,shift);

        System.out.println("\n--- Caesar Cipher ---");
        showAscii("Original",text);
        showAscii("Encrypted",enc);
        showAscii("Decrypted",dec);
        System.out.println("Decryption valid? "+text.equals(dec));
    }
}

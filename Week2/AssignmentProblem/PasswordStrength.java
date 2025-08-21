import java.util.*;
class PasswordStrength {
    static int score(String p) {
        int up=0,lo=0,d=0,s=0;
        for(char c:p.toCharArray()){
            if(Character.isUpperCase(c)) up++;
            else if(Character.isLowerCase(c)) lo++;
            else if(Character.isDigit(c)) d++;
            else s++;
        }
        return (p.length()-8)*2 + (up>0?10:0)+(lo>0?10:0)+(d>0?10:0)+(s>0?10:0);
    }
    public static void main(String[] a){
        String[] pass={"abc123","Strong@123"};
        for(String p:pass) 
            System.out.println(p+" -> Score:"+score(p));
    }
}

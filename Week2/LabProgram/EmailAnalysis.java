import java.util.*;

public class EmailAnalysis {
    static boolean isValid(String email){
        int at=email.indexOf('@'), lastAt=email.lastIndexOf('@');
        int dot=email.lastIndexOf('.');
        return at>0 && at==lastAt && dot>at+1 && dot<email.length()-1;
    }
    static String[] extract(String email){
        int at=email.indexOf('@'), dot=email.lastIndexOf('.');
        String user=email.substring(0,at);
        String domain=email.substring(at+1);
        String dname=email.substring(at+1,dot);
        String ext=email.substring(dot+1);
        return new String[]{user,domain,dname,ext};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of emails: ");
        int n=sc.nextInt(); sc.nextLine();
        List<String> emails=new ArrayList<>();
        for(int i=0;i<n;i++) emails.add(sc.nextLine());

        Map<String,Integer> domainCount=new HashMap<>();
        int valid=0,invalid=0,totalUserLen=0;
        System.out.printf("%-25s | %-10s | %-15s | %-10s | %-8s | %-6s\n",
                          "Email","Username","Domain","DomainName","Ext","Valid");
        System.out.println("-------------------------------------------------------------------------------");
        for(String e:emails){
            if(isValid(e)){
                valid++;
                String[] parts=extract(e);
                totalUserLen+=parts[0].length();
                domainCount.put(parts[1],domainCount.getOrDefault(parts[1],0)+1);
                System.out.printf("%-25s | %-10s | %-15s | %-10s | %-8s | %-6s\n",
                                  e,parts[0],parts[1],parts[2],parts[3],"Yes");
            }else{
                invalid++;
                System.out.printf("%-25s | %-10s | %-15s | %-10s | %-8s | %-6s\n",
                                  e,"-","-","-","-","No");
            }
        }

        String commonDom=domainCount.entrySet().stream()
            .max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("-");
        double avgUserLen=(valid==0?0:(double)totalUserLen/valid);

        System.out.println("\n--- Analysis ---");
        System.out.println("Valid emails   : "+valid);
        System.out.println("Invalid emails : "+invalid);
        System.out.println("Most common domain: "+commonDom);
        System.out.println("Avg username length: "+avgUserLen);
    }
}

class TextCompress {
    static void compress(String t){
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<=t.length();i++){
            if(i<t.length() && t.charAt(i)==t.charAt(i-1)) count++;
            else { sb.append(t.charAt(i-1)).append(count); count=1; }
        }
        System.out.println("Compressed:"+sb);
    }
    public static void main(String[] a){
        compress("aaabbccccdd");
    }
}

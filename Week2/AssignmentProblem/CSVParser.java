class CSVParser {
    public static void main(String[] a){
        String data="Name,Age\nAsh,20\ndolly,25";
        String[] rows=data.split("\n");
        for(String r:rows){
            String[] cols=r.split(",");
            for(String c:cols) System.out.print(c+"\t");
            System.out.println();
        }
    }
}

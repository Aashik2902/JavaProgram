class Calculator {
    static int eval(String exp){
        String[] parts = exp.split(" ");
        int res = Integer.parseInt(parts[0]);
        for(int i=1;i<parts.length;i+=2){
            int n = Integer.parseInt(parts[i+1]);
            switch(parts[i]){
                case "+": res+=n; break;
                case "-": res-=n; break;
                case "*": res*=n; break;
                case "/": res/=n; break;
            }
        }
        return res;
    }
    public static void main(String[] a){
        System.out.println(eval("10 + 5 * 2")); // Left to right simple
    }
}
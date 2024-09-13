public class reverse {
    public static void main(String[] args) {
        int n,rem,d=0;
        n=55654;
        System.out.println(n);
        while (n!=0) {
            rem=n%10;
            d=d*10+rem;
            n=n/10;
        }
        
        System.out.println("revrse of this number is :"+d);
    }
    
}

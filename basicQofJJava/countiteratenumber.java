public class countiteratenumber {
    public static void main(String[] args) {
        // in this proghram we count the iteration of number in given number....
        // here we count hpow many times 3 is iterate
        int  n=343445;
        int rem=0,count=0;
        while(n!=0){
            rem=n%10;
            if(rem==4){
                count++;
            }
            n=n/10;
        }
        System.out.println("ityeration of three is :"+count);
    }
    
}

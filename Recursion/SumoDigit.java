package Recursion;

public class SumoDigit {
    // sum of digit
    public static void main(String[] args) {
        int num = 6776;
        int s =0;
        int rev =0;
        SumoDigit obj = new SumoDigit();
       System.out.println( obj.sum(num,rev));
       System.out.println(obj.palindrom(num, rev));
    }
    int sum(int numm,int rev)
    {
        int rem = numm%10;
         rev = rev*10+rem;   // for reverse of num
        // rev=rev+rem;  // for sum of digit
         numm = numm/10;
         
         if(numm<=0)
         {
            return rev;
            
         }
         return sum(numm,rev);
    }
    boolean palindrom(int num,int t){
        return   num==sum(num, t);
    
    }
}

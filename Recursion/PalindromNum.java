

package Recursion;

public class PalindromNum {
    // reverse of digit
    public static void main(String[] args) {
        int num = 6776;
        int s =0;
        int rev =0;
        PalindromNum obj = new PalindromNum();
       System.out.println( obj.reverse(num,rev));
       System.out.println(obj.palindrom(num, rev));
    }
    int reverse(int numm,int rev)
    {
        int rem = numm%10;
         rev = rev*10+rem;   // for reverse of num
        // rev=rev+rem;  // for reverse of digit
         numm = numm/10;
         
         if(numm<=0)
         {
            return rev;
            
         }
         return reverse(numm,rev);
    }
    boolean palindrom(int num,int t){
        return   num==reverse(num, t);
    
    }
}

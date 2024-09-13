package Recursion;
import java.util.Scanner;

public class gcd2 {
  
  static int gcd(int a,int b){
    if(b==0){
      return a;
    }
    return gcd(b,a%b);
  }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
System.out.println("gcd of two number is : "+gcd(a, b));
    }
   
}

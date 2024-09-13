package Recursion;
import java.util.Scanner;

public class factorialrec {
    static double rec(double n){
        if(n==1){
            return 1;
        }
return  n* rec(n-1);
    }
    public static void main(String[] args) {
        System.out.println("entert the number :");
        Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
rec(n);
System.out.println(rec(n));
    }
    
}

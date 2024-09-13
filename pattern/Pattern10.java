package PATTERN;

import java.util.Scanner;
//      1
//     212
//    32123
//   4321234
//  543212345

public class Pattern10 {
    void pattern10(int n){
        for(int r =1;r<=n;r++){
            for(int space = 0;space<n-r;space++)
            {
                System.out.print(" "+" ");
            }
            for(int c =r;c>=1;c--)
            {
                System.out.print(" "+c);
            }
            for(int j=2;j<=r;j++)  // start from 2 
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the row :");
        int n= sc.nextInt();
        Pattern10 obj = new Pattern10();
        obj.pattern10(n);

    }
    
}

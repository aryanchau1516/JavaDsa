package PATTERN;

import java.util.Scanner;

// *    
// *  * 
// *  *  *
// *  *  *  *
// *  *  *  *  *
// *  *  *  *  *  *
// *  *  *  *  *
// *  *  *  *
// *  *  *
// *  *
// *

public class pattern5 {
    static void print(int n){
        for(int row=0;row<2*n;row++)
        {
            int totalcolinrow=row>n?2*n-row:row;
            for(int col=0;col<totalcolinrow;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the value of the row :");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        print(n);
    }

    
}

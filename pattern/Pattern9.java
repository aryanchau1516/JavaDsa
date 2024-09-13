package PATTERN;

import java.util.Scanner;


// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
public class Pattern9 {
    void pattern9(int n){
        for(int r  =0;r<n;r++)
        {
            for(int c=0;c<=r;c++)
            { System.out.print(" "+"*");  // " "+ for spaccing brtween value 
        }
        for(int s=0;s<n-r;s++){
            System.out.print(" "+" ");
        }
        for(int s=0;s<n-r;s++){
            System.out.print(" "+" ");
        }
        for(int c=r;c>=0;c--)
        { System.out.print(" "+"*");
    }
        System.out.println();
        }


    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        Pattern9 obj = new Pattern9();
        obj.pattern9(n);
    }
    
}

package pattern;

import java.util.Scanner;

// *
// *  *
// *  *  *
// *  *  *  *
// *  *  *  *  *
// *  *  *  *
// *  *  *
// *  *
// *

public class pattern7 {
  void patternp(int n)
    {
        for(int r =0;r<2*n;r++)
        {
            int rinc=r>n?2*n-r:r;
            for(int c=0;c<rinc;c++)
            {
                System.out.print(" * ");
             }
  
        System.out.println();
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers of row :");
        int n= sc.nextInt();
       pattern7 obj= new pattern7();
        obj.patternp(n);
    }
    
}

package PATTERN;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int n = sc.nextInt();
        for( i=0;i<n;i++)
        {
            for(j=0;j<=n-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
         
    }
    
}

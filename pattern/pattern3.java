package PATTERN;

import java.util.Scanner;

// *   *   *   *   *
//  *   *   *   *
//  *   *   *
//  *   *
//  *

public class pattern3 {
    
    public static void main(String[] args) {
        System.out.println("enter the number   of row :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++){
                System.out.print(" *  ");
            }
            System.out.print("\n");
        }
    }
    
}

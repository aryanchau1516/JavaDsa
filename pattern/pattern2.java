package PATTERN;

import java.util.Scanner;

// *  *  *  *  * 

// *  *  *  *  *

// *  *  *  *  *

// *  *  *  *  *

// *  *  *  *  *

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of thwe row :");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
    
}

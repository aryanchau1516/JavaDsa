package pattern;

import java.util.Scanner;

// 0 0 0 0 0

//  1 1 1 1 1

//  2 2 2 2 2

//  3 3 3 3 3

//  4 4 4 4 4

public class pattern4 {
    public static void main(String[] args) {
        System.out.print("enter the value of row :");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        { for(int j=0;j<n;j++){
            System.out.print(" "+i );
        }
        System.out.println("\n");
    }
}
}

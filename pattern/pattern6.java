package pattern;

import java.util.Scanner;

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *

public class pattern6 {
    static void print(int n){
                for(int row=0;row<n;row++)
                { 
                    for(int s=0;s<n-row;s++){  // creating for the space4,3,3,1,0

                    System.out.print("3 ");
                }
            //     for(int c=0;c<row;c++){
                    
            //         System.out.print("*"+" ");
            // }
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

package ARRALIST;

import java.util.Scanner;

public class Averagenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark of five subject :");
        int s1 = sc .nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc .nextInt();
        double per  = (s1+s2+s3+s4+s5)/5.0;
        System.out.print("percentage : " +per );
    }
}

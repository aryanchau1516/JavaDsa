package Recursion;

import java.util.Scanner;

public class reversen {
    // write a function that takes number and 
    // and print till the nun=mbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n= sc.nextInt();
        print1(n);
    }
    static void print1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print1(n-1);
    }
    
}

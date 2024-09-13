package ARRALIST;

import java.util.ArrayList;
import java.util.Scanner;

public class inputarrlist {
    public static void main(String[] args) {
        Scanner sc
         = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        System.out.println("enter the value in arraylist :");
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(" print the value of araray list : "+list);
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(list);
        // }
        

    }
    
}

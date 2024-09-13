package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CielChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CielChar obj= new CielChar();
        char[] ch = new char[5];
        System.out.println("enter the  char");
        for(int i=0;i<ch.length;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
         System.out.println("character :"+Arrays.toString(ch));
         System.out.print("enter the targetted chRCTER :");
         char target = sc.next().charAt(0);
         System.out.println("ciel of thIS CHARCTER IS :"+obj.cielChar(ch, target));
    }
    char cielChar(char[] ch , char target)
    { int start =0;
        int end=ch.length-1;
        int mid;
        while (start<=end) {
             mid = start +(end- start)/2;
             if(target<ch[mid])
             {
                end=mid-1;
             }
             else{
                start= mid+1;
             }
            
        }
        return  ch[start % ch.length];
    }
}


// output.........


// character :[c, f, j, m, p]
// enter the targetted chRCTER :j
// ciel of thIS CHARCTER IS :m



// character :[c, f, j, m, p]
// enter the targetted chRCTER :p
// ciel of thIS CHARCTER IS :c
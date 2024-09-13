

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in)  ;
      System.out.print("enter the string :");
      String str = sc.nextLine();
      System.out.println("enter the character u want to seearch :");
      char ch = sc.next().charAt(0);
      StringSearch obj = new StringSearch();
      System.out.println(obj.search(str,ch));
    }
    boolean search(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }  
}

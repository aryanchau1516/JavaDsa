package STRING;

import java.util.Scanner;

public class palindromstr {
    static boolean palindrom(String str){
        if(str==null||str.length()==0){
            return  true;
        }
            
        
        for(int i=0;i<=str.length()/2;i++)
        {
            char beg=str.charAt(i);                              // i=0
            char end =str.charAt(str.length()-1-i);             // 6-1-i = 5-0 =5
        
            if (beg!=end) 
            {
            return false;
            }  
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the strintg:");
        String str = sc.nextLine();
        System.out.println(palindrom(str));
    }
    
}

package STRING;

import java.util.Scanner;



public class strinbgcharsame {
    static boolean samechar(String str){
        char[] ch=str.toCharArray();
         int  start=0;
            int  end=str.length()-1;
        // for(int i=0;i<str.length()/2;i++){
            while (start<end) {
            // int  start=0;
            // int  end=(str.length()-1);    
            
           
            if(ch[start]==ch[end]){
                start++;
                end--;
               continue;
               
            }
            else
           return false;
        }
        return true;

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(samechar(str));
    }
    
}

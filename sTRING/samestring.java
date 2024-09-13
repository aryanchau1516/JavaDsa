package STRING;

import java.util.Scanner;

public class samestring {
    static boolean samestr(String str){
        char[] ch= str.toCharArray();
        int j=ch.length-1;
        for(int i=0;i<j;i++){
            if(ch[i]!=ch[j]){
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of ");
        String str = sc.nextLine();
    
        System.out.println(samestr(str));
    }
    
}

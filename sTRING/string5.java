package STRING;

import java.util.Scanner;

public class string5 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str= sc.nextLine();
        
        System.out.println();
        countchar(str);
    }
    static void countchar(String str){
        int alpha=0;
        int number=0;
        int spechar=0;
        String s3="";
        String s2="";
        String s1="";

       //char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++){    //f(65<=ascii&&ascii<=91){
           
            int ascii = (int)str.charAt(i);
            if((65<=ascii&&ascii<=90)||(97<=ascii&&ascii<=132)){
                alpha++;
                s1=s1+(char)str.charAt(i);
            }
            else if(48<=ascii&&ascii<=57){
                number++;
                s2=s2+(char)str.charAt(i);
            }
            else if (32<=ascii&&ascii<=64) {
                spechar++;
                s3=s3+(char)str.charAt(i);
            }
        }
        System.out.println("alpha in string : "+alpha);
        System.out.println("alpha in string : "+s1);


        
        System.out.println("number in string : "+number);
        System.out.println("number in string : "+s2);
        System.out.println("special char in string : "+spechar);
        System.out.println("special char in string : "+s3);
        
    }
    
    
}

package STRING;

import java.util.Scanner;

public class string4 {
    // count uppercase character ..........
    // count lower case character........
    // count lower case character ............
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str= sc.nextLine();
        
        System.out.println();
        countchar(str);
    }
    static void countchar(String str){
        int upp=0;
        int lower=0;
        int spechar=0;
        String s3="";
        String s2="";
        String s1="";

       //char[] ch=str.toCharArray();
        for(int i=0;i<str.length();i++){    //f(65<=ascii&&ascii<=91){
           
            int ascii = (int)str.charAt(i);
            if((65<=ascii&&ascii<=90)){
                upp++;
                s1=s1+(char)str.charAt(i);
            }
            else if(97<=ascii&&ascii<=132){
                lower++;
                s2=s2+(char)str.charAt(i);
            }
            else if (32<=ascii&&ascii<=64) {
                spechar++;
                s3=s3+(char)str.charAt(i);
            }
        }
        System.out.println("uppercase in string : "+upp+"\n"+"");
        System.out.println("lowercase in string : "+lower);
        System.out.println("special char in string : "+spechar);
        
    }
    
}

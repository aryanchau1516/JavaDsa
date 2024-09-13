package STRING;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character :");
        char c = sc.next().charAt(0);
        if(c>='a'&&c<='z')
        {
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase ");
        }
    }
    
}

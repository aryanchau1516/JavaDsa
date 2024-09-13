package ARRAYS;
import java.util.Scanner;

public class minbthree {
    public static void main(String[] args) {
        // find minimum between three number...
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int min=a;
        if(min>b)
        {
            min=b;
        }
    if(min>c){
        min=c;
    }
    System.out.println("minimum, number between  a,b,c :"+min);
}
}
// we have math function like that 
// int max = Math.max(c,Math.max(a,b));  ... this is use for print maximum number between

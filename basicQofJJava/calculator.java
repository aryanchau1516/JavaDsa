import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("enter the input like +,-,*,/,% :");
        Scanner sc = new Scanner(System.in);
        double ans=0;
        while (true) {
            
        
                char op = sc.next().charAt(0);
         if(op=='+'|| op=='-'||op=='*'||op=='/'||op=='%')       {
            System.out.print("enter the value of n1 and n2 :");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            if(op=='+'){
                ans= n1+n2;

            }
            if(op=='-'){
                ans= n1-n2;

            }
            if(op=='x'||op=='X'){
                break;
            }
            else{
                System.out.println("enter invalid operator");
            }
         }
         System.out.println(ans);
        }        
    }
}

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a,b,count;
        a=-1;
        b=0;
        count =2;
        while (count<=n) {
            // int c=b;
            // b=b+a;
            // a=c;
            // count++;
            int c=b;
            b=b+a;
            a=c;
            count++;
            System.out.println(b);
                      
        }
System.out.println("nth fibonacci number:"+b);
    }
    
}

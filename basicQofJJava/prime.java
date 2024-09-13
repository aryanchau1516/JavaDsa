import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int c=0;
        for(int i=2;i<=n/2;i++){
            if (n%i==0) {
                c++;
                break;
            }
        }
        if(c==1){
            System.out.println("it is not  a prime number.");
        }
        else{
            System.out.println("it is prime number.");
        }
      //  System.out.println(n);
    }
    
}

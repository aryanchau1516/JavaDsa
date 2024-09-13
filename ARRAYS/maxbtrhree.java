package ARRAYS;
import java.util.Scanner;

public class maxbtrhree {
    // find maximum value between tree value
    public static void main(String[] args) {
      //  @SuppressWarnings("resource")
        Scanner ac1  = new Scanner(System.in);
        int a = ac1.nextInt();
        int b = ac1.nextInt();

        int c = ac1.nextInt();
        int max =a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("maximu8m number between a b and c:"+max);
    }
    
}

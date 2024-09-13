import java.util.Scanner;
//static int printt(){

// printing the number without using loop...
// print using recursion ......
public class printnum {
   
    static void printt(int n,int r){
      
        if(n>0){
            //r=0;
            r++;
            System.out.println(r);
            n--;
          printt(n,r);  // alliong function
        }
        
    }
    public static void main(String[] args) {
        System.out.println("enter the number :");
        int t;
        Scanner sc = new Scanner(System.in);
        t= sc.nextInt();
        int i=0;
       printt(t,i);
    }

}

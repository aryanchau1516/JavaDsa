import java.util.Scanner;

public class dicecase {
    // static boolean dice(int t){
    //     switch (t) {
            
    //         case 1->System.out.println("6");
    //         case 2->System.out.println("5");
    //         case 3->System.out.println("4");
    //         case 4->System.out.println("3");
    //         case 5->System.out.println("2");
    //         case 6->System.out.println("1");
    //         default->System.out.println("enter envalid case");
    //     }
    //     return false;
    //  }
     
    //     if(n==1){
    //         return 6;
    //     }
    //     if(n==2){
    //         return 5;
    //     }
    //     if(n==3){
    //         return 4;
    //     }
    //     if(n==4){
    //         return 3;
    //     }
    //     if(n==5){
    //         return 2;
    //     }
    //     if(n==6){
    //         return 1;
    //     }
    //     return 0;
    //
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // dice(n);
       // System.out.println(dice(n));
      switch (n) {
            
        // case 1->System.out.println("6");
        // case 2->System.out.println("5");
        // case 3->System.out.println("4");
        // case 4->System.out.println("3");
        // case 5->System.out.println("2");
        // case 6->System.out.println("1");
        // default->System.out.println("enter envalid case");
        case 1:
        System.out.println(6);
        break;
        case 2:
        System.out.println(5);
        break;
        case 3:
        System.out.println(4);
        break;
        case 4:
        System.out.println(3);
        break;
        case 5:
        System.out.println(2);
        break;
        case 6:
        System.out.println(1);
        break;
        default :
        System.out.println("enter invalid case");

    }
         
     }
    
}

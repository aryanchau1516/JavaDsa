import java.util.Scanner;

public class switch1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of the day :");
    // switch (sc.nextInt()) {
    //     case 1:
    //         System.out.println("monday");
    //         break;
    
    //         case 2:
    //         System.out.println("monday");
    //         break;
    //         case 3:
    //         System.out.println("tuesday");
    //         break;
    //         case 4:
    //         System.out.println("wednesday");
    //         break;
    //         case 5:
    //         System.out.println("friday");
    //         break;
    //         case 6:
    //         System.out.println("satuday");
    //         break;
    //         case 7:
    //         System.out.println("sunday");
    //         break;
    //     default:
    //     System.out.println("you enter invalid statement ..");
    //         break;
    // }

    switch (sc.nextInt()) {
        case 1->System.out.println("monday");
        case 2->System.out.println("tueday");
        case 3->System.out.println("wednesday");
        case 4->System.out.println("thusday");
        case 5->System.out.println("friday");
        case 6->System.out.println("saturday");
        case 7->System.out.println("sunday");
        default->System.out.println("enter invalid statement");
        
        

        

            
            

        
    }
}
    
}

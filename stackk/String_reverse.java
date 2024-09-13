import java.util.Scanner;
/*my name is aryan

  nayra si eman ym 
*/

public class String_reverse {
    public static void main(String[] args) {
        Stack5 obj = new Stack5();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
      //  String[] s1=s.split(" ");
      String ch ="";
        for(int i=0;i<s.length();i++)
        { 
            obj.push(s.charAt(i));     
        }
      //  obj.show1();
        System.out.println();
       
        while (!obj.isEmpty()) {
            //System.out.print(obj.pop());
            ch=(ch+obj.pop());
        }
        for(int i=0;i<ch.length()-1;i++)
        {
            System.out.print(ch.charAt(i));
       }
    }
    
}

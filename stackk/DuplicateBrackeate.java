
// if any duplicate bracket then its give ..........true 
// else give...........false
//            (a+b)-((t+i)) 
//             true


import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackeate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String str= sc.nextLine();
       String str =  "(a+b)-((t+i))" ;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch==')')
            {
                if(st.peek()=='(')
                {
                    System.out.println(true);
                    return;

                }
                else{
                    while (st.peek()!='(') {
                        st.pop();
                        
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
    
}

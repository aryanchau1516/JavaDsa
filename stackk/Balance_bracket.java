

import java.util.Scanner;
import java.util.Stack;

public class Balance_bracket
 {

    public static void main(String[] args)
     {  Balance_bracket obj = new Balance_bracket();
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
               boolean val= obj.handleclosing(st,'(');
               if(val==false)
               {
                System.out.println(val);
                return;
               }
            }
            else if(ch=='}')
            {
                boolean val=obj.handleclosing(st,'{');
                if(val==false)
                {
                 System.out.println(val);
                 return;
                }
            }
             else if(ch==']')
            {
                boolean val= obj.handleclosing(st,'[');
                if(val==false)
                {
                 System.out.println(val);
                 return;
                }
            }
        }
        if(st.size()==0)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }



    public boolean  handleclosing(Stack<Character> st , char corresoch)
    {
        
            if(st.size()==0)
            {
                //System.out.println(false);
                return false;
            }
        
        else if(st.peek()!=corresoch)
        {
           // System.out.println(false);
            return false;
        }
        else{
            st.pop();
            return true;
        }
    }
 }
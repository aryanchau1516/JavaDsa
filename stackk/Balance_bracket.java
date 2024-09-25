

import java.util.Scanner;
import java.util.Stack;

public class Balance_bracket  // or valid parantheiseish
 {
            public static boolean validBracket(String str){
                Stack<Character> st = new Stack<>();
                for(int i =0; i<str.length();i++){
                    char ch = str.charAt(i);
                    if(ch=='('||ch=='{'||ch=='['){  // for opening
                        st.push(ch);
                    }
                    else{  // for closeing bracket
                        if (st.isEmpty()) {  // it means st does not have openning brackets its only have closing brackts its mean invalid parantheshish  )}
                            return false;
                            
                        }
                        if((st.peek()=='('&& ch == ')')
                        || (st.peek()=='{'&& ch == '}') || (st.peek()=='['&& ch == ']')){
                            st.pop();  // when bracket are like this () || {} || {}
                           
                        }
                        else {
                            return false;
                        }
                    }
                }

                if(st.isEmpty()){
                    return true;
                }
                else {
                    return false;
                }
            }
    public static void main(String[] args)
     {  Balance_bracket obj = new Balance_bracket();
        Stack<Character> st = new Stack<>();
      //  Scanner sc = new Scanner(System.in);
       // String str = sc.nextLine();
      // String str = "(){{()}}";  // true
       String str = "(){{([]])}}"; // false
       System.out.println(validBracket(str)); 
     }
 }

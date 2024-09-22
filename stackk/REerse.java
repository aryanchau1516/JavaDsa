 import java.util.Stack;
/*
 * hello aryan chauhan
   nahuahc nayra olleh

   its not reverse a string competly
 */
public class REerse {
    public static void main(String[] args) {
        String str = "hello aryan chauhan";
        System.out.println(str);
       System.out.println( reverseString(str));
    }
    public static String reverseString(String str)
    {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));   
            idx ++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
            
        }
        return result.toString();
    }
}

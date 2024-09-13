// copy the value of stack in other sdtack in same order.

import java.util.Scanner;
import java.util.Stack;

public class Copy {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in)  ;
      Stack<Integer> st = new Stack<>();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.push(5);
      System.out.println(st);
      Stack<Integer> gt = new Stack<>();
      while (st.size()>0) {
        gt.push(st.pop());
        
      }
      System.out.println(gt);
      Stack<Integer> rt = new Stack<>();
      while (gt.size()>0) {
        rt.push(gt.pop());  // [1, 2, 3, 4, 5] the element is copid insame order
        
      }
      System.out.println(rt);
    }
}

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      st.push(5);
      System.out.println(st);
     //reverseRec(st);
     reverse2(st);
     System.out.println(st);
    }

    // iterative  method 1 for reverse.....
    public static void reverseRec(Stack<Integer> st ){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        System.out.print(top+ "  ");
       reverseRec(st);
        st.push(top);
       // System.out.println(st);
    }
    public static void pushAtBottom(Stack<Integer> st , int ele){
        Stack<Integer> gt = new Stack<>();        
        while (st.size()>0) {
            gt.push(st.pop());
            
        }
        st.push(ele);
        while (gt.size()>0) {
            st.push(gt.pop());
            
        }
      //  System.out.println(st);
    }

    // method 2 of reverse.....using pushatbottom method
    public static void reverse2(Stack<Integer> st ){
         int top = st.pop();
        reverse2(st);
        pushAtBottom(st, top);

    }

}

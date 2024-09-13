import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(11);
        st.push(13);
        System.out.println(st);
        int ele=45;
        pushAtBottom(st, ele);
        System.out.println(st);
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
}

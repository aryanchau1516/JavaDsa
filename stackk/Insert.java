import java.util.Stack;

public class Insert {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        int idx = 3;
        int ele = 34;
        Stack<Integer> gt = new Stack<>();        
        while (st.size()>3) {
            gt.push(st.pop());
            
        }
        st.push(ele);
        while (gt.size()>0) {
            st.push(gt.pop());
            
        }
        System.out.println(st);
    }
    
}

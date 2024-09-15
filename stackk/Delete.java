import java.util.Stack;
// delete a element specified index


public class Delete {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        delete(st, 6);
        System.out.println(st);
    }
public static void delete(Stack<Integer> st , int idx){
    Stack<Integer> gt = new Stack<>();
    while (st.size()>idx) {
        gt.push(st.pop());
        
    }
    st.pop();
    while (gt.size()>0) {
       st.push(gt.pop());
        
    }
}
}

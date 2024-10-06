import java.util.Stack;

public class NextGraterEle {
    public static void main(String[] args) {
        int arr[] = {8,1,0,5,2,3};
        Stack<Integer> st = new Stack<>();

        int nextGraterEle[] = new int[arr.length];
        for(int i =arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){      
                nextGraterEle[i] = -1;
            }
            else{
                nextGraterEle[i] = arr[st.peek()];  
            }

            st.push(i); // insert element in stack
        }

        for(int i =0 ;i<nextGraterEle.length;i++){
            System.out.print(nextGraterEle[i] + " ");
        }
    }
}



 // next greater element
 // next grater left
 // next smaller right
 //next smaller left
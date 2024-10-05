package queue;

/* 
 * add = 0(1)
 * remove = 0(1)
 */

public class QueueImp1 {
    static class  queue {
        static int arr[];
        static int size;
        static int rear;
        queue(int n)
        {
            arr = new int[n];
            size=n;
            rear = -1;
        }
    
        public static boolean isEmpty(){
            return rear == -1;   // empty return true else return -1;
        }

        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
            }
            else{
                rear = rear+1;
                arr[rear] = data;
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }
            int front = arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        

        public static int peek(){
            if (isEmpty())
            {
                System.out.println("empty queue");
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        queue obj = new queue(6);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.remove();
            
        }

    }
    
}

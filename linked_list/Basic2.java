 package linked_list;

public class Basic2 {
    public static class  Node {
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class List_b {
        Node head = null;
        Node tail = null;
        int size =0;
        void insertAtEn(int data)
        {   Node temp = new Node(data);
            if(head == null)
            {
                head = temp;
                size++;
            }
            else{
                tail.next=temp;
                size++;
             }
              tail = temp;
        }
        void insertAthead(int value )
        { Node t = new Node(value);
            if(head==null)
            {
                insertAtEn(value);
                size++;
            }
            else{
                t.next=head;
                head = t;
                size++;
            }

        }
        void insertAtindex(int idx,int value){
            Node t = new Node(value);
            Node temp = head;
            if(idx==0)  // its mean insert at head.....
            {
              t.next =head;
                head = t;
                size++;
                return;
            }
            if(idx==size)  // its mean insert at end.......
            {
                tail.next=t;
                t = tail;
                size++;
                return;
            }
            for(int i=0;i<idx-1;i++)  // 0,1,2,3,4,5,6
        {
                   temp= temp .next;
        }
               t.next = temp.next;  
               temp.next= t;
               size++;

        }
        void dis()
        {
            Node temp = head;
            while (temp!=null) {
                System.out.println(temp.data +" ");
                temp = temp.next;
                
            }
        }
    
        public static void main(String[] args) {
                List_b obj = new List_b();
                obj.insertAtEn(34);
                obj.insertAtEn(36);
                obj.insertAtEn(35);
                obj.insertAtEn(37);
                obj.insertAtEn(3);
                obj.insertAthead(45);
                obj.insertAtindex(3, 78);
                obj.dis();
                System.out.println("size of the array " +obj.size);
        }
    }
}
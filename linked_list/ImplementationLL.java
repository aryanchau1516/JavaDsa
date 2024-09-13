package linked_list;

public class ImplementationLL {
    public static class  Node     // this is a inner class 
     {
        
       int data;
       Node next;  // reference of node....x
               Node(int data )
        {
            this.data = data;
        }
    
    
    }
    public static class linked_listl {               
        Node head = null;
        Node tail = null;
    void insertAtEnd(int value)
    {
        Node temp = new Node(value) ;
        if (head== null) {
            head = temp;
           
        }
        else {
            tail.next= temp;
              }
              tail=temp;
     
    }
    void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp= temp.next;
        }
    }

        public static void main(String[] args) {
            linked_listl objll = new linked_listl();
            objll.insertAtEnd(2);
            objll.insertAtEnd(9);
            objll.display();
        }
    }
}

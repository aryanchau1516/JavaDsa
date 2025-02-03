package linked_list;

public class LinkedList_4 {
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
            } 
            Node head=null;
            Node tail=null;
            void insertAtEnd(int data){
                Node temp = new Node(data);
                if(head==null){
                    head=temp;
                    tail=temp;
                }
                else{
                    tail.next=temp;
                    tail=temp;
                }
            }

           
            void deleteAtEnd() {
                if (head == null) {  // Empty list
                    System.out.println("List is empty");
                    return;
                }
        
               else if (head.next == null) {  // Only one node present
                    head = null;
                    return;
                }
        
               else{ Node temp = head;
                while (temp.next.next != null) {  // Reach second last node
                    temp = temp.next;
                }
                temp.next = null;  // Remove last node
            }}
        

        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }


    public static void main(String[] args) {
        LinkedList_4 obj = new LinkedList_4();
        obj.insertAtEnd(0);
        // obj.insertAtEnd(1);
        // obj.insertAtEnd(2);
        // obj.insertAtEnd(3);
        // obj.insertAtEnd(4);
        obj.deleteAtEnd();
        System.out.println(obj.head.data);
        obj.display();
    }
    
}

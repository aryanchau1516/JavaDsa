package linked_list;

import pattern.he;
// this is for insert AtHead 
/*
 *  // Step 1: Create a new node
        // Step 2: Point newNode's next to current head
          // Step 3: Update head to newNode
 */
public class LinkedList_2 {

        public class Node {
            int data ;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
            Node head = null;
            Node tail = null;
      

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

            void insertAtHead(int data){
                Node temp = new Node(data);
                if(head==null){
                    head = temp;
                    tail=temp;
                }
                else{
                    temp.next=head;
                    head=temp;
                }

            }

            void display(){
                Node temp = head;
                while (temp!=null) {
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                    
                }
            }
        
            
      





    public static void main(String[] args) {
        LinkedList_2 obj = new LinkedList_2();
        obj.insertAtEnd(1);
        obj.insertAtEnd(3);
        obj.insertAtEnd(6);
        obj.insertAtHead(0);
        obj.display();
    }
}

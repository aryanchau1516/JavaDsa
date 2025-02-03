package linked_list;


   

// this is for insert At end
    public class LinkedList_1 {
        public class Node {
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
         
        }
             Node head= null;
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

             Node insertAtEnd(Node head,int  x) {   // on gfg
                Node temp = new Node(x);
                Node tail = head;
                if(head!=null){
                      while(tail.next!=null){
                          tail=tail.next;
                      }
                      tail.next = temp;
                      temp.next=null;
                      return head;
                }
                else{
                    return temp;
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
                LinkedList_1 obj = new LinkedList_1();
             obj.insertAtEnd(1);
             obj.insertAtEnd(2);
             obj.insertAtEnd(3);
             obj.display();
            }
        
    }



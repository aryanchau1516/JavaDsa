package linked_list;

import linked_list.Basic.Node;

public class Nth {
    public  static class Node {
        int data;
        Node next;
        Node(int data )
        {
            this.data = data;
        }
    }
    public static class InnerNnthnode {
        Node head = null;
        Node tail = null;
        void insertAteend(int data)
        {
            Node temp = new Node(data);
            if(head==null){
                head = temp;
                tail= temp;
            }
            else{
                    tail.next = temp;
                    tail = temp;
            }
            
        }
    void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    /*
     * Nth node from the end (in one traveesal )
     */

            public static Node nthNodee(Node head ,int n)
            {
                Node slow = head;
                Node fast = head;
                for(int i=1;i<=n;i++){            
                    fast = fast.next;
                            }

                   while (fast.next!=null) {
                    fast = fast.next;
                    slow = slow.next;
                    
                   }         
                    return slow;    
                        }

        public static void main(String[] args) {
            InnerNnthnode obj = new InnerNnthnode();
            obj.insertAteend(89);
            obj.insertAteend(90);
            obj.insertAteend(91);
            obj.insertAteend(92);
            obj.insertAteend(93);
            obj.insertAteend(94);
            obj.insertAteend(87);
           
            obj.display();
        }
    
    
}
    
}

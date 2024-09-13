package linked_list;



public class LineList1 {
    public static class Node {
        int data; 
        Node next;
        
        Node(int data)
        {
            this.data = data;
        }
    
        
    }
    public static class  linked {
        Node head = null;
        Node tail = null;
        int size=0;
        void insertAtEnd(int value)
        {
            Node temp=  new Node(value);
            if(head==null)
            {
                head = temp;
                size++;
            } 
            else{
                tail.next=temp;
                size++;
            }
            tail= temp;
        }
        void insertAtHead(int value)
        { Node temp = new Node(value);
           
            if(head==null)
            {  // or ......
                //insertAtEnd(value); we can use this method bcz list is empty
                head = temp;
                tail= temp;
                size++;
            } 
            else{
                temp.next= head;
                head = temp;
                size++;
            }
        }
        void insertAt(int idx,int value)
        {
            Node t = new Node(value);
            Node temp = head;
            if(idx==0)
            {
               insertAtHead(value); 
               return;
            }
            if(idx==size)  // when idx and size are equal then we call the insertAtEnd() func bczz we want to tail ,neaxt point to null pointer
            {
                insertAtEnd(value);
                return;
            }
            for(int i =1;i<idx-1;i++)
            {
                temp = temp.next;  // reachind the idx-1 index 
            }
            t.next = temp.next;  
            temp.next= t;
            size++;
        }

        int getData(int idx)
        {
          
            Node temp = head;
            for(int i =1;i<=idx;i++)
            {
                temp= temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx)
        {
            Node temp = head;
            for(int i =1;i<=idx-1;i++)
            {
                temp= temp.next ; // we use for this removin

            }
            temp.next= temp.next.next ;  // temp.next -> 
            size--;
        }
        void display()
        {
            Node temp = head;
            while (temp!=null) {
                System.out.println(temp.data+" ");
                temp = temp.next;
                
            }
        }
// find elemnet of linked list....
// its print middle ele when liist is odd ....
// its print middle right ele when list is even ...
              void midele()
            { 
                Node slow= head;
                Node fast = head;
                while (fast.next!=null&&fast.next.next!=null) {
                    fast = fast.next.next;
                    slow = slow.next;
                }
                System.out.println(slow.data);
                
            }
            void middleleft()
            {
                Node fast = head;
                Node slow = head;
                while (fast.next.next!=null) 
                    {
                        slow= slow.next;
                        fast=fast.next.next;
                        
                    }
                    System.out.println(slow.next.data);
                    
                }
            void delmiddle()
            {
                Node fast = head;
                Node slow = head;
                while(fast.next!=null&&fast.next.next!=null){
                    fast = fast.next.next.next;
                    slow = slow.next;
                }
                slow.next = slow.next.next;
                size--;
            }


        public static void main(String[] args) {
            linked obj = new linked();
            
           obj. insertAtEnd(45);
           obj. insertAtEnd(46);   
           obj. insertAtEnd(47);
           obj.insertAtHead(10);
           obj. insertAtEnd(48);
           obj. insertAtEnd(68);
           obj. insertAtEnd(58);
        //    obj.insertAt(0, 100);
           
          obj.insertAt(3, 67);
           obj.display();
           System.out.println();
        //    obj.deleteAt(2);
        //    System.out.println("siz of the list : ");
        //    System.out.println(obj.size);
        //    obj.display();
        //    System.out.println("siz of the list : ");
        //    System.out.println(obj.size);
        //    System.out.println(obj.getData(2));
        obj.middleleft();
        obj.delmiddle();
        System.out.println();
        obj.display();
        }
    
        
    }
}

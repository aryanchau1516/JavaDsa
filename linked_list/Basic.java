package linked_list;

public class Basic {
    public static class Node {
        int data;  // for data
        Node next; // for address/reference
        Node(int data)
        {
            this.data= data;
        }
        }   
    // function of display list
    public static void display(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
            
        }

    }

    // using recursion call
    public static void displayrec(Node head){
       if(head==null)
       return;
      System.out.print(head.data+" ");      
       displayrec(head.next);
    }

    // reverse print using recursion........
    public static void displayrev(Node head)
    {
        if(head == null)
        return;
        displayrev(head.next);
        System.out.print(head.data+" ");
    }
    
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
         public static Node deLnth(Node head ,int n)
         {
            Node slow = head;
            Node fast = head;
            for(int i=1;i<=n;i++){            
                fast = fast.next;
                        }
                if(fast==null)     // when n = end se last node then fast point to null then we delete head node
                {
                    head = head.next;
                    return head;
                }
               while (fast.next!=null) {
                fast = fast.next;
                slow = slow.next;
                
               } 
               slow.next = slow.next.next;        
                return head;    
                    
         }
           // find middle elment of LL
           

    public static void main(String[] args) {
       Node a = new Node(2) ;
       Node b = new Node(4) ;
       Node c = new Node(6) ;
       Node d= new Node(8) ;
       Node e = new Node(10) ;
    //    System.out.println(a.data);  // 2
    //    System.out.println(a.next);  // null
    //    System.out.println(b.next);  // null
       a.next = b ; // pointing in the data of b is in the addres of a = a.next.data = 4  and
                    // a.next = address of b =  //  $Node@2ff4acd0  =    $Node@2ff4acd0
       b.next = c ;
       c.next = d ;
       d.next = e ;
    //    System.out.println(e.data);  // 10
    //    System.out.println(e.next);  // null
    //    System.out.println(a);//$Node@279f2327
    //    System.out.println(a.next);    //  $Node@2ff4acd0
    //    System.out.println(b);   // $Node@2ff4acd0

    //    // displaying singly lined list...

    //    Node temp = a;
    //    while (temp!=null) {
    //     System.out.print(temp.data +" ");
    //     temp=temp.next;
        
    //    }
    //    System.out.println();
    //     display(a);
    //     System.out.println();
    //     displayrec(a);
    //    System.out.println();
    //    displayrev(a); 
   // Basic obj = new Basic();
   //Node temp = nthNodee(a, 03);  // nth node from end in one traversal
  // System.out.println(temp.data);
  displayrec(a);
  System.out.println();
 a = deLnth(a, 5)   ;  // delnth node from end
   display(a);
    }
}

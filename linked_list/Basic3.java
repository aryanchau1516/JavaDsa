package linked_list;

public class Basic3 {
    public static class Node {
        int data ;
        Node next;
        Node(int data ){
            this.data = data;
        }
      }

      public static void display(Node head)
      {
        while (head!=null) {
            System.out.println(head.data);
            head = head.next;
            
        }
      }
    public static void main(String[] args) {
        Node a = new Node(34);
        Node b = new Node(35);
        Node c = new Node(36);
        Node d = new Node(37);
        Node e = new Node(38);
        Node f = new Node(39);
        a.next= b;
        b.next = c ;           
       c.next = d ;
       d.next = e ;
       e.next = f;
       f.next = null;
       display(a);
    }
}

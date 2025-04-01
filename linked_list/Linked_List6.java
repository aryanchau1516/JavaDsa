package linked_list;

import pattern.he;

public class Linked_List6 {
    public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
      Node head=null;
      Node tail=null;
      void addFirst(int data)  {
        Node temp = new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }
        temp.next=head;
        head=temp;
      }
      void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
                return;
            }
                tail.next=temp;
                tail=temp;            
      }
      void insertAtIdx(int idx,int data){
       Node newNode=new Node(data);
        Node temp = head;
        if(idx==0){
            addFirst(data);
            return;
        }
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
      }
      void removeFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            return;
        }
        head = head.next;
        
      }
      int removeFirst2(){
        if(head==null){
            return -1;
        }
        int removeEle = head.data;
       if(head.next==null){
        head=null;
        tail=null;
        return removeEle;
       }
        head=head.next;
        return removeEle;
      }
      void removeLast(){
        Node temp = head;
        if(head==null){ // if list is empty
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){ // if only one ele left
            head=null;
            tail=null;
            return;
        }
       
        while (temp.next.next!=null) {
          temp=temp.next;
        }
        temp.next=null;
        tail=temp;
      }
      int removeeLast2(){
        if (head==null) {
            return -1;
        }
        else if(head.next==null){
            int val = head.data;
            head=tail=null;
            return val;
        }
        Node temp = head;
        
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        int vAL = temp.next.data;
        temp.next=null;
        tail = temp;
        return vAL;
    }
    int searchEle(int key){
        Node temp = head;
        int i=0;

        while (temp.data==key) {
            temp=temp.next;
            i++;
             }
             return i;
         }
         void removeNthEnd(int n){
            if(head==null){
                System.out.println("linked list is empty");
            }
            int sz=0;
            Node temp = head;
            while (temp!=null) {
                temp= temp.next;
                sz++;
            }
            if(sz==n){ // it means first postion
                head = head.next;
                return;
            }
            int i =1;
            Node prev1 = head;
           // System.out.println(sz-n);
            while (i<sz-n) {
                prev1=prev1.next;
              // System.out.println(prev1.data);
               i++;
              // System.out.println(i);
            }
           prev1.next=prev1.next.next; // this delete the nth node 
            return;
            
         }

         int middleNode() {
            if (head == null) {
               System.out.println("linked list s empty");
            }
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;       // Move slow pointer by 1 step
                fast = fast.next.next;  // Move fast pointer by 2 steps
            }
            return slow.data;  // slow is now pointing to the middle node
        }

        boolean deleteCycle(){

            Node slow = head;
            Node fast = head;
            while (fast!=null&&fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast){ // ll have cycle
                    return true; 
                }
            }
            return false;
        }
        
      void display1(){
        Node temp=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
            // if(temp==null){
            //     System.out.println(temp);
            // }
        }
      }
   
public static void main(String[] args) {
    Linked_List6 obj = new Linked_List6();
   obj.addFirst(23);
     obj.addFirst(3);
     obj.addFirst(223);
    obj.insertAtEnd(78);
    obj.insertAtEnd(780);
     obj.insertAtIdx(2,34);
     //obj.insertAtIdx(0, 89);
     obj.display1();
     System.out.println();
   //System.out.println( obj.removeFirst2());
     //obj.removeLast();
    //  System.out.println(obj.removeeLast2());
    //  System.out.println(obj.searchEle(23));
   // obj.removeNthEnd(3);
   System.out.println(obj.middleNode());
   obj.display1();
}    
}

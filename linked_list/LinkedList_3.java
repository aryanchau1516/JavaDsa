package linked_list;

import pattern.he;

// this is for insert a node at a given position
public class LinkedList_3 {
    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head = null;
    Node tail = null;
    int count =0;
    void insertAtEnd(int data){
        Node temp = new Node(data);
      if(head==null){
        head = temp;
        tail = temp;
        count++;
      }
      else{
            tail.next=temp;
            tail=temp;
            count++;
      }

    }
    void insertAtHead(int data){
        Node temp = new Node(data);
        if (head==null) {
            head = temp;
            tail=temp;
            count++;
        }
        else{
            temp.next=head;
            head = temp;
            count++;
        }
    }


   

    void insertAtIndex(int data, int index){
        Node t = new Node(data);
        Node temp = head;
        if(index==count){
            insertAtEnd(data);
            return;
        }
        if(index==0){
            insertAtHead(data);
            return;
        }
        else{
            for(int i=1;i<=index-1;i++){
            temp = temp.next;  // going to 2 nd position
            //System.out.println(temp.data);
        }
       
        t.next=temp.next;
        temp.next=t;
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
        LinkedList_3 obj = new LinkedList_3();
        obj.insertAtEnd(1);
        obj.insertAtEnd(2);
        obj.insertAtHead(0);
        obj.insertAtEnd(3);
        obj.insertAtEnd(4);
        obj.insertAtIndex(6, 2);
       // System.out.println(obj.tail.next);
        obj.display();
    }
}

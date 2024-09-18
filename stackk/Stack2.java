// stack impementation using linked ;list

import pattern.he;

public class Stack2 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        static class InnerStack2 {
            static Node head = null;

            public static boolean isEmpty() {
                return head == null;
            }

            // push
            public static void push(int data) {
                Node newNode = new Node(data);
                if (isEmpty()) {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;

            }

            // pop
            public static int pop() {
                if (isEmpty()) {
                    return -1; // means stack is empty

                }
                int top = head.data;
                head = head.next;
                return top;
            }

            // peek
            public static int peek() {
                if (isEmpty()) {
                    return -1;

                }
                return head.data;
            }

        }

        public static void main(String[] args) {
            InnerStack2 obj = new InnerStack2();
            obj.push(2);
            obj.push(22);
            obj.push(4);
            obj.push(5);
            while (!obj.isEmpty()) {
                System.out.println(obj.peek());
                obj.pop();

                
            }
            obj.peek();
        }

    }
}

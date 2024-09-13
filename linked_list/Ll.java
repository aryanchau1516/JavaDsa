package linked;

public class Ll {
    @SuppressWarnings("unused")
    private Node head;
    @SuppressWarnings("unused")
    private Node tail;

    @SuppressWarnings("unused")
    private int size;
    public Ll(){
        this.size=0;
    }
}
    class  Node {
        @SuppressWarnings("unused")
        private int value;
        @SuppressWarnings("unused")
        private Node next;
    public Node(int value)
    {
        this.value=value;

    }
    public Node(int value,Node next)
    {
        this.value=value;
        this.next=next;

    }
    
        
    }
    


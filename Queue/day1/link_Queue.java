class link_Queue{
    static class Node{
        int data;
        Node next;
        Node prev;

        Node (int val){
            this.data=val;
            this.next= null;
            this.prev = null;

        }
     }
     
    static Node rear;
    static Node front;
     public static void enqueue(int  val){
        Node newnode = new Node(val);
        if(rear==null){
            rear=front=newnode;
            return;
        }
        
     }
    public static void main(String[] args) {
        
    }
}
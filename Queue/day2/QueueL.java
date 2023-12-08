// package Queue.day2;

public class QueueL {

    static class Node{
        int data;
        Node next;
        Node(){}

        Node(int data){
            this.data=data;
            this.next = null;

        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static  boolean isEmpty(){
            return tail==null && head ==null;
        }
        public static  void add(int data){
          
            Node newnode = new Node(data);

            if(isEmpty()){
                tail= head = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;


        } 
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }
            if(head==tail){
                int value = head.data;
                head=tail=null;
                return value;
            }

            int val = head.data;
            head=head.next;
            return val;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }

            int val = head.data;
            return val;


        }
        public static void display(){
            Node temp = head;

            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return ;

            }
         
         
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

       



    }

    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(0);
       System.out.println( q.remove());
       q.display();
    }
    
    
    
}

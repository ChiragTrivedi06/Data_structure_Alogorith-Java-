public class stackll {

    class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data =data;
            this.next=null;

        }
    }
    Node head=null;

    public boolean isEmpty(){
        
        while(head!=null){
            return false;
        }
        return true;
    }

    public void push(int val){


        Node newnode = new Node(val);
        if(head==null){
            head =newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        return;

        
    }
    public int pop(){
           
        if(isEmpty()){
            System.out.println("list is  empty.");
            return Integer.MAX_VALUE;

        }
    
        int val=head.data;
        head=head.next;
        return val;


    }
    public int  peek(){

        if(isEmpty()){
            System.out.println("list is  empty.");
            return Integer.MAX_VALUE;

        }
        int val= head.data;
        return val;

    }
    public void printll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
   

    public static void main(String args[]){
        stackll  ll = new stackll();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        System.out.println(ll.pop());
        // System.out.println(ll.pop());
        // System.out.println(ll.pop());
        System.out.println(ll.isEmpty());
      //  System.out.println(ll.pop());
        System.out.println(ll.peek());
        ll.printll();


    }
    
}

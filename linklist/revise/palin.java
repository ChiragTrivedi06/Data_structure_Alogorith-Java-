public class palin {
    class Node{
        int data;
        Node  next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head=null;

    public void insert(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;

        }
        node.next=head;
        head=node;
        return;
        

    }
    public  void print(){
        Node temp=head;
         while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
         }
         System.out.println("null");
    }
    public  Node  findmid(){
        Node slow = head;
        Node  fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
         return slow;
    }
    public boolean checkpalindrome(){
        Node slow =head;
        Node fast =head;

        while(fast!=null  && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node curr=slow;
        Node prev= null;
        Node nex ;
         while(curr!=null){

            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;



         }
         Node tail=prev;
         Node left=head;
         
        while( left.next.next!=null || tail.next!=null){

               if(left.data!=tail.data){
                    return false;
                }
                left=left.next;
                tail=tail.next;

          }
          return true;

    }



    public static boolean checkCycle(){
        Node fast = head;
        Node  slow = head;
         while(fast !=null && fast.next !=null){

            slow=slow.next;
            fast=fast.next.next;
             if(slow==fast){
                return true;
            }
         }
         return false;
    }

    public void c
    public static void main(String args[]){
        palin ll= new palin();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.print();
        // System.out.println(ll.checkpalindrome());
          
        //   Node head=new Node(1);
        //  head.next =new Node (2);
        //  head.next.next=new Node (3);
        //  head.next.next.next=new Node (4);
        //  head.next.next.next.next=head;
        /// ll.print();

       // System.out.println(checkCycle());




    }
    
}

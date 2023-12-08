import  java.util.LinkedList;
// import java.util.Stack;

public class checkPalindrome {

    // public static boolean isPalindrome(LinkedList ll){
        




      
        

    // }



    // public static void main(String args[]){

    //     LinkedList<Character> ll = new LinkedList<>();
        

    //     ll.push('a');
    //     ll.push('b');
    //     ll.push('c');
    //     ll.push('b');
    //     ll.push('a');

    //     System.out.println(ll);
 
    // } 


    
    class Node{
        char data;
        Node  next;
        Node(char data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head=null;

    public void insert(char data){
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
         System.out.println();
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
         

        while( left!=null || tail.next!=null){

               if(left.data!=tail.data){
                    return false;
                }
                left=left.next;
                tail=tail.next;

          }
          return true;

    }



    // public static boolean checkCycle(){
    //     Node fast = head;
    //     Node  slow = head;
    //      while(fast !=null && fast.next !=null){

    //         slow=slow.next;
    //         fast=fast.next.next;
    //          if(slow==fast){
    //             return true;
    //         }
    //      }
    //      return false;
    // }

 
    public static void main(String args[]){
        checkPalindrome ll= new checkPalindrome();
        ll.insert('a');
        ll.insert('b');
        ll.insert('c');
       ll.insert('d');
         ll.insert('d');
        ll.insert('b');
        ll.insert('a');
        ll.print();
        System.out.println(ll.checkpalindrome());
          
        //   Node head=new Node(1);
        //  head.next =new Node (2);
        //  head.next.next=new Node (3);
        //  head.next.next.next=new Node (4);
        //  head.next.next.next.next=head;
        /// ll.print();

       // System.out.println(checkCycle());




    }
    
}

    





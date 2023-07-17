import javax.sound.sampled.SourceDataLine;

public class stackL {
    static public class Node{
        int data;
        Node next;
        Node(int value){
            data=value;
            next=null;
        }
    }
    
   static  class StackB{


    static Node head ;
        public  static void push(int value){
            Node newnode = new Node(value) ;
            if(head==null){
                 return;
            }
         

            newnode.next=head;
            head = newnode;
        }
        public static void print(){
            Node temp=head;
            while(temp==null){

                System.out.println(temp.data);
            }

        }
       



    }

    public static void main(String[] args) {
        System.out.println("hello");
        StackB s=new StackB();
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.print(); 
        System.out.print(head);
        System.out.print(head);


    }
    
}

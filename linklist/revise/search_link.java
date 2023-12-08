public class search_link {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  Node head;
    int size=0;
    public static Node tail;
    public void insert(int data){

        Node newNode=new Node(data);
        size++;
 
        if(head==null){
            head = tail = newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
    }

    public int search(int key){
        if(size==0){
            System.out.println("ll isempty");
            return -1;
        }
        Node temp=head;
        int k=0;  // initial to track index value
        while(temp!=null){
            if(temp.data ==key){
                return k+1;
            }
            k++;
            temp=temp.next;
           

            
        }
        return -1;

    }
    public int size(){
        Node  temp=head;
        int s=1;
        while(temp.next!=null){
            temp=temp.next;
            s++;

        }
        return s;

    }
    // public int rec_search(int key ,int loc){
    //     if(head==null){
    //         return -1;

    //     }
        
    //     if(head.data==key){
    //         return loc;

    //     }
    //     rec_search(key,loc);

    // }
    public void reverse(){
        Node curr=head;
        Node prev =tail= null;
        Node nxt;
        while(curr!=null){
           nxt= curr.next;
           curr.next=prev;
           prev=curr;
           curr=nxt;
        }
        head=prev;


    }
    public void  n_print(int data){
        
        Node temp=head;
        int sz=size();
        int pointer=1;
     
        while(pointer!=sz-data){
            temp=temp.next;
            pointer++;
        }
        temp.next=temp.next.next;


    }



    
    public  void print(){
        Node temp=head;
        if(temp==null){
 
            System.out.println("list is empty");
            return;
        }
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null\n");

    }
    public static void main(String []args){
        search_link ll=new search_link();
        ll.insert(3);
        ll.insert(2);
        ll.insert(1);
        ll.print();
        System.out.println(ll.search(4)+" and "+ll.size);   ///key think in print
        System.out.println(ll.size());
        // ll.reverse();
        // ll.print();

         ll.n_print(2);
        ll.print();
        ll.reverse();
        ll.print();
    }

    
}

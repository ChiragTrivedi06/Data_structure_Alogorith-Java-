//package linklist.revise;

public class linkB1 {


    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  Node head;
    public static  Node tail;
    int size=0;
    
        

    public void insert(int data){

        Node newNode=new Node(data);
        size++;
 
        if(head==null){
            head = newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
    }
    public void insertlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }

        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newNode;

    }
    boolean isempty(){
        return size==0;
    }
    int size(){
        int d=0;
        for(Node i=head;i!=null;i=i.next){
            d++;
        }
        return d;
    }

    public void insertmid(int data,int key){
        
        Node newNode  =new Node(data);


        size++;
        if(head==null ){
            head=newNode;
            return;
        }
        if(key==0){
            insert(data);
            return;
        }

        int k=1;
        Node temp=head;
        while(k <=key-1){
            temp=temp.next;
            k++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
        

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
        linkB1 s = new linkB1();
        System.out.println(s.head);
      //  System.out.println(s.tail);
      
       // System.out.println(s.i);
        s.insert(1);
        s.insert(2);  

        // s.insert(3); 
        // s.print(); 
        s.print();
        //System.out.println(s.size());
        System.out.println(s.size);
        // s.insertlast(0);      
        // s.insertlast(-10);  
        // System.out.println(s.size);    
        // s.print();

        s.insertmid(5, 1);
        s.print();

    }
}

    

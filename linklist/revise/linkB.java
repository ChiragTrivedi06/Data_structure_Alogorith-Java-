//package linklist.revise;


 class linkB {
    
    
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
    public void insertlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        //Method 1
        // Node temp =head;
        // while(temp.next!=null){
        //     temp=temp.next;


        // }
        // tail=newNode;
        // temp.next=newNode;

        // Method 2

        tail.next=newNode;
        tail=newNode;

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
       
       if(key==0){
           insert(data);
           return;
       }
        Node newNode  =new Node(data);


        size++;
        if(head==null){
            head= tail = newNode;
            return;
        }

        int k=1;
        Node temp=head;
        while(k !=key-1){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        

    }
    public int removefirst(){
        if(isempty()){
            System.out.println("list is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int t=head.data;
        head=head.next;
        return t;
        
        

    }
    public int removelast(){
        
        if(isempty()){
            System.out.println("list is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int t=temp.next.data;
        tail=temp;
        size--;
        return t;
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
        linkB s = new linkB();
        // s.insert(1);          
        // s.insert(2);          //2->1->null

        s.insert(3); 
        // s.print(); 
        s.print();
        //System.out.println(s.size());
        // System.out.println(s.size);
        // s.insertlast(0);      
        // s.insertlast(-10);  
        // System.out.println(s.size);    
        // s.print();

        // s.insertmid(5, 2);
        // s.print();
        // System.out.println(s.tail.data);
        // s.insertlast(6);
        // s.print();
        //  System.out.println(s.tail.data);
        //  System.out.println(s.size);
        // System.out.println(s.size()); 
       
       
    //    operation after remove first
        System.out.println(s.removelast());

        s.print();



 

    }
}

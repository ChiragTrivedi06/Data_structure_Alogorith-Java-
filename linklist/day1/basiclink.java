/// /package dsa.linklist.day1;
class basiclink{


    public  static class  Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }

    public static Node head;
    public static Node tail;
    // static Node a;
     public static int size;


    //method 

    public void  addfirst(int data){
        //step1:create newnode
        Node newnode = new Node(data);
        size++;

        if(head==null){
            head  = tail =newnode;
            return ;

        }
  

        //head
        newnode.next=head;

        //change of head
        head=newnode;
     }

    public void addlast(int data){
        Node newnode =new Node(data);
        size++;

        if(head==null){
            head =  tail = newnode;
            return ;

        }



        // for(Node i=head;i!=null;i=i.next){
        //     if(i.next==null){
        //         i.next=newnode;
        //         newnode.next=null;
                
        //     }
            
        // }
        
        
        // tail.next=newnode;

        // tail=newnode;

    }

     public void addmiddle(int index,int data){
   

   
        if(index==0){
            addfirst(data);
            return;
        }  
       Node newnode = new Node(data);
       size++;

       
        if(head==null){
            tail=head=newnode;
            return;
        }
        
        Node temp = head;
        int i=0;

        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next = newnode;
        



     }
     public static void addmid(int key,int data){
        Node newnode= new Node(data);

        if(head==null){
            head=tail=newnode;
            return;
        }
        Node temp = head;
        while(temp.next.data!=key){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("key not found.");
            return;
    
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public static void  size(){
     
        int i=0;

        for(Node temp= head ;temp!=null;temp=temp.next){
            i++;
        }
        System.out.println(i);

    }

     static void rem_first(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head.next;
        head.next=null;
        head=temp;
        size--;
        

    }

    public  void rem_last(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }

    public static int search(int key){
        if(head==null){
            System.out.println("list is empty.");
        }

        Node temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==key){
                return index;
            }
            index++;
            temp=temp.next;
        }
        return -1;
    }


    // public static void rec_search(int key){

    // }

    public void reverse(){
        Node prev=null;
        Node curr= tail=head;
        Node Next;

        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;

        }

        head=prev;


    }

    public int  delnth_end(int  n){
        
        //size
        int sz=0;
        Node temp = head;
        while( temp !=  null){
            sz++;
            temp=temp.next;
        }
     
     //   System.out.println(temp);  ////for self cheak the value of temp that is we declare new refrence variable p
       
     Node p=head;
        int i=1;
        while( i!=sz-n){
             p=p.next;
             i++;
        }
        int val=p.next.data;
        p.next=p.next.next;

        return val;
        
    }


    //find mid 

    public Node findmid( Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //palindrome

    public boolean checkPalindrome(){
        if(head==null || head.next == null){
            return true;
        }

        //find mid  node

        Node midNode=findmid(head);

        //reverse second half


        Node prev=null;
        Node curr=midNode;
        Node Next;

        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        Node righthead=prev;
        Node lefthead=head;

        //traverse

        while(righthead!=null){

            if(lefthead.data!=righthead.data){
                return false;
            }
            righthead=righthead.next;
            lefthead=lefthead.next;
            

        }
       return true;

    }

    public boolean isCyclic(){
        Node fast=head;
        Node slow=head;

        while(fast!=null  && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }


    

    public static void printlist(){

        if(head==null){
            System.out.println("list is empty.");
            return;
        }
        
       

        for(  Node temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+"->");
        }
        System.out.println("null");
        
    }



    public static void main(String args[]) {
         basiclink ll=new basiclink();
      //   System.out.println(size);  ///initial  size =0;
   


        //  System.out.println(head);
       
        //  System.out.println(a);
        // ll.head=new Node(5);
        // ll.head.next=new Node(2);
        // printlist(ll);



        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(2);
        ll.addlast(1);
    

        printlist();
        // ll.addlast(600);
        // printlist();
        // size();
        System.out.println(size);

        ll.addmiddle(2, 9);
        printlist();

   

        // printlist();
        // // size();
        // System.out.println(ll.size);
        // ll.addmid(9, 5);
        // printlist();
        // size();

        // rem_first();
        // printlist();
        // ll.rem_last();
        // printlist();
        //  System.out.println(search(2));
        //  ll.reverse();
        //  printlist();

        // ll.reverse();
        //  printlist();

    //    System.out.println(ll.delnth_end(3)); 
    //     printlist();
      Node p=ll.findmid(head);
      System.out.println(p.data); 

      System.out.println(ll.checkPalindrome());
       
      printlist();


      System.out.println(ll.isCyclic());
     

    }

}
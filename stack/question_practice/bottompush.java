//package stack.question_practice;

import java.util.Stack;

public class bottompush {

    class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data =data;
            this.next=null;

        }
    }
    static Node head=null;
    public static  boolean isEmpty(){
        
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

    public void pushbottom(bottompush s,int val){
        
        if(isEmpty()){
           
            s.push(val);
             return ;
        }

        int top = s.pop();
        pushbottom(s,val);
        s.push(top);
        


    }

    public static void reversestack(bottompush s){
        // // Stack s = new Stack<>();
        // bottompush s = new bottompush();
        //  int val=0;
        //  while(!isEmpty()){
        //      val = ll.pop();
        //     s.push(val);

        //  }

        //  return s;

        if(isEmpty()){
            return;
        }
        int val = s.pop();
        reversestack(s);
        s.pushbottom(s,val);


   


    }
    public void printll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
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


    public static String reversestring(String str){
        Stack <Character> s = new Stack<>();
        int index=0;

        while(index < str.length()){
            s.push(str.charAt(index));
            index++;
        }



        StringBuilder  result = new StringBuilder("");
        while(!s.isEmpty()){
            char val = s.pop();
            result.append(val);
        }

        String str1 = result.toString();
        return str1;

    }
    public static void main(String[] args) {
         bottompush  ll = new bottompush();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.printll();
        ll.reversestack(ll);
        ll.printll();
        
        System.out.println(ll.pop());
        // ll.pushbottom(ll,4);
        // ll.printll();

        // String str = "Chirag";
        // System.out.println(reversestring(str));

    }
    
}

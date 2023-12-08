// package Queue.day3;

import java.util.Stack;

public class QueueS {

   static class Queue{
    static Stack <Integer>s1 = new Stack<>();
    static Stack <Integer>s2 = new Stack<>();

    // add - O(n)
    public static void add(int data){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

    }

    // remove - O(1)
    public static int  remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return s1.pop();
    }

    // peek - O(1)
    public static int  peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return s1.peek();
    }
    public static void Print(){
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
            
        }
    }



 }
    public static void main(String args[]){
        // System.out.println("hello world.");
         Queue q = new Queue();
         q.add(1);
         System.out.println(q.s1);
         q.add(2);
         q.add(3);
         System.out.println(q.s1);
        //  q.Print();
        System.out.println(q.remove()); 
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());

    }
    
}

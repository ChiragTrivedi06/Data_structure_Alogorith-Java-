//package Queue.day1;

import java.util.ArrayList;


public class basicQueue {
    
    static class Queue{
        ArrayList<Integer> ll= new ArrayList<>();

        public void insert(int data){
            ll.add(data);

        }
        public int remove(){
            if(ll.size()==0){
                System.out.println("Queue is empty");
                return Integer.MAX_VALUE;
            }

            int key = ll.get(0);
            ll.remove(0);
            return key;
        }
        

    
    public int peek(){

            if(ll.size()==0){
                System.out.println("Queue is empty");
                return Integer.MAX_VALUE;
            }
            int key = ll.get(0);
            return key;
    }
    public void print(){
        if(ll.size()==0){
            System.out.println("list is empty");
            return;
        }
        int i=0;
        while(i<ll.size()){
            System.out.print(ll.get(i)+" ");
            i++;
        }
        System.out.println();
    }
    public void printlist(){
          if(ll.size()==0){
            System.out.println("list is empty");
            return;

        }
        System.out.println(ll);

    }
}

    public static void main(String args[]){
        Queue Q = new Queue();
        Q.insert(1);
        Q.insert(2);
        Q.insert(3);
        Q.insert(4);
        System.out.println(Q.remove());
        System.out.println(Q.peek());
        Q.print();
        Q.printlist();


        

        
    }
    
}

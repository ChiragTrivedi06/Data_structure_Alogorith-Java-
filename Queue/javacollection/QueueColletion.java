// import java.util.ArrayDeque;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class QueueColletion{

    public static void reverse(Queue <Integer> q){

        Stack <Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.peek());
            q.remove();
            
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        

    }
    // Queue is interface in java not class.
    // Queue is implement with LinkedList class and ArrayDeque
    public static void main(String args[]){
        Queue <Integer> ll= new LinkedList<>();
        ll.add(1);        
        ll.add(2);        
        ll.add(3);        
        ll.add(4);
        ll.add(5);
        System.out.println(ll);  
        reverse(ll);
        System.out.println(ll);

        // System.out.println(ll.peek());  
       
        // System.out.println( ll.remove());
        // System.out.println(ll);
        // while(!ll.isEmpty()){
        //     System.out.print(ll.peek()+"->");
        //     ll.remove();
        // }
        // System.out.print("null");

        // LinkedList<String> ll;
        // ll = new LinkedList<>();
        // ll.add("Chirag");
        // ll.add("1");
        // ll.add("Ram");
        // ll.add("Vijay");
        // ll.add("Anushka");
        // System.out.println(ll);

        // Stack <Character> s = new Stack<>();
        // s.add('A');
        // s.add('N');
        // s.add('U');
        // s.add('S');
        // s.add('H');
        // s.add('K');
        // s.add('A');
        // System.out.println(s);


        // ArrayList <Double> l = new ArrayList<>();
        // l.add(1.2);
        // l.add(3.2);
        // l.add(63.);
        // l.add(5.);
        // System.out.println(l);



            
        

    }

}
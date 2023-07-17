 //package stack;

import java.util.ArrayList;

 
class StackB{
     static class stack{
         static ArrayList <Integer> list =new ArrayList<>();

         public static boolean isEmpty(){
            return list.size()==0;
         }

         public static void push(int data){
            list.add(data);
         }
         public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
         }
         public static int peek(){
                
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
         }
         public static void  print(){
            System.out.println(list);
         }
         private static void print1() {
            while(!isEmpty()){
                System.out.println(peek());
                pop();
            }
            
         }
    }
   
    
    public static void main(String[] args) {
        stack o1 = new stack();
        stack o2= new stack();
        // o1.push(11);
        // o1.push(12);
        // o2.push(13);
        // o2.push(14);
        // o1.print();
       System.out.println( o1.peek());

        // o1.print1();
        // o1.print1();
        // o2.print();

    }

    
    
}

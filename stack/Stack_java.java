import java.util.Stack;

class Stack_java{
    public static void print(Stack <Integer> s){

        while(!s.empty()){
            System.out.println(  s.pop());
          
        }
        // return;
     }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(23);
        s.push(35);
        s.push(54);
        // System.out.println(s.pop());
        print(s);
    }
}
import java.util.ArrayList;

class Stackbasic{


    static class list{
        static ArrayList<Integer> ll = new ArrayList<>();
       
        public static void push(int data){

            ll.add(data);
     

        }  
        public boolean isEmpty(){
            
            boolean val = ll.size()==0?true:false;
            return val;

        }
        public int pop(){
            int val = ll.get(ll.size()-1);
            ll.remove(ll.size()-1);
            return val;
        }
        public int peek(){
            int val = ll.get(ll.size()-1);
            return val;
        }

        public void printstack(){
            if(isEmpty()==true){
                System.out.println("stack is empty.");
            }
            int top=ll.size()-1;
            while(top!=-1){
                System.out.print(ll.get(top) +" ");
                top--;
            }
            System.out.println();
        }

    }
     public static void main(String[] args) {
        
      //  System.out.println("hello");
      list ll = new list();
      ll.push(1);
      ll.push(2);
      ll.push(3);

      System.out.println(ll.pop());
    //   System.out.println(ll.pop());
    //   System.out.println(ll.pop());
    //   System.out.println(ll.peek());
      System.out.println(ll.isEmpty());

      ll.printstack();
      //System.out.println(ll.ll);
      System.out.println(ll.ll.size());



    
    }
}
// package Queue.day2;

public class QueueB {
    static  class Queue{
        static int arr[];
        static int size;
        static int rear;

        
        Queue(int n){
            size=n;
            arr = new int[n];
            rear = -1;

        }
        public static boolean isEmpty(){
            return rear == -1;
        }

        public void insert(int val){    //O(1)
            if(rear == size-1){
                System.out.println("Queue is full.");
                return;
            }

            rear++;
            arr[rear] = val;


        }

         // Time complexity = O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;

            }
            int front = arr[0];

            for(int i=0;i<rear;i++){
                arr[i]= arr[i+1];
            }
            rear--;
            return front;

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;

            }
            return arr[0];
        }

        public static void print1(){
            
            if(isEmpty()){
                System.out.println("Queue is empty");
                return ;

            }
            int i=0;
            while(i<=rear){
                System.out.print(arr[i]+" ");
                i++;
            }
        }



    }

    public static void main(String args[]){
        Queue q = new Queue(3);

        q.insert(1);
        q.insert(2);
        q.insert(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.print1();

    }
    
}

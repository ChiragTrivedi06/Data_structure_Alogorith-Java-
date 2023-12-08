// package Queue.day2;

public class QueueC {
    static  class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        
        Queue(int n){
            size=n;
            arr = new int[n];
            rear = -1;
            front = -1;

        }
        public static boolean isEmpty(){
            return rear == -1  && front ==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public void insert(int val){    //O(1)
            if(isFull()){
                System.out.println("Queue is full.");
                return;
            }

            // insert first time.
            if(front ==-1 ){
                front = 0; 
            }

            rear = (rear+1)%size;
            arr[rear] = val;


        }
        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is empty  ");
                return -1;

            }
            

            int val = arr[front];

         


            // last ele remove
            if(front == rear){
                front = rear =-1;
            }
            else{
                   front = (front+1) % size;
            }

            return val;

        }

        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;

            }
            return arr[front];
        }

        //Not working !!!
        // public static void print1(){
            
        //     if(isEmpty()){
        //         System.out.println("Queue is empty");
        //         return ;
        //     }
        //     int i=front;
        //     while(i<=rear){
        //         System.out.print(arr[i]+" ");
        //         i = (i+1)% size;
        //     }
        // }
    }

    public static void main(String args []){
         Queue q = new Queue(3);
         q.insert(1);
         q.insert(2);
         q.insert(3);
         System.out.println(q.peek());
         System.out.println(q.remove());
         q.insert(4);
         System.out.println(q.remove());
         q.insert(5);
         System.out.println(q.remove());
         System.out.println(q.peek());
        q.insert(6);
       //  q.insert(7);
        // q.print1();
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());



        //  while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        //  }
 
    }
}


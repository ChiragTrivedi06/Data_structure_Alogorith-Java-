public class QueueC {

    static class Queue{
        static int arr[];
        static  int size;
        static int front;
        static int rear;
        Queue(int n){
            arr = new int[n];
            size = n;
            front = -1 ;
            rear = -1;
        }
         public static boolean isEmpty(){
            return rear == -1 && front == -1;
         }
         public static boolean isFull(){
            return (rear+1) % size == front;
         }
        public static void   Add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            
            //Add first time
            if(front==-1){
                front=0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;


        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return Integer.MAX_VALUE;
            }
            int result = arr[front];
          
            // last ele
            if(rear==front){
                rear=-1;

                front=-1;
            }
            else{

                front=(front+1)%size;
            }

            return result;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return Integer.MAX_VALUE;
            }

            int result = arr[front];
            return result;

        }

        public static void print(){
           if(isEmpty()){
              System.out.println("Queue is Empty");
              return;
           }
           for(int i=front;i<=rear;i++){
              System.out.print(arr[i]+" ");

              
            }
        
            System.out.println();
        }
    }

    public static void main(String args[]){

        Queue Q = new Queue(3);
        Q.Add(1);
        Q.Add(2);
        Q.Add(3);
        Q.print();
       System.out.println(Q.remove());
       Q.Add(4);
       System.out.println(Q.remove());
       Q.print();





    }
    
}

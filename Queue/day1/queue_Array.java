public class queue_Array {


    static class Queue{
        int array[] = new int [3];

        int rear=-1;
        int front=-1;

        public boolean isEmpty(){
            return  rear==array.length-1;
        }

        public void insert(int data){
            if(isEmpty()){
                System.out.println("array is full");
                return;
            }
            if(rear==-1){
                rear=front=0;
                array[rear]=data;
                return;
            }
            array[++rear]=data;
        }
        public int remove(){
            if(rear==-1 || front== rear){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }

            int val = array[front];
            


        }

        public void print(){
            for(int i=front;i<=rear;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }

    }


    public static void main(String args[]){
        // int array[] = new int[3];
        // System.out.println(array.length);

        Queue q = new Queue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
       // q.insert(4);
        q.print();
        System.out.println(q.rear);

        


    }
    
}

public class QueueB {

    static int arr[];
    static int size;
    static int rear;
    static int front=0;
    QueueB(int n){
        arr=new int [n];
        size= n;
        rear=-1;
    }
    public static boolean isEmpty(){
        return rear==-1;
    }
    public static void Additem(int data){
        if(rear==size-1){
            System.out.println("Queue is full.");
            return;
        }
        rear=rear+1;
        arr[rear]=data;

    }
    public static void print(){
        if(rear==-1){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
      //remove 
     public static int removeitem(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
            return Integer.MAX_VALUE;
        }
        int val=arr[0];
        for(int i=0;i<=rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;

        return val;

     }
    public static void main(String args[]){
        QueueB Q = new QueueB(5);
        Q.print();
        Q.Additem(1);
        Q.Additem(2);
        Q.Additem(3);
        Q.Additem(3);

        Q.print();
        Q.removeitem();
        Q.print();
    }
    
}

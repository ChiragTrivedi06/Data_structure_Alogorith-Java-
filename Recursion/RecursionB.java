// package Recursion;

public class RecursionB {

    public static void printAscending(int n){
        if(n==1){
            System.out.print(n +" ");
            return ;
        }

        System.out.print(n+" ");
        printAscending(n-1);
         System.out.print(n+" ");
         
    } 
    public static void printDesending(int n){
        if(n==1){
             System.out.print(n +" ");
            return ;
        }
        System.out.print(n+" ");
        printDesending(n-1);
        // return;
    }

    public static int geFibvalue(int n){
        if(n==0||n==1){
            // System.out.print(n+"");
            return n;
        }
        // System.out.print(+" ");
        int result = geFibvalue(n-1)+geFibvalue(n-2);
        //  System.out.print(result+" ");

        return result;
    } 
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = n *factorial(n-1);
        return fact;
    }
    public static void print(int arr[],int i){

        if(i==arr.length)
            return ;
        
       
        print(arr, i+1);
          System.out.print(arr[i]+" ");
       


    }
    public static void print1(int arr[],int size){
        if(size==0)
          return;
        System.out.print(arr[0]+" ");
        
        print(arr, size-1);
    }
    public static void main(String args[]){
         System.out.println(geFibvalue(7));
        printAscending(10);
        System.out.println();
        printDesending(10);
        System.out.println();

        System.out.println(factorial(6));


        int arr[]= {20,30,40,50,23};
        print(arr, 0);

        
    }
    
}

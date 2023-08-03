//package Backtracking;

public class arr_back {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public  static void changeValue(int arr[],int i){
        
        if(i==arr.length){
            return ;
        }
      
        changeValue(arr, i+1);
        arr[i]=arr[i]-2;

        
    }
    public static void main(String args[]){
        int ar[]={1,2,3,4,5};
        printArr(ar);
        changeValue(ar, 0);
        printArr(ar);

        
    }
    
}

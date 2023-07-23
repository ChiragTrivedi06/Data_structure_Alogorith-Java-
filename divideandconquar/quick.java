public class quick {
    public static void printArr(int arr[]){

        for(int  i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void QuickSort(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }

        // find pivot  
        int pivotindex = partition(arr,si,ei);
        // System.out.println(pivotindex);
        QuickSort(arr, si, pivotindex-1);   
        QuickSort(arr,pivotindex+1,ei);


    }
    public  static int partition (int arr[],int si,int ei){

        int pivot  =  arr[ei];
        int i=si-1;  // to make place for element less than pivot

        for(int j=si;j<=ei;j++){
            if(arr[j]<pivot){
                
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
  
            }
        }

        i++;
        int temp=pivot;  
        arr[ei]=arr[i];   //pivot =arr[i] is  not correct;
        arr[i]=temp;   
        return i;



    }
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5,-2};
        printArr(arr);
        QuickSort(arr, 0, arr.length-1);
        printArr(arr);


    }
    
    
}

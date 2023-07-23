//package dsa.divideandconquar;

public class merge {

    public static void mergesort(int arr[] ,int si,int ei){

      if(si >=ei){
        return;
      }
  
      // kaam karna he
      int mid =si + (ei-si)/2;  //(si+ei)/2
      mergesort(arr,si,mid);   // left part 
      mergesort(arr, mid+1, ei);  // right part
    

      // helper fuction for mergeing process -->

      merge1(arr,si,ei);      // merge left and right part at evry step after coming back


    }

    public static void merge1(int arr[],int si,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;  //iterator  for left part
        int mid=si+ (ei-si)/2;
        int j=mid+1;//iterator for right part
        int k=0;     // iterator for temprary array

        while(i<=mid &&  j<=ei){

            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                
                i++;
            
            }
            else{
                temp[k]=arr[j];
                
                j++;
            }
            k++;


        }

       //left part if not empty
        while(i  <=mid){
            temp[k++]=arr[i++];
           

        }

        // rigth part if not empty
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        
        for( k=0, i=si;k < temp.length;k++,i++){   // copy temp  arr after every step of merge to original arr
            arr[i]=temp[k];
            //k++;


        }


    }

    public static void printArr(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){


        int number[]={2,5,4,3,2,5,-31};
        printArr(number);
        mergesort(number, 0, number.length-1);
        printArr(number);
    }
    
}

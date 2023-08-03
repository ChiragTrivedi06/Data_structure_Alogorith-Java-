import java.util.ArrayList;
public class monotonic {

    public static boolean checkmonotone(ArrayList<Integer> arr ){
        if(arr.get(0)>arr.get(1)){
              for(int i=1;i<arr.size()-1;i++){
                  if(arr.get(i)< arr.get(i+1)){
                      return false;
                  }

              }

        }
        else{
             for(int i=1;i<arr.size()-1;i++){
                  if(arr.get(i)> arr.get(i+1)){
                      return false;
                  }

              }

        }
        return true;
      
    }

    public static boolean number(ArrayList<Integer> list,int key ){

        for(int i=0;i<list.size();i++){
            if(list.get(i)==key-1 || list.get(i) ==key+1){
                return true;
            }
        }
        return false;

    }

    public static ArrayList<Integer> checklonely(ArrayList<Integer> ll){
        ArrayList <Integer> list = new ArrayList<>();

        for(int i=0;i<ll.size();i++){
           if(!number(ll,ll.get(i))){
               list.add(ll.get(i));
              
           }


        }
        return list;
    }
    public static void main(String args[]){
        ArrayList<Integer> ll= new ArrayList<>();

        ll.add(7);
        ll.add(5);
        ll.add(3);
        ll.add(8);
        System.out.println(ll);
        System.out.println(checkmonotone(ll));
        System.out.println(checklonely(ll));
    }
    
}

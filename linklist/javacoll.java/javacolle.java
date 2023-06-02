import java.util.LinkedList;
import java.util.ArrayList;


public class javacolle {
    public static void main(String args[]){
    
        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(0);
        System.out.println(ll);
        ll.add(2,null);
        System.out.println(ll);
        ll.removeFirstOccurrence(1);
        System.out.println(ll);   
     }

    
}

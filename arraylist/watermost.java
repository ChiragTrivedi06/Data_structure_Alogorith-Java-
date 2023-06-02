//package dsa.arraylist;

import java.util.ArrayList;



public class watermost {
    public static int maxwater(ArrayList<Integer>list) {

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                
                max=Math.min(list.get(i), list.get(j));

            }
        }
        
    }

    public static void main(String[]args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(list);

        
    }
    
}

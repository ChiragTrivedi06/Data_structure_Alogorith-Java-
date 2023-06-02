//package arraylist;

import java.util.ArrayList;

    public class twolist {
        public static void main(String[]args){
            ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
    
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<>();
            ArrayList<Integer> list3 = new ArrayList<>();
          
            for(int i=1;i<5;i++){
                list1.add(1*i);
                list2.add(2*i);
                list3.add(3*i);

            }
            list.add(list1);
            list.add(list2);
            list.add(list3);
            list2.remove(2);
            list2.remove(3);
            list3.remove(3);

       
            for(int i=0;i<list.size();i++){
                ArrayList <Integer> currlist=list.get(i);
                for(int j=0;j<currlist.size();j++){
                    System.out.print(currlist.get(j)+" ");
                }
                System.out.println();
            }
            System.out.println();





           
            // list1.add(1);
            // list1.add(2);
            // list1.add(3);
            // list1.add(4);
    
            // list2.add(2);
            // list2.add(4);
            // list2.add(6);
            // list2.add(8);
    
            System.out.println(list);
            System.out.println(list2);
    
    
    
       }
        
    }
    






public class strintrp {
    public static boolean palind(String str) {
        int a=0,b=str.length()-1;
       // boolean c=true;
        while(a<=b){
            if(str.charAt(a)!=str.charAt(b)){
                // c=false;
                // break;
                return false;
            }
            a++;
            b--;
        }
       // return c;
       return true;
    
        
    }
    public static void main(String args[] ) {

    //    String str=new String("fknifeifc fjifchi \nmdlflamf");


       // Scanner sc = new Scanner(System.in);
        // System.out.println(str);
    //      String s=sc.next();
    //     System.out.println(s);
    //   String s1=sc.next(str3);
    //   System.out.println("s1");
//          String s1= sc.nextLine();
//          System.out.println(s1);
//          String s2="chirag";
//          String s3=s1+s2;
//          System.out.println(s3);

//          System.out.println(s2.charAt(3));
//   boolean b=true;
//          for(int i=0;i<s2.length();i++){
//             if(s2.charAt(i)=='r'){
//                   b=false;
//             }
//          }

//          System.out.println(b);


          String str = "naman";
          char c[]={'c','h','i','r','a','g'};
          System.out.println(c.length);
          System.out.println(str.length());
          System.out.println(palind("chirag"));


    }
  
    
}

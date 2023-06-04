import java.util.Scanner;

public class strcompare {
    public static void main(String[] args) {
        String s1="chirag";
        String s2="chirag";
        String s3=new String("chirag");

        Scanner sc=new Scanner(System.in);
        String s4=sc.next();

        if(s1.equals(s4)){
            System.out.println("equal");
            
        }
        else
        System.out.println("not equal");


        if(s4==s3)
        System.out.println("true");
        else
        System.out.println("false");

        if(s4.equals(s3)){
            System.out.println("yes");
        }
        else
        System.out.println("no");
    }
    
}

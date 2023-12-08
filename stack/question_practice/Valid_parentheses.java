import java.util.Scanner;
import java.util.Stack;

public class Valid_parentheses {
     


    public static boolean   ValidParentheses(String S){
        Stack <Character> str = new Stack<>();
        int n=S.length();

        for(int i=0;i<n;i++){

             if(S.charAt(i)=='('  || S.charAt(i)=='[' || S.charAt(i)=='{'){
             str.push(S.charAt(i));
            }
            else{
                if(str.isEmpty()){
                    return false;
                }
                 
                if((S.charAt(i)==')' && str.peek()=='(') ||(S.charAt(i)==']' && str.peek()=='[') || (S.charAt(i)=='}' && str.peek()=='{')){
                    str.pop();
                }
                 else{
                    return false;
                }

            }
        }

        if(str.isEmpty()){
            return true;
        }
        else{
            return false;
        }
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        // boolean b=Valid_parentheses();

        System.out.println( ValidParentheses(s));


   }

  
    
}

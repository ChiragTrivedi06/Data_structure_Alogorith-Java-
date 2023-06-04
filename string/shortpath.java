import javax.lang.model.util.ElementScanner14;

public class shortpath {

    public static void path(String str) {
        double a=0,b=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                 b++;
            }
            else if(str.charAt(i)=='S'){
                b--;
            }
            else if(str.charAt(i)=='E'){
                a++;
            }
            else {
                a--;
            }
        }

        double path=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

         System.out.println(path);

        
    }

    public static void main(String args[]){
             path("WNEENESENNN");
    }
    
}

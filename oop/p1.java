// package dsa.oop;

public class p1 {
    static class pen{
        String  color;
        int tip;
        pen(String color , int tip){
            this.color = color;
            this.tip= tip;
        }

        void changecolor(String newcolor){
            this.color = newcolor;
        }
    }

    public static void main(String args[]){
        pen p1 = new pen("red", 1);
        // System.out.println(p1.color);
        p1.changecolor("pink");
        System.out.println(p1.color);

    }


    
}

import java.lang.*;
public class Day37P1 {
    public static void main(String[] args) {
        try{
            try{
                int a=9,b=0;
                System.out.println("Divison is :"+a/b);
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            try{
                String s=null;
                System.out.println(s.length());
            }
            catch(NullPointerException e){
                System.out.println(e.getMessage());
            }
            try{
                int[] c={9,8,7,65,3};
                System.out.println(c[5]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
        finally{
            System.out.println("This is finally block");
        }
    }
    
}

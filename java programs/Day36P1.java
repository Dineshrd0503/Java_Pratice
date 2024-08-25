import java.util.*;
public class Day36P1{
    public static void main(String[] args){
        System.out.println("exhibiting exceptions");
        try{
            List<Integer> a=Arrays.asList(1,2,3,45);
            for(int i: a)
            System.out.println(i);
            System.out.println("accesing element at index 5");
    
                System.out.println(a.get(5));
                
                
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            }
            try{
                String name=null;
                System.out.println(name.length());
            }
           
            catch(NullPointerException e){
                System.out.println(e.getMessage()+"null pointer exception ");
    
            }
            try{
            System.out.println(5/0);
            }
        
        
        catch(ArithmeticException e){
            System.out.println(e.getMessage()+"Arithmetic exception ");
        }
        try {
            Class.forName("NonExistentClass");
            System.out.println("Class Not Found Exception");
            
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try{
        System.out.println(Integer.parseInt("abc"));
        }
        catch(NumberFormatException e) {
            System.out.println(e.getMessage());
    }
    }
}
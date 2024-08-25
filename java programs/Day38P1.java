import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Day38P1 {
    public static void main(String[] args) {
        System.out.println("exhibiting throw and throws");
        throwdemo();
        try{
        throwsdemo();
        }
        catch(IOException e){
            System.out.println("Exception caught");
            }

    }
    public static void throwdemo(){
        int a=9,b=0;
        try{
            if(b==0)
            throw new ArithmeticException("cannot divide by 0");
            else
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
    }
    
}
public static void throwsdemo() throws IOException{
    Scanner sc=new Scanner(System.in);
    FileReader file = new FileReader("nonexistentfile.txt");

}
}    
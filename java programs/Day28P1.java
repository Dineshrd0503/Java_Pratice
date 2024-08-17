import java.util.*;
class dog{
    String tail="dog has tail";

}
class cat{
    String tail="cat has tail";
}
public class Day28P1{
    public static void main(String[] args){
        System.out.println("exhibting polymorphism in java");
        System.out.println("demosntating on variables");
        List<Object> animals=new ArrayList<>();
        animals.add(new dog());
        animals.add(new cat());
        for(Object animal:animals){
            System.out.println(((animal instanceof dog)?"dog":"cat")+" has tail");
        }
        
        

    }
    
}
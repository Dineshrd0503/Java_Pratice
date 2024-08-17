// Online Java Compiler
// Use this editor to write, compile and run your Java code online
interface a{
    public abstract void color();
}
interface b{
    public abstract void furr();
}
class dog implements a,b{
    public void color(){
        System.out.println("black color");
    }
    public void furr(){
        System.out.println("smooth furr");
    }
}
public class Main {
    
    public static void main(String[] args) {
        System.out.println("implementing multilevel inheritance");
        dog d=new dog();
        d.color();
        d.furr();
        
    }
}
class animal{
    public animal(){
        System.out.println("animal constructor");
    }
    public void display(){
        System.out.println("in animal class");
    }
}
class dog extends animal{
   public dog(){
       super();
       System.out.println("dog constructor");
       
   }
    public void display1(){
        System.out.println("in dog class method");
}
}
class cat extends animal{
    public cat(){
    super();
    System.out.println("cat constructor");
    }
    public void display2(){
        System.out.println("in cat class method");
}
}
public class Day32P1{
    public static void main(String[] args){
        System.out.println("exhibting heirachal inheritace");
        dog d = new dog();
        d.display();
        d.display1();
        cat c=new cat();
        c.display();
        c.display2();
    }
}
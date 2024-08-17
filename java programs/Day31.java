
class cat{
    public void sound(){
        System.out.println("animal sounds meow");
    }
}

class dog extends cat{
    public void tail(){
        System.out.println("dog has tail");
    }
    
}
public class Day31{
    public static void main(String[] args) {
        System.out.println("exhibiting inherotance");
        cat obj=new cat();
        obj.sound();
        dog obj1=new dog();
        obj1.sound();
        obj1.tail();
     }
}
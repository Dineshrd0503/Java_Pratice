public class Day25P1{
    public static int age=21;
    public static void main(String[] args){
        System.out.println("demosnstratng use of sttaic varaibles");
        
        System.out.println("your age is gloabal methos :"+age);
        fun();

    }
    public static void fun(){
        age=40;
        System.out.println("age is locla method :"+age);
    }
}
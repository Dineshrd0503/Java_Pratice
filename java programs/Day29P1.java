class a{
    public int addition(int a,int b){
        return a+b;
    }
    public float addition(float a,float b){
        return a+b;
    }
}
public class Day29P1{
    public static void main(String[] args){
        System.out.println("exhibiting compile time polymorphism");
        a obj=new a();
        System.out.println("integer addition is "+obj.addition(10,20));
        System.out.println("float addition is "+obj.addition(10.5f,20.98f));
    }
}
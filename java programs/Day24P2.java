public class Day24P2{
    public static void main(String[] args) {
        System.out.println("demonstrating var keyword in java");
        var name="gopi";
        System.out.println("name is: "+name);
        var age=25;
        var city=new String("rajahmunry");
        System.out.println("age is: "+age);
        System.out.println("city is: "+city);
        var numbers = new int[]{1, 2, 3, 4, 5}; 
        System.out.println("Array elements:");
        for (var number : numbers) {
            System.out.println(number);
        }
        System.out.println("city is: "+city);
}
}
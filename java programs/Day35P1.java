public class Day35P1 {
    private int x = 10;

    public class InnerClass {
        private int y = 20;

        public void printValues() {
            System.out.println("Outer class variable x: " + x);
            System.out.println("Inner class variable y: " + y);
        }
    }

    public static void Day35P1(String[] args) {
        Day35P1 outer = new Day35P1();
        Day35P1.InnerClass inner = outer.new InnerClass();

        inner.printValues();
    }
}
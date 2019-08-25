public class Testing_1 {
    public static void main(String [] ags) {
        B obj = new A();
        obj.print_1(3, 4);
    }
    }

class B {
    public void print_1(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }
}
class A extends B{
    public void print_1(int a, int b) {
        System.out.println("Class Overriden");
    }
}
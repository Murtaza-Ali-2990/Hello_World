import java.util.Scanner;

public class Calculator {

    private double x, y;


    public void getData() {
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        y = scan.nextDouble();
    }

    protected double add() {
        return x + y;
    }
    protected double subtract() {
        return x - y;
    }
    protected double multiply() {
        return x * y;
    }
    protected double divide() {
        return x / y;
    }
}

class MainClass {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        calculate.getData();

        System.out.println(calculate.add());
        System.out.println(calculate.subtract());
        System.out.println(calculate.multiply());
        System.out.println(calculate.divide());
    }
}
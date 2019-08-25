import java.util.Scanner;

public class Day4 {
    public static void main(String[] srgs) {
        String value = "2354.83475292";
        float num = Float.parseFloat(value);
        System.out.println(num);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your ID : ");
            long ID = scanner.nextLong();
            System.out.println("Enter the perc. : ");
            double prec = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter your DOB : ");
            String DOB = scanner.nextLine();
            System.out.println(name + " with ID " + ID + " has percentage " + prec + " and DOB is " + DOB + " here.");
        scanner.close();
    }
}
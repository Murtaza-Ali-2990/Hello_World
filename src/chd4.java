import java.util.Scanner;

public class chd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, num,counter=1;
        System.out.println("Enter the 10 numbers");
        while(counter <= 10) {
            System.out.println("Enter the "+ counter + " number : ");
            boolean check = scanner.hasNextInt();
            if(check) {
                num = scanner.nextInt();
                sum  += num;
                counter ++;
            }
            else
                System.out.println("Enter valid number");
            scanner.nextLine();
        }
        System.out.println("The sum is = " + sum);
        scanner.close();
    }
}

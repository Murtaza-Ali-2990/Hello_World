import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, num;
        while(true) {
            System.out.println("Enter number : ");
            boolean check = scan.hasNextInt();
            if(check) {
                num = scan.nextInt();
                if(num>max)
                    max = num;
                if(num<min)
                    min = num;
            }
            else
                break;
            scan.nextLine();
        }
        System.out.println("The minimum number is " + min + " and maximum is "+ max);
    }
}

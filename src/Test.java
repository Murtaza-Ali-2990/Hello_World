import java.util.Scanner;

public class Test {

    private int[] score = new int[5];

    public void inputScore() {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5;) {
            score[i] = scan.nextInt();
            if(score[i] >= 0 && score[i] <= 100)
                i++;
            else
                System.out.println("Invalid test score\n");
        }
    }

    public float getAverage() {
        int sum = 0;
        for(int i : score) {
            sum += i;
        }
        return (float)sum / 5;
    }

    public int highest() {
        int max = -1;
        for(int i : score) {
            if(i > max)
                max = i;
        }
        return max;
    }
}


class MainClass2 {
    public static void main(String [] arhs) {
        Test test = new Test();
        test.inputScore();

        System.out.println(test.highest());
        System.out.println(test.getAverage());
    }
}
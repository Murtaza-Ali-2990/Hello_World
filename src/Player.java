import java.util.Scanner;

public class Player {

    private String name, teamName;
    private float average;

    public Player() {
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        teamName = scan.nextLine();
        average = scan.nextFloat();
    }

    public Player(String name, String teamName, float average) {
        this.name = name;
        this.teamName = teamName;
        this.average = average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void getAverage() {
        System.out.println(average);
    }

    public void getName() {
        System.out.println(name);
    }

    public void getTeamName() {
        System.out.println(teamName);
    }
}
import java.util.Scanner;

public class Assignment_2_e {
    public static void main(String[] args) {

    }
}

class Employee {
    private double leavePerMonth;
    private double initialSalary;
    private int salaryHike;

    public void setSalaryHike(int salaryHike) {
        this.salaryHike = salaryHike;
    }

    public int getSalaryHike() {
        return salaryHike;
    }

    public void setInitialSalary(double initialSalary) {
        this.initialSalary = initialSalary;
    }

    public void setLeavePerMonth(double leavePerMonth) {
        this.leavePerMonth = leavePerMonth;
    }

    public double getInitialSalary() {
        return initialSalary;
    }

    public double getLeavePerMonth() {
        return leavePerMonth;
    }
}

class Manager extends Employee{

    Manager() {
        System.out.println("Enter the designation(digit)\n1. HR\n2. Technology");
        Scanner scan = new Scanner(System.in);
        initializeData(scan.nextInt());
    }

    void initializeData(int designation) {
        setInitialSalary(12);

        if(designation == 1) {
            setLeavePerMonth(2.5);
            setSalaryHike(20);
        }
        else {
            setLeavePerMonth(2.5);
            setSalaryHike(30);
        }
    }
}

class Engineer extends Employee{

    Engineer() {
        System.out.println("Enter the designation(digit)\n1. Developer\n2. Tester\n3. Architect");
        Scanner scan = new Scanner(System.in);
        initializeData(scan.nextInt());
    }

    void initializeData(int designation) {
        if(designation == 1) {
            setInitialSalary(10);
            setLeavePerMonth(3);
            setSalaryHike(40);
        }
        else if(designation == 2) {
            setInitialSalary(6);
            setLeavePerMonth(2.5);
            setSalaryHike(10);
        }
        else {
            setInitialSalary(12);
            setLeavePerMonth(4);
            setSalaryHike(50);
        }
    }

    public void getData(int year, int month) {
        double salary = getInitialSalary();
        for(int i = 0; i < year; i++) {
            salary += salary*getSalaryHike()/100;
        }
    }
}

class Researcher extends Employee{

    Researcher() {
        System.out.println("Enter the designation(digit)\n1. Data Science\n2. Analytics\n3. Cloud");
        Scanner scan = new Scanner(System.in);
        initializeData(scan.nextInt());
    }

    void initializeData(int designation) {
        setInitialSalary(15);

        if(designation == 1) {
            setLeavePerMonth(4);
            setSalaryHike(60);
        }
        else {
            setLeavePerMonth(3);
            setSalaryHike(40);
        }
    }
}
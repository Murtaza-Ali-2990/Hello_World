public class Assignment_2_a {
    public static void main(String[] args) {
        Date date1 = new Date();
        date1.setDay(29);
        date1.setMonth(9);

        System.out.println("Birthday :" + date1.getDay() + "/" +date1.getMonth());

        Date date2 = new Date(2, 9, 2005);
        date2.displayDate();
    }
}

class Date {
    private int month, day, year;

    Date() {
        month = 1;
        day = 1;
        year = 2000;
    }

    Date(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class inch {
    public static void main(String[] args) {
        double ret1,ret2;
        ret1=calc(4.25,10.5);
        ret2=calc(45.5);
        System.out.println("RET1 = " + ret1 + " and RET2 = "+ ret2);

        String time;
        time = gettime(256,46);
        System.out.println("\nTime is " + time);
        time = gettime(36271);
        System.out.println("The time is "+ time);

        System.out.println("Even num is " + iseven(46));
    }
    public static boolean iseven(int num) {
        if(num%2==0)
            return true;
        else
            return false;
    }
    public static String gettime(int mins,int secs) {
        if(mins>=0&&secs>=0&&secs<60) {
            int hours;
            hours = mins/60;
            mins%=60;
            return hours + "h " + mins + "m " + secs + "s";
        }
        else
            return "Invalid Time";
    }
    public static String gettime(int secs) {
        if(secs>=0) {
            int min=secs/60;
            secs%=60;
            return gettime(min,secs);
        }
        else
            return "Invalid time";
    }
    public static double calc(double p1,double p2) {
        if(p1>=0&&p2>=0&&p2<=12)
            return p1*12*2.54 + p2*2.54;
        else
            return -1;
    }
    public static double calc(double q2) {
        if(q2>=0) {
            double q1=0;
            while(q2>12) {
                q2-=12;
                q1++;
            }
            return calc(q1,q2);
        }
        else
            return -1;
    }
}

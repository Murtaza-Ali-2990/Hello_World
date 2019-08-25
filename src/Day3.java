public class Day3 {
    public static void main(String[] args) {
        calc("Tim",50);
        calc(56,786);
        calc(2234,2.435,'a');
        calc(554.3275,7,'q');
        calc();
        calc(25);


    }
    public static void calc(int lvl) {
        System.out.println("noob level "+lvl);
    }
    public static int calc() {
        System.out.println("Lol no input");
        return -1;
    }
    public static int calc(String name,int score){
        System.out.println(name + " Scored " + score);
        return score*10;
    }
    public static int calc(int lvl,int score) {
        System.out.println("The bonus is "+ (lvl*score));
        return lvl*score;
    }
    public static int calc(int score,double time,char ch) {
        System.out.println("Char "+ ch + " is "+ score*time);
        return (int)time*2;
    }
    public static int calc(double taken,int path,char ch) {
        System.out.println("Holy Shit "+ch);
        return path*(int)taken;
    }
}

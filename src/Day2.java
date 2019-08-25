public class Day2 {
    public static void main(String[] args) {
        int score=10000, bonus=200, lvl =6;
        calcscore(score,bonus,lvl);
        score=2000;
        bonus=50;
        lvl=24;
        calcscore(score,bonus,lvl);

        score=1500;
        int pos=playerscore(score);
        playername("Richard Jones",pos);
        score=900;
        pos=playerscore(score);
        playername("Anthony Baker",pos);
        score=350;
        pos=playerscore(score);
        playername("Tony Clinton",pos);
        score=15;
        pos=playerscore(score);
        playername("Will Smith",pos);
    }
    public static void calcscore(int sc,int bon,int lvl)
    {
        long newscore=sc + bon*lvl +2000;
        System.out.println("The score is "+newscore);
    }
    public static void playername(String name,int position)
    {
        System.out.println(name + " managed to get in position " + position + " on the table");
    }
    public static int playerscore(int score)
    {
        if(score>1000)
            return 1;
        else if(score<1000&&score>500)
            return 2;
        else if(score<500&&score>100)
            return 3;
        else
            return 4;
    }
}

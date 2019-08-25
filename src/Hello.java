public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World !");

        String a = "Hello";
        int num=3;
        float fl = 23.54f;
        float cl=fl*num;
        System.out.println("The number is = "+num);
        System.out.println(fl);
        System.out.println(cl);
        byte byv=64;
        short vars=3450;
        long lvalue=50000 + 10*(byv + vars + num);
        System.out.println(lvalue);
        double pounds = 6.24;
        double kilo=pounds*0.45359237;
        System.out.println(kilo);
        char newv = '\u00AE';
        System.out.println("Here is the character = "+newv);
        char c='a';
        int abc=c;
        System.out.println(abc);
        a=a+num;
        System.out.println(a);
        System.out.println(fl+" "+num+" "+a);
        boolean Alien=false;
        if(Alien==false) {
            System.out.printf("This is not an Alien");
        }
        double n1=20, n2=80, ns=(n1+n2)*25, tot=ns%40;
        if(tot<=20)
            System.out.println("Over the limit");
    }
}

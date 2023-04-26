package Ceshi;

public class Test1 {

        int a;
        float num;
        String name;
        static void eat(){
            Test1 hh=new Test1();
            hh.a=14;
            hh.name="hh";
            hh.num= 13.14F;
            System.out.println("age="+(hh.a)+"name="+(hh.name)+"num="+(hh.num));
        }
        static void run(){
            Test1 hg=new Test1();
            hg.a=19;
            hg.name="nb";
            hg.num=76.64f;
            System.out.println("age="+(hg.a)+"name="+(hg.name)+"num="+(hg.num));
        }

    public static void main(String[] args) {
     eat();
     run();
    }
    }


package Ceshi;
/*
类 是对某一个类事物的描述，是对这一类事物共有属性和方法的抽象的，概念上的定义
类的定义包括两大部分
属性 是一类事物的静态特征，用数据描述。在类中，我们用变量或者其他类型的对象来体现
方法 是一类事物的行为或功能特征，在类中，我们用方法来体现，也就是一段可重复调用的业务逻辑代码来表示

 */
/*类的定义
修饰符 class 类名{
成员属性;
成员方法;}
 */


/*
类的属性 学生类 （姓名，年龄，学号，学分（属性）） 类的方法 学生类（学习课程，参加活动，玩游戏（行为特征（方法）））
 */
public class Student {
    //定义了个类Student

    //类的属性
    String sid;
    String sname;
    int age;
    double credit;
    public  Student(){
        /*  如果在定义类的时候，没有自己定义构造方法，那么java的编译器会默认提供一个没有任何参数的构造方法，这个方法为所有的基本类型赋予默认值，为引用类型的属性赋予null值
        如果定义类的时候，自定义了构造方法，那么java的编译器不再提供方法所以建议自己定义那个无参的
            一个类可以有多个与类同名，无返回值的构造方法，这种现象，称作构造方法的重载，重载是面向对象的基本特征之一，它要求多个同名的方法必须具有不同的参数
         */
    }
    //有参构造方法
    public  Student(String id,String n,int a,double c){
        sid =id;
        sname=n;
        age=a;
        credit=c;
    }
    //类的方法
 void studing(){
     System.out.println("正在学习ing");
     credit+=1.0;
 }//行为特征
    void contest(){
     System.out.println("参加竞赛");
     credit+=2;
    }
}

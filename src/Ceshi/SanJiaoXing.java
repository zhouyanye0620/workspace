package Ceshi;

public class SanJiaoXing {
    double a;
    double b;
    double c;
    public  SanJiaoXing(){

    }
    public  SanJiaoXing(double x,double y, double z) {
        a=x;
        b=y;
        c=z;

    }
    double getCircum(){
        return a+b+c;
    }
    double getArea(){
        double p=(a+b+c)/2;
        return  Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
/*
修饰符  定义 修饰符是出现在类，属性，方法前面，起到修饰作用
作用 是用来限制访问权限，继承性，异步性等特征的 是为了提高代码的安全性而引入的机制
注意 类，属性，方法都有自己的修饰符，同一个修饰符在修饰不停的对象，含义也有可能是不同的
权限修饰符包括  缺省（默认的） 类，属性，方法均可使用  访问权限 当前包（当前文件夹）中的类可以访问
 public（公共的）  类，属性，方法均可使用  访问权限 最大访问权限，在任何一个类中被调用
 protected（保护的）属性，方法可使用，访问权限 当钱包及其子类中可以调用
 private（私有的）属性，方法可使用 访问权限 只能在定义的类中使用，其他类中不能调用
 */
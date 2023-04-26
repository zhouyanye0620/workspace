package Ceshi;

import java.util.Scanner;

public class Stu1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入正方形的周长：");
        double z = in.nextDouble();
        B one = new B(z);
        System.out.printf("正方形的面积为：%.4f",one.mian(z));
        System.out.println("请输入圆形的周长：");
        double y = in.nextDouble();
        C two = new C(y);
        System.out.printf("圆的面积为：%.4f",two.mian(z));
    }

}
abstract class A{
    double z;
    public A(double z){
        this.z =z;
    }
    abstract double mian(double z);
}
class B extends A{
    public B(double z){
        super(z);
    }
    @Override
    double mian(double z) {
        return 0.0625 *z*z;
    }
}
class C extends A{
    public C(double z){
        super(z);
    }
    @Override
    double mian(double z) {
        return 0.0795 *z*z;
    }
}
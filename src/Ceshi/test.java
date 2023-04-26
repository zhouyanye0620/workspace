package Ceshi;

/*
编程程序计算圆的周长和面积，要求如下：

1、定义两个接口，并且在这两个接口中声明一个同名圆周率

2、一个接口定义面积的实现方法；一个接口定义周长的实现方法

3、定义一个类同时实现这两个接口，半径由用户输入 */

import java.util.Scanner;//导入java的scanner包
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("请输入圆的半径：");
            double r = input.nextDouble();
            Maing a = new Maing(r);
            System.out.printf("面积为：%.2f周长为：%.2f\n",a.yuanmianji(),a.yuanzhouchang());
            System.out.println("=============================");
            System.out.println("请选择：1.退出程序；2.继续计算");
            int b = input.nextInt();
            if(b==1){
                System.out.println("程序已退出!");
                break;
            }
        }
    }
}
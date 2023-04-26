package com.xyq;

public class Test {
    public static void main(String[] args) {
        Member m=new Member();
        m.login();
        Admin admin=new Admin();
        admin.login();
    }
    /*
继承 子类可以自动拥有父类中除了私有内容外的其他所有内容
当出现x是是一种y的适合，x就可以继承y
黑熊怪是一种妖怪
public class 类extends 父类{
}
作用 简化代码的开发 子类对父类进行了扩展
Java 中的继承就是在已经存在类的基础上进行扩展，从而产生新的类。已经存在的类称为父类、基类或超类，而新产生的类称为子类或派生类。在子类中，不仅包含父类的属性和方法，还可以增加新的属性和方法。
 */
}

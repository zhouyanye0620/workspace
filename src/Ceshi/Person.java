package Ceshi;

public class Person {
    //创建类
    String name;
    int age;


    public void show() {
        System.out.println("我叫"+name+"我几年"+age+"岁了");
    }

    public static void main(String[] args) {
        Person stu=new Person();
        stu.name="liu";
        stu.age=20;
        stu.show();
    }
}
package jicheng;

public class Person {

    private String name;
     private int age;
     private String sex;
    public Person(String name, int age, String sex) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;

    }
    public void showInfo(){
        System.out.println("姓名:"+name+",年龄:"+age+",性别:"+sex);
    }
    /*public void showInfo(double qian){
        System.out.println("姓名:"+name+",年龄:"+age+",性别:"+sex+"工资"+qian);
    }*/
}

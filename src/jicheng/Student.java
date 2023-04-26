package jicheng;

public class Student extends Person {

 double fenshu=65.0;

    public Student(String name, int age, String sex ) {
        super(name, age, sex);
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("分数:"+fenshu);
    }
    }


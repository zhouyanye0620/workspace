package jicheng;

public class Teacher extends Person {
  double qian=5500.0;

    public Teacher(String name, int age, String sex) {
        super(name, age, sex);

        }
    public void showInfo(){
        super.showInfo();
        System.out.println("工资:"+qian);
    }


}



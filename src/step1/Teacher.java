package step1;

import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        student a = new student();
        Scanner input = new  Scanner(System.in);
        a.setAge(input.nextInt());
        a.name = "雄安";
        a.sell();

    }
}
class student{
    String name;
    private int age;
    public String gteName(){
        return name;
    }
    public void setAge(int age){
        if(age<22){
            System.out.println("错误！最小年龄应为22岁,已改为默认值");
            this.age = 22;
        }else{
            this.age = age;}
    }
    public void sell(){
        System.out.println("大家好！我叫"+name+"我今年"+age+"岁");
    }
}
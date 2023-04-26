package workspace;

public class Stu {
//    public static void main(String[] args) {
//        //创建对象a
//        student a = new student();
//        //通过对象进行赋值
//        a.age = 10;
//        a.name = "小米";
//        //执行方法
//        //a.xin();
//
//    }
//}
////创建方法
//class student{
//    String name;
//    int age;
//    void xin(){
//        System.out.println(name+"在学校今年"+age);
//    }
//
//}

    public static void main(String[] args) {
        student a = new student();
        a.setName("小红");
        a.age = 19;
        System.out.println(a.gteName()+a.age+"岁");
    }
}
    class student{
        private String name;//将属性私有化
        int age;
        public String gteName(){//返回姓名
            return name;
        }
        public void setName(String name){//设定姓名
            this.name = name;//
        }
    }

    /*在同一个包下:TeacherTest
1) 编写一个类，代表教员，要求:
>具有属性:姓名、年龄
>具有行为:自我介绍
>教员的最小年龄要求:22岁
2)编写一个测试类，实例化一个教员对象，并对其初始化在控制台输出该教员的自我介绍·通过对属性的封装来实现教员的最小年龄要求，如果赋值时不符合年龄要求，则赋予默认值22岁·提示:在测试类中设置姓名为李芳，年龄为10岁在控制台输出信息示例:
1)如果输入的年龄小于22岁，显示
错误!最小年龄应为22岁，已将年龄设为默认值;大家好!我是李芳，我今年22岁。
2)如果输入的年龄大于22岁，如45，则显示:大家好!我是李芳，我今年45岁。*/

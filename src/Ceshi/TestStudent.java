package Ceshi;


public class TestStudent {
    /*
构造方法是一个与类同盟，无返回值的特殊方法
构造方法的特殊之处主要体现在以下方面
任何一个类都会至少有一个构造方法
与类同名，无返回值
可能有多个不完全相同的构造方法
智能与new配合使用，实现对象属性的初始化
构造方法仅出现对象的声明语句 且必须与new一同使用 作用，是对这个对象的属性进行初始化
 */
    public static void main(String[] args) {
        Student std=new Student();//声明对象std
        std.sid="001";//为指定内存区域中的age属性赋值
        std.sname="周";
        std.age=19;
        std.credit=10.0;
        std.contest();//调用了std的功能性方法
        std.studing();
        System.out.println("学号"+std.sid+"姓名"+std.sname+"年龄"+std.age+"学分"+std.credit);

    }
}
/*类是一种用户定义的引用数据类型
该类型的对象在内存中占据一定的存储空间
该类型的成员需要通过对象名和成员名访问
访问属性 对象名称.属性名
访问方法 对象名称.方法名()
 */

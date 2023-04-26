package Pro;

public class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 22) {
            this.age = age;
        } else {
            System.out.println("错误！最小年龄应为22岁，已将年龄设为默认值。");
            this.age = 22;
        }
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("大家好！我是" + name + "，我今年" + age + "岁。");
    }

}



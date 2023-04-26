package Ceshi;

public class Manager extends Employee {
  String department;
  String position;



    @Override
    public java.lang.String getDetails() {
        return name+gongzi+department;
    }
  public static void main(String[] args) {
    Manager m=new Manager();
    m.name="tom";
    m.gongzi=768;
    m.department="ikun部";
    System.out.println(m.getDetails());
  }
}

package study;
import java.util.Scanner;

public class Stu {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        student a = new student(input.nextDouble(),input.nextDouble());
        System.out.printf("周长是%.2f面积是%.2f",a.z(),a.m());
    }
}
class student{
    private double c;
    private double k;
    public double z(){
        return (c+k)*2;
    }
    public double m(){
        return c*k;
    }
    public student(double i,double j){
        c = i;
        k = j;
    }
}
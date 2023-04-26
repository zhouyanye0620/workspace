package workspace;
//打印6位同学三门课程的平均成绩
import  java.util.Scanner;
public class XiTi3 {
    public  static  void main(String[]args){
            Scanner input=new Scanner(System.in);
            double sum=0;
            for(int i=1;i<=6;i++) {
                sum = 0;
                int j;
                for (j = 1; j <= 3; j++) {
                    System.out.println("请输入第" + i + "个同学第" + j + "门成绩");
                    double a = input.nextDouble();
                    sum += a;

                }

                System.out.println("这是第"+i+"名的总成绩"+sum);
                System.out.println("第" + i + "名同学的平均成绩位" + sum / 3);
            }
        }
    }
 /*       Scanner sc = new Scanner(System.in);
                double sum = 0;
                for (int h = 1; h < 6; h++) {
                    System.out.println("序号:"+h);
                    System.out.print("请输入各科成绩:");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    System.out.println("语文成绩为:" + a + "数学成绩为:" + b + "英语成绩为:" + c);
                    for (int s = 0; s < h; s++) {
                    }
                    sum = sum + (a+b+c);
                    System.out.println("总成绩为:" + (a+b+c));
                    System.out.println(h+"的平均成绩为:"+sum/3);
                 }*/

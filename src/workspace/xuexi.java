package workspace;

import java.util.Scanner;

public class xuexi {

        public static void main(String[] args) {
            Scanner hq=new Scanner(System.in);
            System.out.println("请输入成绩：");
            int q=hq.nextInt();
            if(q>=1&&q<=100) {
                if(q>=90&&q==100) {
                    System.out.println("成绩极好");
                }else if(q>80&&q<=89){
                    System.out.println("成绩优秀");
                }else if(q>=60&&q<=80){
                    System.out.println("成绩一般");
                }	else {
                    System.out.print("成绩不及格");
                }
            }
            else {
                System.out.println("成绩需要在1-100，请重新输入");
            }
        }
    }



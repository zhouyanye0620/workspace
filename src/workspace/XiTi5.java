package workspace;

public class XiTi5 {
    public static  void  main(String[]args){
        double sum=0.0;
        int num=1;
        double num1=1.0;
        while(Math.abs(num1)>1E-6){
            num1=((num%2==0)?-1:1)/Math.pow(num,2);
            sum+=num1;
            num++;
        }
        System.out.println("满足绝对值不大于1E-16的和为："+sum);
    }
}
